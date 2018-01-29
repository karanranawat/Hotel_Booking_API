package com.karanranawat.hotelbooking.controller;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicLong;

import com.karanranawat.hotelbooking.dao.booking.BookingRepository;
import com.karanranawat.hotelbooking.dto.booking.Booking;
import com.karanranawat.hotelbooking.dto.error.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;

    @RequestMapping("/booking")
    public Object getBookings(@RequestParam(value="id", defaultValue="1") String id) {

        // Use the ID to retrieve details from DB
        Booking booking = bookingRepository.findOne(id);
        if(booking == null){
            return new Error("404", "Desired booking could not be found");
        } else {
            return booking;
        }

        //return new Booking(id, creationDate, creationTime, location, name, from, to);
    }

}
