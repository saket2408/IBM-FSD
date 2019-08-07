import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {
  uid : number
  uid2 : number
  constructor(private route:ActivatedRoute) { }

  ngOnInit() {
    this.uid = parseInt(this.route.snapshot.params.uid)
    this.uid2 = parseInt(this.route.snapshot.params.uid2)
  }

}
