import { Component, OnInit } from '@angular/core';
import { UsersService } from '../users.service';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {
  count = 5;
  user : any
  constructor(private uService : UsersService, private router:Router) { }

  ngOnInit() {
  }

  add(user){
    this.user = {
      id : this.count,
      name : user.name,
      email : user.email
    }
    this.count +=1; 
    this.uService.adduser(this.user)
    this.router.navigate(['/view'])
  }

}
