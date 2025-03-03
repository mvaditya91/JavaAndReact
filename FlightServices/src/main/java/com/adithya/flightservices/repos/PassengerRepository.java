package com.adithya.flightservices.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adithya.flightservices.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
