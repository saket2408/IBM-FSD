import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  users:any[]
  constructor() { }

  getitems(callback){
    const _url = "http://localhost:1269/items"
    fetch(_url)
    .then(res=>res.json())
    .then(users=>{
      callback(users)
    })
  }
}
