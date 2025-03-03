package com.example.haarmonika.Controller;

import com.example.haarmonika.Model.*;

import java.time.LocalDateTime;

public class BookingController {
    private Booking booking = null;

    public Booking createNewBooking(String bookingDate, String bookingTime, int employeeFK, int customerFK, int serviceFK) {
        booking = new Booking(bookingDate, bookingTime, employeeFK, customerFK, serviceFK);
        return booking;
    }


}
