package com.loginSignup.repository;

import com.loginSignup.domain.HotelDomain;
import com.loginSignup.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, String> {
	
}
