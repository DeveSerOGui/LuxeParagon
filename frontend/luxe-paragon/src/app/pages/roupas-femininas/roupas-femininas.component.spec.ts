import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RoupasFemininasComponent } from './roupas-femininas.component';

describe('RoupasFemininasComponent', () => {
  let component: RoupasFemininasComponent;
  let fixture: ComponentFixture<RoupasFemininasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [RoupasFemininasComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(RoupasFemininasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
