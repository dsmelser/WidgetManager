import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { LandingPageComponent } from './landing-page/landing-page.component';
import { PublicDashComponent } from './public-dash/public-dash.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { UserAdminComponent } from './user-admin/user-admin.component';

@NgModule({
  declarations: [
    AppComponent,
    LandingPageComponent,
    PublicDashComponent,
    LoginComponent,
    RegistrationComponent,
    UserAdminComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
