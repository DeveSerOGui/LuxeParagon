import { UsuarioService } from './../../services/usuario.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormControl, FormsModule } from '@angular/forms';
import { Usuario } from '../../model/usuario';

@Component({
  selector: 'app-criar-conta',
  standalone: true,
  imports: [FormsModule, HttpClientModule],
  templateUrl: './criar-conta.component.html',
  styleUrl: './criar-conta.component.css'
})
export class CriarContaComponent {

  UsuarioArray : any[] = [];


  nome: string ="";
  email: string ="";
  senha: string ="";

  usuarioAtualID = "";


  constructor(private http: HttpClient )
  {
    // this.getAllStudent();

  }

  register()
  {

    let bodyData = {
      "nome" : this.nome,
      "email" : this.email,
      "senha" : this.senha
    };

    this.http.post("http://localhost:8080/usuario",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("Usuario criado com sucesso");

        this.nome = '';
        this.email = '';
        this.senha  = '';
    });
  }

  save()
  {
    if(this.usuarioAtualID == '')
    {
        this.register();
    }
  }


}
