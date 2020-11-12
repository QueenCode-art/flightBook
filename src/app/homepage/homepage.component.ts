import { Component, HostBinding, OnInit } from '@angular/core';
import {ActivatedRoute, Router } from '@angular/router';
import { trigger, state, style, animate, transition } from '@angular/animations';
// import { url } from 'inspector';


@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css'] ,
//   animations: [
//     trigger('slidingPictures',[
//       state('image1', style({ background: "url(../assets/images/newyork.jpg)"})),
    
//     state('image2', style({ background: "url(../assets/images/dubai.jpg)"})),

//   state('image3', style({ background: "url(../assets/images/london.jpg)"})),

//   state('image4', style({ background: "url(../assets/images/india.jpg)"}))
// ]),
// transition('image1=>image2', [
//   animate('1s',
// style( 
//   {
//     transform: 'translateX(-100%)',

//   }
// ))
// ]),
// transition('image2=>image3', [
//   animate('1s',
// style( 
//   {
//     transform: 'translateX(-100%)',

//   }
// ))
//   ]),
//   transition('image3=>image4', [
//     animate('1s',
//   style( 
//     {
//       transform: 'translateX(-100%)',
  
//     }
//   ))
// ]),
// transition('image4=>image1', [
//   animate('1s',
// style( 
//   {
//     transform: 'translateX(-100%)',

//   }
// ))
// ]),
//   ]
 })

export class HomepageComponent implements OnInit {
// image: string;
// imageIndex: number;
// images: string[];


constructor(private router: Router) {
// this.imageIndex = 0;
// this.images = ['image1','image2','image3', 'image4'];
// this.image = this.images[this.imageIndex];

// setInterval(() => this.rotatingBackground(), 5000);
 }

  ngOnInit() {
    this.router.navigate(["/homepage"])
  }

  // rotatingBackground(): any {
  //   console.log(this.imageIndex);
  //   this.image = this.images[this.imageIndex];
  //   this.imageIndex++;
  //   if(this.imageIndex >= this.images.length) {
  //     this.imageIndex = 0;
  //   }
  //   console.log(this.image)

  // }
}
