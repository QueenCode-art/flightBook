package com.flights.nvms.repository;


import com.flights.nvms.model.BookingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingDetailsRepository extends JpaRepository<BookingDetails, Integer> {
}
