package com.karanranawat.hotelbooking.service;

import com.karanranawat.hotelbooking.dao.booking.BookingRepository;
import com.karanranawat.hotelbooking.dto.booking.Booking;
import com.karanranawat.hotelbooking.dto.error.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookingDetails {

    @Autowired
    private BookingRepository bookingRepository;

    public Object getBookingById(String id){

        Booking booking = bookingRepository.findOne(id);
        if(booking == null){
            return new Error("404", "Desired booking could not be found");
        } else {
            return booking;
        }

    }

}
