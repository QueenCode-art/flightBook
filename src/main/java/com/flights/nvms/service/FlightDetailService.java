package com.flights.nvms.service;


import com.flights.nvms.Airlines;
import com.flights.nvms.Destination;
//import com.flights.nvms.FlightNoGenerator;
import com.flights.nvms.Passenger;
import com.flights.nvms.model.FlightDetail;
import com.flights.nvms.repository.FlightDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class FlightDetailService {

    @Autowired
    private FlightDetailRepository flightDetailRepository;

    @Autowired
    private JavaMailSender javaMailSender;

    public List<FlightDetail> getAllFlight() {

        return flightDetailRepository.findAll();
    }

    public FlightDetail getFlight(Integer id) {

        return flightDetailRepository.getOne((id));
    }

    public List<FlightDetail> updateFlight(FlightDetail flightDetail) {
        flightDetailRepository.save(flightDetail);
        return getAllFlight();

    }

    public List<FlightDetail> addFlightDetail(FlightDetail flightDetail) {

//      FlightNoGenerator flightNoGenerator =new FlightNoGenerator();
//        SimpleMailMessage mailMessage = new SimpleMailMessage();
//        String email = flightDetail.getEmail();
//        String name = flightDetail.getName();
//        String flightNo = flightNoGenerator.generateFlNo(7);
//      String seatNo = flightDetail.getSeatNo();
        Airlines preferredAirline = flightDetail.getPreferredAirline();
        Destination destination = flightDetail.getDestination();
        Date dateDeparture = flightDetail.getDateDeparture();
        Date dateArrival = flightDetail.getDateArrival();

        Passenger passenger = flightDetail.getPassenger();
        int amount = flightDetail.getAmount();

        if (passenger == Passenger.Adult) {
            amount = 2000;
        } else if (passenger == Passenger.Child) {
            amount = 1500;
        } else if (passenger == Passenger.Infant) {
            amount = 1000;

        }


//        mailMessage.setFrom("spring.mail.username");
//        mailMessage.setTo(email);
//        mailMessage.setSubject("Flight Details");
//        mailMessage.setText("Dear" + name + "\n" +
//                "Your flight details are listed below" +
////                "Flight number:"+flightNo +"\n"+
//                "Airline:" + preferredAirline + "\n" +
//                "Destination:" + destination + "\n" +
//                "Departure Date:" + dateDeparture + "\n" +
//                "Arrival Date:" + dateArrival + "\n" +
//                "Amount Billed:" + amount + "\n");
//        javaMailSender.send(mailMessage);
        flightDetailRepository.save(flightDetail);
        return getAllFlight();
    }
}

