import { BrowserModule } from '@angular/platform-browser';
import { NgModule, ErrorHandler } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AppRoutingModule} from './app-routing.module';
import { AppComponent } from './app.component';
import { HomepageComponent } from './homepage/homepage.component';
import { BookpageComponent } from './bookpage/bookpage.component';
import { FlightinfoComponent } from './flightinfo/flightinfo.component';
import { FinalComponent } from './final/final.component';
import { BookpageService } from './bookpage.service';
import { FlightinfoService } from './flightinfo.service'
import {HttpClientModule, HTTP_INTERCEPTORS} from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    BookpageComponent,
    FlightinfoComponent,
    FinalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],

  providers: [
    BookpageService,
    FlightinfoService
  ],

  bootstrap: [AppComponent]
})
export class AppModule { }
