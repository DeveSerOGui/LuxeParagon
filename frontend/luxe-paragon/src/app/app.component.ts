import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { NavbarComponent } from "./componentes/navbar/navbar.component";
import { FooterComponent } from "./componentes/footer/footer.component";
import { CheckoutComponent } from './pages/checkout/checkout.component';
import { NoticiasComponent } from './pages/noticias/noticias.component';
import { CriarContaComponent } from './pages/criar-conta/criar-conta.component';

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, NavbarComponent, FooterComponent,CheckoutComponent, NoticiasComponent, CriarContaComponent]
})
export class AppComponent {
  title = 'luxe-paragon';
}
