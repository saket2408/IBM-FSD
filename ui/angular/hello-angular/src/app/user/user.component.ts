import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  message:string
  user: string[]
  users : user[]
  showtable : boolean
  constructor() { }

  ngOnInit() {
    this.message = "welcome to user component"
    this.user = [
      "saket",
      "ram"
    ]
    this.users = [{
      id: 1,
      name : "saket"
      },
      {
      id: 2,
        name : "ram"
      }
    ]
    //this.showtable = true
    this.showtable = false
  }
}
  interface user{
    id: number
    name: string
  }


