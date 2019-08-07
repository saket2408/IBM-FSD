import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})

export class TestComponent implements OnInit {
  emps : emp[] 
  i : number
  
  
  constructor() { }
  @Output() givedetailstoApp = new EventEmitter();
  @Input()  message:string
  ngOnInit() {
    this.i = 0
    this.emps = [
      {
        id: 1,
        name : "saket",
        date : new Date()
      },
      {
        id: 2,
        name : "saxena",
        date : new Date()
      },
      {
        id: 3,
        name : "ram",
        date : new Date()
      }
    ]
  
  }
  getdetails(){
    this.emps.push({
      id : 4,
      name : "ajit",
      date : new Date()
    })
    this.givedetailstoApp.emit(this.emps[this.i]);
    this.i += 1 ;
  }
}
interface emp {
  id: number
  name: string
  date : Date
}
