package com.flights.nvms.controller;


import com.flights.nvms.model.FlightDetail;
import com.flights.nvms.service.FlightDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class FlightDetailController {

    @Autowired
    private FlightDetailService flightDetailService;

    @GetMapping("/flightDetails")
    public List<FlightDetail> getAllFlight() {
        return flightDetailService.getAllFlight();
    }

    @GetMapping("/flightDetails/{id}")
    public FlightDetail getAllFlight(@PathVariable("id") Integer id){
        return flightDetailService.getFlight(id);
    }

    @PutMapping("/flightDetails")
    public List<FlightDetail> updateFlight(@RequestBody FlightDetail name) {
        return flightDetailService.updateFlight(name);
    }

    @PostMapping("/flightDetails")
    public List<FlightDetail> addFlightDetail(@RequestBody FlightDetail flightDetail) {
        return flightDetailService.addFlightDetail(flightDetail);
    }

}
