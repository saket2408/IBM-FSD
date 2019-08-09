import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  users:any[]
  constructor(private http:HttpClient) { }

  getitems(callback){
    const _url = "http://localhost:1269/items"
    fetch(_url)
    .then(res=>res.json())
    .then(users=>{
      callback(users)
    })
  }
//http client fetch
  getallitems(callback){
    const _url = "http://localhost:1269/items"
    this.http.get(_url)
    .subscribe(data =>{
        callback(data)
    })

  }
}
