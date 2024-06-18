import { ProdutosService } from './../../services/produtos.service';
import { CarrinhoService } from './../../services/carrinho.service';
import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-roupas-masculinas',
  standalone: true,
  imports: [HttpClientModule, CommonModule],
  templateUrl: './roupas-masculinas.component.html',
  styleUrl: './roupas-masculinas.component.css'
})
export class RoupasMasculinasComponent implements OnInit {

  public productList : any ;
  public filterCategory : any
  searchKey:string ="";

  ProdutosArray : any[] = [];


  nome: string ="";
  categoria: string ="";
  preco: string ="";
  tamanho: string ="";
  marca: string ="";
  genero: string ="";

  produtoAtualID = "";

  constructor(private http: HttpClient,
              private CarrinhoService : CarrinhoService,
              private ProdutosService: ProdutosService
  )
  {
    this.getAllProdutos();
  }

  ngOnInit(): void {
    this.ProdutosService.getProdutos()
    .subscribe(res=>{
      this.productList = res;
      this.filterCategory = res;
      this.productList.forEach((a:any) => {
        if(a.category ==="women's clothing" || a.category ==="men's clothing"){
          a.category ="fashion"
        }
        Object.assign(a,{quantity:1,total:a.price});
      });
      console.log(this.productList)
    });

    this.CarrinhoService.search.subscribe((val:any)=>{
      this.searchKey = val;
    })
  }

  getAllProdutos()
  {

    this.http.get("http://localhost:8080/produtos")

    .subscribe((resultData: any)=>
    {
        console.log(resultData);
        this.ProdutosArray = resultData;
    });
  }

}
