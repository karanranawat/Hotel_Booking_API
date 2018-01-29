package com.karanranawat.hotelbooking.dao.booking;

import com.karanranawat.hotelbooking.dto.booking.Booking;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Booking, String> {

}