import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserComponent } from './user/user.component';
import { HomeComponent } from './home/home.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { EditComponent } from './edit/edit.component';
import { QueryParamsComponent } from './query-params/query-params.component';


const routes: Routes = [
  {
    path : 'home',
    component : HomeComponent
  },
  {
    path : 'aboutus',
    component : AboutusComponent
  },
  {
    path : 'user/:id/:id1',
    component : UserComponent
  },
  {
    path : 'edit/:uid/:uid2',
    component : EditComponent
  },
  {
    path : 'params',
    component : QueryParamsComponent
  },
  {
    path : '**',
    component : HomeComponent
  }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
