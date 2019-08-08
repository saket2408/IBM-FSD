import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddComponent } from './add/add.component';
import { SubComponent } from './sub/sub.component';
import { DefaultComponent } from './default/default.component';


const routes: Routes = [

  {
    path : 'user',
    children: [
      {
          path : 'add',
          component : AddComponent
      },
      {
         path : 'sub',
         component : SubComponent
      },
      {
          path : '',
          component : DefaultComponent
      }
    ]
  }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class UserRoutingModule { }
