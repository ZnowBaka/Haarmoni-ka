package com.example.haarmonika.Controller;

import com.example.haarmonika.Model.*;

import java.time.LocalDateTime;

public class BookingController {
    private Booking booking = null;

    public Booking createNewBooking(String bookingTime, Timeslot timeslot, Service service, Employee barber, Customer customer) {
        booking = new Booking(bookingTime, timeslot, service, barber, customer);
        return booking;
    }




}
