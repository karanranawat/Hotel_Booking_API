package com.karanranawat.hotelbooking.controller;

import com.karanranawat.hotelbooking.dao.booking.BookingRepository;
import com.karanranawat.hotelbooking.dto.booking.Booking;
import com.karanranawat.hotelbooking.dto.error.Error;
import com.karanranawat.hotelbooking.service.BookingDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class BookingController {

    @Autowired
    BookingDetails bookingDetails;

    @CrossOrigin(origins = "http://localhost:3004")
    @RequestMapping(value = "/booking/{id}", method = RequestMethod.GET)
    public Object getBookings(@PathVariable String id) {
        return bookingDetails.getBookingById(id);

    }

}
