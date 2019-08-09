import { async, ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';

import { UserComponent } from './user.component';
import { UserService } from '../user.service';

describe('UserComponent', () => {
  let component: UserComponent;
  let fixture: ComponentFixture<UserComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should add emp',()=>{
    const service: UserService = TestBed.get(UserService);
    fixture = TestBed.createComponent(UserComponent);
    component = fixture.componentInstance;
    const emps = service.getuser()
    const emp = component.addemp()
    expect(emps.length).toBe(4)
  })

  it('should add emp', ()=>{
    const service: UserService = TestBed.get(UserService);
    fixture = TestBed.createComponent(UserComponent);
    component = fixture.componentInstance;
    const emps = service.getuser()
    const emp = component.delemp(1)
    //tick(100);
    expect(emps.length).toBe(2)
  });
});
