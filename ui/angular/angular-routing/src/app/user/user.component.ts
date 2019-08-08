import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  constructor(private route : ActivatedRoute, private router : Router) { }

  ngOnInit() {
    console.log(this.route.snapshot.params.id)
  }

  redirect(){
    this.router.navigate(['edit' , this.route.snapshot.params.id, this.route.snapshot.params.id1 ]);

  }
  gotoQuery(){
    this.router.navigate(['params'] , {queryParams : {id : 7,  name : "saket"}})
  }

}
