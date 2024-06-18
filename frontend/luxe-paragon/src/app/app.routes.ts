import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { NgModule } from '@angular/core';
import { CheckoutComponent } from './pages/checkout/checkout.component';
import { NoticiasComponent } from './pages/noticias/noticias.component';
import { RoupasMasculinasComponent } from './pages/roupas-masculinas/roupas-masculinas.component';
import { CriarContaComponent } from './pages/criar-conta/criar-conta.component';
import { RoupasFemininasComponent } from './pages/roupas-femininas/roupas-femininas.component';
import { NoticiaPradaComponent } from './pages/allnews/noticia-prada/noticia-prada.component';
import { NoticiaBrunaComponent } from './pages/allnews/noticia-bruna/noticia-bruna.component';
import { NoticiaRalphlaurenComponent } from './pages/allnews/noticia-ralphlauren/noticia-ralphlauren.component';

export const routes: Routes = [
  { path: "", component: HomeComponent},
  { path: "home", component: HomeComponent},
  { path: "checkout", component: CheckoutComponent},
  { path: "noticias", component: NoticiasComponent},
  { path: "roupash", component: RoupasMasculinasComponent},
  { path: "roupasf", component: RoupasFemininasComponent},
  { path: "signup", component: CriarContaComponent},
  { path: "noticia-prada", component: NoticiaPradaComponent},
  { path: "noticia-bruna", component: NoticiaBrunaComponent},
  { path: "noticia-ralph", component: NoticiaRalphlaurenComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
