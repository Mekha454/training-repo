import { ComponentFixture, TestBed } from '@angular/core/testing';
import { AdventurersComponent } from './adventurers.component';
import {HttpClientTestingModule} from '@angular/common/http/testing'
import { Observable, of } from 'rxjs';
import { Adventurer } from 'src/app/models/adventurer';
import { AdventurerService } from 'src/app/services/adventurer.service';
import {provider}



//Mocking framework

export class MockAdventurerService extends AdventurerService{

  findAllAdventurers():Observable<Adventurer>{

    //method returns what is referred to as a 'stub': canned answer that is returned every single time method is invoked- not dynamic

    let mockAdventurers:Observable<Adventurer[]> = of([new Adventurer(1, 'Twiddlina', 'Gnome?', ' ', 'Conjuration Wizard', []), 
    new Adventurer(2, 'Vokad', 'Tiefling', ' ', 'Evil Paladin', [])]);
    return mockAdventurers;

  }

}

describe('AdventurersComponent', () => {
  //object under test
  let component: AdventurersComponent;
  let fixture: ComponentFixture<AdventurersComponent>;

  //Setup: this particular setup creates a mock App Module that is an minimal as it can be
  //only components and services needed to run the test wll be declared here
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdventurersComponent ],
      //use mock HttpCLientModule to guarantee none of these tests make an actual HTTP request
      imports: [HttpClientTestingModule]
      providers: [{provide: AdventurerService, useClass: MockAdventurerService}]
    })
    .compileComponents();
  });
  //Here create instance of AdventurersComponent using TestBed as it was configured above.
  beforeEach(() => {
    fixture = TestBed.createComponent(AdventurersComponent);
    component = fixture.componentInstance;
    //for unit tests, Angular does not automatically detect changes to component state
    //often need to call detectChanges()
    fixture.detectChanges();
  });


// 'it' function denotes a test
//this function takes description and callback function which defines test logic
  it('should create', () => {
    //have 'expectations' for Jasmine tests rather than 'assertions'
    expect(component).toBeTruthy();
  });

  //testing size of adventurer [] actually increases appropriately
  it('should increase size of [] when findAll is called', ()=> {
    expect(component.adventurers.length).toBe(0);
    component.findAllAdventurers();
    expect(component.adventurers.length).toBeGreaterThan(0);
  });
});
