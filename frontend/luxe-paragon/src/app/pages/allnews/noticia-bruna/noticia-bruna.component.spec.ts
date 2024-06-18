import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NoticiaBrunaComponent } from './noticia-bruna.component';

describe('NoticiaBrunaComponent', () => {
  let component: NoticiaBrunaComponent;
  let fixture: ComponentFixture<NoticiaBrunaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [NoticiaBrunaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(NoticiaBrunaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
