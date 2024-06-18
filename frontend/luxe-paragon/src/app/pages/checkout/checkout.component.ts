import { ProdutosService } from './../../services/produtos.service';
import { CarrinhoService } from './../../services/carrinho.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-checkout',
  standalone: true,
  imports: [],
  templateUrl: './checkout.component.html',
  styleUrl: './checkout.component.css'
})
export class CheckoutComponent implements OnInit {

  public products : any = [];
  public grandTotal !: number;

  constructor(private CarrinhoService: CarrinhoService,
              private ProdutosService: ProdutosService
    ){}

  ngOnInit(): void {
    this.ProdutosService.getProdutos()
    .subscribe(res=>{
      this.products = res;
      this.grandTotal = this.CarrinhoService.getTotalPrice();
    })
  }
  removeItem(item: any){
    this.CarrinhoService.removeCartItem(item);
  }
  emptycart(){
    this.CarrinhoService.removeAllCart();
  }
}
