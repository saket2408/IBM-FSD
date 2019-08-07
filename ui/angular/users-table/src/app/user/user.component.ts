import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { UserService, emp } from '../user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  users : emp[]
  @Output() activecount = new EventEmitter();
  @Output() inactivecount = new EventEmitter();
  constructor(private uService: UserService) { }

  ngOnInit() {
     this.users = this.uService.getuser();
     this.activecount.emit(this.uService.activestatus());
     this.inactivecount.emit(this.uService.inactivestatus());
  }

  addemp(){
    this.users = this.uService.adduser();
    this.activecount.emit(this.uService.activestatus());
     this.inactivecount.emit(this.uService.inactivestatus());
  }

  delemp(id){
    this.users = this.uService.deleletuser(id);
    this.activecount.emit(this.uService.activestatus());
     this.inactivecount.emit(this.uService.inactivestatus());
  }

}
