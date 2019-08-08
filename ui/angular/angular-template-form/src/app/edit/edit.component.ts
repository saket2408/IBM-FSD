import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UsersService } from '../users.service';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {
  editObj : any
  constructor(private uService: UsersService, private route:ActivatedRoute,private router:Router) { }

  ngOnInit() {
    this.editObj = this.uService.getUserById(this.route.snapshot.params.id)
  }

  edit(){
    this.uService.edit(this.editObj)
    this.router.navigate(['/view'])
  }
}
