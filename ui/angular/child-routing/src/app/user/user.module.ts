import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddComponent } from './add/add.component';
import { SubComponent } from './sub/sub.component';
import { DefaultComponent } from './default/default.component';
import { UserRoutingModule } from './user-routing.module';



@NgModule({
  declarations: [AddComponent, SubComponent, DefaultComponent],
  imports: [
    CommonModule,
    UserRoutingModule
  ]
})
export class UserModule { }
