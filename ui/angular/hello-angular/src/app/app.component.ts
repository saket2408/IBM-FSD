import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'hello-angular';
  _msg = "saket saxena";
  message: any

  getdetails($event){
      this.message = $event;
  }
}
