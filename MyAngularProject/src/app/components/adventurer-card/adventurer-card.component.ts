import { Component, Input, OnInit } from '@angular/core';
import { Adventurer } from 'src/app/models/adventurer';

@Component({
  selector: 'app-adventurer-card',
  templateUrl: './adventurer-card.component.html',
  styleUrls: ['./adventurer-card.component.css']
})
export class AdventurerCardComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

//this state is passed down from the parent component
//name of property should match the name of the property specified at the level of the parent component
 //"input" decorator used to pass down state

 
  @Input()
  adventurer!:Adventurer;


isHidden:boolean = true;

toggleVisibility():void{
  this.isHidden = !this.isHidden
}
}