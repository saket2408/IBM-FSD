import { Component, OnInit, EventEmitter, Output } from '@angular/core';
import { UsersService } from '../users.service';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {
  users : any 
  constructor(private uService : UsersService)  { }

  ngOnInit() {
    
    this.users = this.uService.getusers()
  }

}
