package com.flights.nvms.repository;


import com.flights.nvms.model.FlightDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightDetailRepository extends JpaRepository<FlightDetail, Integer> {
}
