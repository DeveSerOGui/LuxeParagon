import { Usuario } from './../model/usuario';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  constructor(private http: HttpClient) {}

  public getUsuario() : Observable<Usuario[]> {
    //return this.httpCliente.get<Artista[]>("http://localhost:8080/artista");
    return this.http.get<Usuario[]>("http://localhost:8080/usuario");
  }

  public criarUsuario (Usuario: Usuario): Observable<Usuario>{
    //return this.httpCliente.get<Artista[]>("http://localhost:8080/artista");
    return this.http.post<Usuario>("mongodb+srv://OutroGui:vSQG1xJAKSZLOi3C@clusterluxeparagon.31izyz9.mongodb.net/?retryWrites=true&w=majority&appName=ClusterLuxeParagon/usuario", Usuario);
  }

}
