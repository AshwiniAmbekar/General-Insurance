import { Component } from '@angular/core';
import { Login } from '../login/login';
import { LoginService } from './login-service';
import { Router } from '@angular/router';

@Component({
  selector: 'user-login',
  templateUrl: './login.component.html'
})

export class LoginComponent {

  login: Login = new Login();
  response: string;

  constructor(private loginService: LoginService, private router: Router) {

  }

  userlogin(loginform) {
    
    this.loginService.loginFromServer(this.login)
      .subscribe(data => {
        this.response = data['status'];
        console.log(this.response);
   
    if (this.response === 'Login successful!') {
      this.router.navigate(['./app-dashboard']);
    }
    else {
      this.router.navigate(['./app-home']);

    }
      })



  }
}