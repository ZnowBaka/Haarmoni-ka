package com.example.haarmonika.Model;

import com.example.haarmonika.Controller.BookingController;
import com.example.haarmonika.Controller.PersonController;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Booking {

    private int bookingId;
    private String BookingDate;
    private String BookingTime;

    private int employeeFK;
    private int customerFK;
    private int serviceFK;


    // Full Constructor
    public Booking(int bookingId, String bookingDate, String bookingTime, int employeeFK, int customerFK, int serviceFK) {
        this.bookingId = bookingId;
        BookingDate = bookingDate;
        BookingTime = bookingTime;
        this.employeeFK = employeeFK;
        this.customerFK = customerFK;
        this.serviceFK = serviceFK;
    }

    // Constructor without ID
    public Booking(String bookingDate, String bookingTime, int employeeFK, int customerFK, int serviceFK) {
        BookingDate = bookingDate;
        BookingTime = bookingTime;
        this.employeeFK = employeeFK;
        this.customerFK = customerFK;
        this.serviceFK = serviceFK;
    }






}
