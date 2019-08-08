import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UsersService {
    users: any
    index: number
  constructor() { 
    this.users = [
      {
        id: 1,
        name: "saket",
        email : "saket@gg.com"
      },
      {
        id: 2,
        name: "ajit",
        email : "ajit@gg.com"
      },
      {
        id: 3,
        name: "bob",
        email : "bob@gg.com"
      },
      {
        id: 4,
        name: "heisenberg",
        email : "ww@gg.com"
      }
    ]
  }

  getusers(){
    return this.users;
  }
  
  getUserById(id){
    return this.users.find(e=>{
      return e.id == id
    })
  }

  adduser(user){
    this.users.push(user)
  }
  deleteuser(id){
    this.users.find((e,i)=>{
      this.index = i;
      return id == e.id
    })
    this.users.splice(this.index,1)

  }
  edit(obj){

    this.users.forEach(e => {
        if(obj.id ==  e.id){
            e.name = obj.name;
            e.email == obj.email  
        }
    });
  }

}
