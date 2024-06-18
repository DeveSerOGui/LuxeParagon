import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Produto } from '../model/produtos';
import { Observable, map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProdutosService {

  constructor(private http: HttpClient) { }

  public getProdutos() : Observable<Produto[]> {
    //return this.httpCliente.get<Artista[]>("http://localhost:8080/artista");
    return this.http.get<Produto[]>("http://localhost:8080/produtos");
  }
}
