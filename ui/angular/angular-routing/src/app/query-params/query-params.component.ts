import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-query-params',
  templateUrl: './query-params.component.html',
  styleUrls: ['./query-params.component.css']
})
export class QueryParamsComponent implements OnInit {
  id : number
  name : string
  constructor(private route : ActivatedRoute) { }

  ngOnInit() {
    this.id = this.route.snapshot.queryParams.id
    this.name = this.route.snapshot.queryParams.name

  }

}
