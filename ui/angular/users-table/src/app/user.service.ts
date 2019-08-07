import { Injectable } from '@angular/core';
import { getAttrsForDirectiveMatching } from '@angular/compiler/src/render3/view/util';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  users : emp[]
  active = 0
  inactive = 0
  count = 4
  index: number
  constructor() { }

  getuser(){
    this.users = [
      {
        id:1,
        name : "saket",
        age : 21,
        active : true
      },
      {
        id:2,
        name : "ram murti",
        age : 22,
        active : true
      },
      {
        id:3,
        name : "anubhav",
        age : 21,
        active : false
      }
    ]
    return this.users;
  }


activestatus(){
  this.active = 0
  this.users.forEach(e => {
      if(e.active == true){
        this.active +=1
      }
  });
  return this.active;
}

inactivestatus(){
  this.inactive = 0

  this.users.forEach(e => {
      if(e.active == false){
        this.inactive +=1
      }
  });
  return this.inactive;
}

adduser(){
  this.users.push({
    id: this.count,
    name: "anubhav",
    age: 23,
    active : false
  })
  this.count = this.count+1;
  return this.users;
}

deleletuser(id){
    this.users.find((e,i) =>{
      this.index = i
        return e.id == id
    })

    this.users.splice(this.index,1)
    return this.users;
}
}

export interface emp{
  id: number
  name : string
  age : number
  active : boolean
}