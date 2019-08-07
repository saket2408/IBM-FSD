import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'users-table';
  active: number
  inactive : number

  getactivecount($event){
    this.active = $event;
  }
  getinactivecount($event){
    this.inactive = $event;
  }
}
