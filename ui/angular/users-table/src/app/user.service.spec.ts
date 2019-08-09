import { TestBed } from '@angular/core/testing';

import { UserService } from './user.service';

describe('UserService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: UserService = TestBed.get(UserService);
    expect(service).toBeTruthy();
  });

  it('should give users list',() =>{
    const service: UserService = TestBed.get(UserService);
    const users = service.getuser()
    expect(users.length).toBe(3)
  });

  it('should render activeusers',() =>{
    const service: UserService = TestBed.get(UserService);
    const users = service.getuser()
    const active = service.activestatus()
    expect(active).toBe(2)
  })

  it('should render inactiveusers',() =>{
    const service: UserService = TestBed.get(UserService);
    const users = service.getuser()
    const inactive = service.inactivestatus()
    expect(inactive).toBe(1)
  })

  it('should add user',() =>{
    const service: UserService = TestBed.get(UserService);
    const users = service.getuser()
    const user = service.adduser()
    expect(users.length).toBe(4)
  })

  it('should delete user',() =>{
    const service: UserService = TestBed.get(UserService);
    const users = service.getuser()
    const user = service.deleletuser(1)
    expect(users.length).toBe(2)
  })

});
