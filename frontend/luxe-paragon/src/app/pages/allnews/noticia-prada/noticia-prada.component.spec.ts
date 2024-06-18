import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NoticiaPradaComponent } from './noticia-prada.component';

describe('NoticiaPradaComponent', () => {
  let component: NoticiaPradaComponent;
  let fixture: ComponentFixture<NoticiaPradaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [NoticiaPradaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(NoticiaPradaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
