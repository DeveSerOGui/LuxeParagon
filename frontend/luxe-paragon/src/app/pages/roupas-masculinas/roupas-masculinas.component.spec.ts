import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RoupasMasculinasComponent } from './roupas-masculinas.component';

describe('RoupasMasculinasComponent', () => {
  let component: RoupasMasculinasComponent;
  let fixture: ComponentFixture<RoupasMasculinasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [RoupasMasculinasComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(RoupasMasculinasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
