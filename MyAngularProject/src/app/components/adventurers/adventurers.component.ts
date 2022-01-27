import { Component, OnInit } from '@angular/core';
import { Adventurer } from 'src/app/models/adventurer';
import { AdventurerService } from 'src/app/services/adventurer.service';

@Component({
  selector: 'app-adventurers',
  templateUrl: './adventurers.component.html',
  styleUrls: ['./adventurers.component.css']
})
export class AdventurersComponent implements OnInit {

  constructor(private adventurerService:AdventurerService) { }

  
  ngOnInit(): void {
    this.findAllAdventurers
  }

  // creating an array of adventurers to pass into child class adventurer-card
  // array will not be populated with 'recipes' from Javalin API

  adventurers:Adventurer[] = [];

  //as a matter abstraction (to keep ngOnInit method from getting too bloated), you can handle calling service methods from within another method

  public findAllAdventurers(){
    //subscribe to observables to access data inside observable stream
    //pass 2 callback functions for: 1) accessing data; 2) error handling (not required)
    this.adventurerService.findAllAdventurers().subscribe(
      (data) => {
        this.adventurers = data
        console.log(this.adventurers)
      },
      () => {
        console.log("Error occured!")
      }
    )
  }


//   adventurers:Adventurer[] = [new Adventurer(1, 'Teodor', 'Human','https://static.wikia.nocookie.net/hearthstone_gamepedia/images/d/d9/King_Anduin_Full.jpg/', 'Paladin', 
//   ['took out Cthulu', 'friends with a drunk Monk'] ), 
//   new Adventurer(2, "Kirjan", "Human", "https://i.pinimg.com/736x/3e/80/fa/3e80fab614e9ce40d270269acc74b2b1.jpg", "Divination Wizard",
//    ['traveled through portal between dimensions', 'got fireballed by Strahd']),
// new Adventurer(3, "Vesper", "Drow", "https://i.redd.it/mry9g5zj4wu31.jpg", "Cleric of Lolth", ['traipsed around the Underdark', 'picked a goblin to win a fight']),
// new Adventurer(4, "Milliardo", "Human", "https://i.pinimg.com/originals/b1/8e/06/b18e064541cef89184f1311b0fffe8c5.png", "Duelist", 
// ['freed home city from evil wizard', 'pledged loyalty to Azmodeus']), 
// new Adventurer(5, 'Vilkyr Fenrik', 'Human', 'n/a', 'Druid', ['mucked about in a sewer', "went into the forest and hasn't come out"])];

}
