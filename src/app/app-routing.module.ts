import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomepageComponent } from './homepage/homepage.component';
import { BookpageComponent } from './bookpage/bookpage.component';
import { FlightinfoComponent } from './flightinfo/flightinfo.component';
import { FinalComponent } from './final/final.component';

const routes: Routes=[
    
    { path: 'homepage', component: HomepageComponent },
    { path: '', redirectTo: '/homepage', pathMatch:'full'},
    { path: 'bookpage', component: BookpageComponent},
    { path: 'final', component: FinalComponent},
    { path: 'flightinfo', component: FlightinfoComponent}
];

    
    

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
  
})
export class AppRoutingModule { } 
