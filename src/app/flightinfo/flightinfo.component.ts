import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FlightinfoService } from '../flightinfo.service';
import { Flightinfo }  from 'src/app/model/flightinfo';
import { FormGroup, FormControl } from '@angular/forms';
import { Validators } from '@angular/forms';

@Component({
  selector: 'app-flightinfo',
  templateUrl: './flightinfo.component.html',
  styleUrls: ['./flightinfo.component.css']
})
export class FlightinfoComponent implements OnInit {
  id: any;
  flightinfo: Flightinfo;
flightinfoProfile = new FormGroup({});


  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private flightinfoService : FlightinfoService,){
    this.flightinfo = new Flightinfo();

    }
   
  ngOnInit() {
// this.id = this.route.snapshot.params['id'];
    this.flightinfoService.getAllFlight(this.flightinfo).subscribe(data =>{ this.flightinfo = data
    }) }
  }

    
  

