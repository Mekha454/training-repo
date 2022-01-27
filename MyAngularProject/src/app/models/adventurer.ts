import { AdventurersComponent } from "../components/adventurers/adventurers.component";

export class Adventurer {

    id:number;
    name:string;
    race:string;
    img_url:string;
    role:string;
    exploits:string[]

    constructor(id:number, name:string, race:string, img_url:string, role:string, exploits:string[]){
        this.id = id;
        this.name = name;
        this.race = race;
        this.img_url = img_url;
        this.role = role;
        this.exploits = exploits;

    }

    //you can declare variables within parameter list:

   // constructor(public id:number, public name:string, public race:string, public img_url:string, public class:string, public exploits:string[]){
//     this.id = id;
//     this.name = name;
//     this.race = race;
//     this.img_url = img_url;
//     this.class = class;
//     this.exploits = exploits;
//    }


    //never return type doesn't return value, always throws error
    public neverReturn():never{
        throw new Error()
    }

    public returnANumber():number{
        return 20;
    }

    
}

