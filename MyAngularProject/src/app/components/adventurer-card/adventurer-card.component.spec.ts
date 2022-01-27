import { ComponentFixture, TestBed } from '@angular/core/testing';
import { Adventurer } from 'src/app/models/adventurer';

import { AdventurerCardComponent } from './adventurer-card.component';

describe('AdventurerCardComponent', () => {
  let component: AdventurerCardComponent;
  let fixture: ComponentFixture<AdventurerCardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdventurerCardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdventurerCardComponent);
    component = fixture.componentInstance;

    //cheat to deal with fact no @Input will be passed down for this test because instance of parent component doesn't exist to pass down state needed
    component.adventurer = new Adventurer(1, 'name', '', '', '', []);
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should toggle isHidden property between true & false when toggleVisibility() is called', () => {
    expect(component.isHidden).toBeTrue();
    component.toggleVisibility();
    expect(component.isHidden).toBeFalse();
  });
});
