package com.example.haarmonika.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Booking {
    private int barberId;
    private int bookingTime;
    private int serviceId;
    public Booking(String bookingTime,Timeslot timeslot, Service providedService, Employee barber, Customer customer) {}

}
