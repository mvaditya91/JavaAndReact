package com.adithya.flightservices.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adithya.flightservices.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
