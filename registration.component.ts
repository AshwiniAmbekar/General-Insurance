import { Component } from '@angular/core';
import { Registration } from './registration'
import { RegistrationService } from './registration-service'
import { Router } from '@angular/router';

@Component({
  selector: 'registration-detail',
  templateUrl: './registration.component.html'
})

export class RegistrationComponent {

  registration: Registration = new Registration();
  response: string;

  constructor(private registrationService: RegistrationService, private router: Router) {

  }

  keyPress(event: any) {
    const pattern = /[0-9\+\-\ ]/;
    let inputChar = String.fromCharCode(event.charCode);
    if (event.keyCode != 8 && !pattern.test(inputChar)) {
      event.preventDefault();
    }
  }
  
  userregistration(registrationform) {

    this.registrationService.registerToServer(this.registration)
      .subscribe(data => {
        this.response = data['status'];
        console.log(this.response)
      })

    if (this.response = 'true') {
      this.router.navigate(['./login']);

    }
    else {
      this.router.navigate(['./home-page']);

    }

  }

}
