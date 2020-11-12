import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Flightinfo } from 'src/app/model/flightinfo';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FlightinfoService {

  private flightUrl: any;
  constructor(private http: HttpClient) {
    this.flightUrl = 'http://localhost:5000/flightDetails'
}
public getAllFlight(id:any) : Observable<Flightinfo>{
  return this.http.get<Flightinfo>(`${this.flightUrl}`);
}
}


