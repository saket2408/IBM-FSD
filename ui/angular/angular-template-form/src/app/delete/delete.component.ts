import { Component, OnInit } from '@angular/core';
import { UsersService } from '../users.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {
  users : number

  constructor(private route: ActivatedRoute, private uService : UsersService, private router: Router) { }

  ngOnInit() {
    this.uService.deleteuser(this.route.snapshot.params.id);
    this.router.navigate(['/view'])
  }


}
