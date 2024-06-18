import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NoticiaRalphlaurenComponent } from './noticia-ralphlauren.component';

describe('NoticiaRalphlaurenComponent', () => {
  let component: NoticiaRalphlaurenComponent;
  let fixture: ComponentFixture<NoticiaRalphlaurenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [NoticiaRalphlaurenComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(NoticiaRalphlaurenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
