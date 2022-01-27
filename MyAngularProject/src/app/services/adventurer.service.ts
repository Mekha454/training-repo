import { Injectable } from '@angular/core';
import { Adventurer } from '../models/adventurer';
import {HttpClient, HttpHandler} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdventurerService {

  /**
   * this service will build out methods to make HTTP requests for 'adventurers'
   * -need some utility to do so
   * Angular has a built-in module for making HTTP requests that is easy to use and simpler than AJAX
   * - called the HttpCLientModule.
   * HttpCLient type included in Module is @Injectable
   */

  constructor(private httpClient:HttpClient) { }

  public findAllAdventurers():Observable<Adventurer[]>{

    return this.httpClient.get('http://localhost:8000/recipe/all') as Observable<Adventurer[]>

  }
  

 
}
