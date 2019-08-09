import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {
  signupFrm : FormGroup
  validError :string

  constructor() {
    this.createSignupForm();

   }

  ngOnInit() {
  }

  signUp(){
    //signupFrm
    console.log(this.signupFrm);

    if(this.signupFrm.status == 'INVALID'){
      this.validError = 'Please fill in the valid fields!'
    }
  }
  createSignupForm(){
    this.signupFrm = new FormGroup({
      email : new FormControl(
        'email@gg.com',
        Validators.required),
      street: new FormControl(
        'manyata',
        Validators.required) 
    });
  }

}
