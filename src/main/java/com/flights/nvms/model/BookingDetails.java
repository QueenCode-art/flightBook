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

public class BookingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "FIRST_NM", length = 100, nullable = false)
    private String firstName;

    @Column(name = "LAST_NM", length = 100, nullable = false)
    private String lastName;

    @Column(name = "PASSENGERS")
    @Enumerated(EnumType.STRING)
    private Passenger passenger;


    @Column(name = "EMAIL", length = 100, nullable = false)
    private String email;

    @Column(name = "AIRLINE")
    @Enumerated(EnumType.STRING)
    private Airlines preferredAirline;

    @Column(name = "CLASS")
    @Enumerated(EnumType.STRING)
    private TypeOfClass typeOfClass;

    @Column(name = "DESTINATION")
    @Enumerated(EnumType.STRING)
    private Destination destination;

    @Column(name = "DOA")
    private Date dateArrival;


    @Column(name = "DOD")
    private Date dateDeparture;


    @OneToOne(mappedBy = "bookingDetails")
    private FlightDetail flightDetail;

    public BookingDetails(String firstName, String lastName, Passenger passenger, String email, Airlines preferredAirline, TypeOfClass typeOfClass, Destination destination, Date dateArrival, Date dateDeparture) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passenger = passenger;
        this.email = email;
        this.preferredAirline = preferredAirline;
        this.typeOfClass = typeOfClass;
        this.destination = destination;
        this.dateArrival = dateArrival;
        this.dateDeparture = dateDeparture;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Airlines getPreferredAirline() {
        return preferredAirline;
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

    public Date getDateArrival() {
        return dateArrival;
    }

    public void setDateArrival(Date dateArrival) {
        this.dateArrival = dateArrival;
    }

    public Date getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(Date dateDeparture) {
        this.dateDeparture = dateDeparture;
    }
}

