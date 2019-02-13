import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { RegistrationService } from './registration/registration-service';
import { RegistrationComponent } from './registration/registration.component';
import { FormsModule} from '@angular/forms'
import { LoginService } from './login/login-service';
import { LoginComponent } from './login/login.component';
import { BuyinsuranceComponent } from './buyinsurance/buyinsurance.component';
import { RouterModule } from '@angular/router';
import { AboutComponent } from './home/about-us.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AdminComponent } from './admin/admin.component';
import { ClaimInsuranceComponent } from './claim-insurance/claim-insurance.component';


@NgModule({
  declarations: [
    AppComponent,HomeComponent,
    RegistrationComponent,LoginComponent, 
    BuyinsuranceComponent,AboutComponent, DashboardComponent, AdminComponent, ClaimInsuranceComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,HttpClientModule,
    RouterModule.forRoot([
      {path:'registration-detail',component:RegistrationComponent},
      {path:'user-login',component:LoginComponent},
      {path:'about-us',component:AboutComponent},
      {path:'app-buyinsurance',component:AboutComponent},
      {path:'app-renew',component:AboutComponent},
      {path:'app-claim',component:AboutComponent},
      {path:'app-admin',component:AdminComponent}
    ])
  ],
  providers: [HttpClient,RegistrationService,LoginService],
  bootstrap: [AppComponent]
})
export class AppModule { }
