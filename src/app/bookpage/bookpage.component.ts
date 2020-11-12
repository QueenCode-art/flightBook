import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BookpageService } from '../bookpage.service';
import { Bookdetails } from 'src/app/model/bookdetails'
import { FormGroup, FormControl, EmailValidator } from '@angular/forms';
import { Validators } from '@angular/forms';


@Component({
  selector: 'app-bookpage',
  templateUrl: './bookpage.component.html',
  styleUrls: ['./bookpage.component.css']
})
export class BookpageComponent  {

bookdetails: Bookdetails

   bookdetailsProfile = new FormGroup({
    dateArrival: new FormControl('', [Validators.required]),
    dateDeparture: new FormControl('', [Validators.required]),
    destination: new FormControl('', [Validators.required]),
    email: new FormControl('', [Validators.required]),
    firstName: new FormControl('', [Validators.required]),
    lastName: new FormControl('', [Validators.required]),
    passenger: new FormControl('', [Validators.required]),
    preferredAirline: new FormControl('', [Validators.required]),
    typeOfClass: new FormControl('', [Validators.required])
  });


  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private bookpageService : BookpageService,) {
    this.bookdetails = new Bookdetails();
    }

    onSubmit(){
      console.log(this.bookdetailsProfile.value)
       this.bookpageService.addBookings(this.bookdetailsProfile.value).subscribe(result => this.gotoFlightinfo());
       this.bookdetailsProfile.reset();
      }
      gotoFlightinfo(){
    this.router.navigate(["/final"])
  }
}
