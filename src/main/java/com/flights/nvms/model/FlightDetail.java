package com.flights.nvms.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.flights.nvms.Airlines;
import com.flights.nvms.Destination;
import com.flights.nvms.Passenger;
import com.flights.nvms.TypeOfClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class FlightDetail {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;

        @Column(name = "Name")
       private String name;

     @Column(name = "AIRLINE")
    @Enumerated(EnumType.STRING)
    private Airlines preferredAirline;

    @Column(name = "PASSENGERS")
    @Enumerated(EnumType.STRING)
    private Passenger passenger;


    @Column(name = "CLASS")
    @Enumerated(EnumType.STRING)
    private TypeOfClass typeOfClass;

    @Column(name = "DESTINATION")
    @Enumerated(EnumType.STRING)
    private Destination destination;

        @Column(name = "DOD")
        private Date dateDeparture;

       @Column(name = "DOA")
       private Date dateArrival;

//        @Column(name = "FlightNo")
//        private String flightNo;

//        @Column(name = "SEATNO", nullable = false)
//        private String seatNo;

        @Column(name = "EMAIL")
        private String email;

        @Column(name = "AMOUNT", nullable = false)
        private int amount;

      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "book_id", referencedColumnName = "id")
      private BookingDetails bookingDetails;

//    public FlightDetail(String name, Airlines preferredAirline, TypeOfClass typeOfClass, Destination destination, Date dateDeparture, Date dateArrival, String flightNo, String email) {
//        this.name = name;
//        this.preferredAirline = preferredAirline;
//        this.typeOfClass = typeOfClass;
//        this.destination = destination;
//        this.dateDeparture = dateDeparture;
//        this.dateArrival = dateArrival;
//        this.flightNo = flightNo;
//        this.email = email;
//        this.amount = amount;
//    }


    public FlightDetail(String name, Airlines preferredAirline, TypeOfClass typeOfClass, Destination destination, Date dateDeparture, Date dateArrival, Passenger passenger, String email, int amount) {
        this.name = name;
        this.preferredAirline = preferredAirline;
        this.typeOfClass = typeOfClass;
        this.destination = destination;
        this.dateDeparture = dateDeparture;
        this.dateArrival = dateArrival;
        this.passenger = passenger;
        this.email = email;
        this.amount = amount;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Airlines getPreferredAirline() {
        return preferredAirline;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setPreferredAirline(Airlines preferredAirline) {
        this.preferredAirline = preferredAirline;
    }

    public TypeOfClass getTypeOfClass() {
        return typeOfClass;
    }

    public void setTypeOfClass(TypeOfClass typeOfClass) {
        this.typeOfClass = typeOfClass;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Date getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(Date dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public Date getDateArrival() {
        return dateArrival;
    }

    public void setDateArrival(Date dateArrival) {
        this.dateArrival = dateArrival;
    }

//    public String getFlightNo() {
//        return flightNo;
//    }
//
//    public void setFlightNo(String flightNo) {
//        this.flightNo = flightNo;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}



