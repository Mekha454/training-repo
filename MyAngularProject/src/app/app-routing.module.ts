import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdventurersComponent } from './components/adventurers/adventurers.component';
import { HomeComponent } from './components/home/home.component';

const routes: Routes = [
  {
    component: HomeComponent, 
    path: ''
  },
  {
    component: AdventurersComponent,
    path: 'adventurers'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
