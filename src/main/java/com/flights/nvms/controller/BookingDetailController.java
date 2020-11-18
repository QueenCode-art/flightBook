package com.flights.nvms.controller;


import com.flights.nvms.model.BookingDetails;
import com.flights.nvms.model.FlightDetail;
import com.flights.nvms.service.BookingDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class BookingDetailController {

    @Autowired
    private BookingDetailsService bookingDetailsService;

    @GetMapping("/bookingDetails")
    public List<BookingDetails> getAllBookings(){
        return bookingDetailsService.getAllBookings();}


    @PostMapping("/bookingDetails")
    public FlightDetail addBookingDetails (@RequestBody BookingDetails bookingDetails){
        return bookingDetailsService.addBookingDetails(bookingDetails);
    }







}
