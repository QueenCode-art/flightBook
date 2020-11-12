package com.flights.nvms.service;

import com.flights.nvms.*;
import com.flights.nvms.model.BookingDetails;
import com.flights.nvms.model.FlightDetail;
import com.flights.nvms.repository.BookingDetailsRepository;
import com.flights.nvms.repository.FlightDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional

public class BookingDetailsService {

    @Autowired
    private BookingDetailsRepository bookingDetailsRepository;

    @Autowired
    private FlightDetailRepository flightDetailRepository;

    @Autowired
    private JavaMailSender javaMailSender;


    public List<BookingDetails> getAllBookings() {
        return bookingDetailsRepository.findAll();
    }

    public BookingDetails getBookingDetails(Integer id) {
        return bookingDetailsRepository.getOne(id);
    }


    public List<BookingDetails> addBookingDetails(BookingDetails bookingDetails) {

        bookingDetailsRepository.save(bookingDetails);

        String email = bookingDetails.getEmail();
        String name = bookingDetails.getFirstName();
        Airlines preferredAirline = bookingDetails.getPreferredAirline();
        TypeOfClass typeOfClass = bookingDetails.getTypeOfClass();
        Destination destination = bookingDetails.getDestination();
        Date dateDeparture = bookingDetails.getDateDeparture();
        Date dateArrival = bookingDetails.getDateArrival();
        Passenger passenger = bookingDetails.getPassenger();
//
//         FlightNoGenerator flightNoGenerator =new FlightNoGenerator();
//         String flightNo = flightNoGenerator.generateFlNo(7);
//
//         FlightDetail detail1 = new FlightDetail(flightNo);
//         detail1.setFlightNo(flightNo);
//         detail1.getFlightNo();


        FlightDetail detail1 = new FlightDetail();

        int amount = detail1.getAmount();

        if (passenger == Passenger.Adult) {
            amount = 2000;
        } else if (passenger == Passenger.Child) {
            amount = 1500;
        } else if (passenger == Passenger.Infant) {
            amount = 1000;

        }
        FlightDetail detail = new FlightDetail(name, preferredAirline, typeOfClass, destination, dateDeparture, dateArrival, passenger, email, amount);

        SimpleMailMessage mailMessage = new SimpleMailMessage();
        String emailAdd = detail.getEmail();
        String names = detail.getName();
//       String flightNo = flightNoGenerator.generateFlNo(7);
//       String seatNo = flightDetail.getSeatNo();
        Airlines preferredLine = detail.getPreferredAirline();
        Destination destinations = detail.getDestination();
        Date dateOfDeparture = detail.getDateDeparture();
        Date dateOfArrival = detail.getDateArrival();
        Passenger passengers = detail.getPassenger();
        int amt = detail.getAmount();

        mailMessage.setFrom("spring.mail.username");
        mailMessage.setTo(email);
        mailMessage.setSubject("Flight Details");
        mailMessage.setText("Dear" + name + "\n" +
                "Your flight details are listed below" + "\n" +
//               "Flight number:"+flightNo +"\n"+
                "Airline:" + preferredLine + "\n" +
                "Destination:" + destinations + "\n" +
                "Departure Date:" + dateOfDeparture + "\n" +
                "Arrival Date:" + dateOfArrival + "\n" +
                "Amount Billed: $"+amt + "\n");
        javaMailSender.send(mailMessage);

        flightDetailRepository.save(detail);
        return getAllBookings();
    }
}


