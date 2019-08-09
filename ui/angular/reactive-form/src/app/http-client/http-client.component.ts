import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-http-client',
  templateUrl: './http-client.component.html',
  styleUrls: ['./http-client.component.css']
})
export class HttpClientComponent implements OnInit {
  items:any[]
  constructor(private iService : ApiService) { }

  ngOnInit() {
    this.iService.getallitems(data=>{
      this.items = data.items
    })
  }

}
