import { Endereco } from "./enderecos";


export interface Usuario{
  id?:String;
  nome?:String;
  email?:String;
  senha?:String;
  enderecos: Endereco[];
}


