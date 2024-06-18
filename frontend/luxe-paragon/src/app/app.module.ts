import { NO_ERRORS_SCHEMA, NgModule } from '@angular/core';
import { AppRoutingModule } from './app.routes';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [
    HttpClientModule
  ],
  bootstrap: [AppModule],
  schemas: [(NO_ERRORS_SCHEMA)]
})
export class AppModule { }
