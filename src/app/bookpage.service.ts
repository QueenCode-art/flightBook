
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Bookdetails } from 'src/app/model/bookdetails';

@Injectable({
  providedIn: 'root'
})
export class BookpageService {

  private bookUrl: any;

  constructor( private http: HttpClient) {
    this.bookUrl= 'http://localhost:5000//bookingDetails'
   }

   public addBookings( bookdetails: Bookdetails){
     return this.http.post<Bookdetails>(this.bookUrl, bookdetails);
   }
}
