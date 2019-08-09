import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-fetch-api',
  templateUrl: './fetch-api.component.html',
  styleUrls: ['./fetch-api.component.css']
})
export class FetchApiComponent implements OnInit {
  items:any
  constructor(private iService: ApiService) { 
  }

  ngOnInit() {
    this.iService.getitems(data=>{
      console.log(data.items)
      this.items = data.items
      
    })
  }
  

}


