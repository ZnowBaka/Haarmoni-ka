package com.example.haarmonika.Model;

public class Timeslot {
    private int timeslotId;
    private Service chosenService;
    private Person chosenBarber;
    private Person customer;


    public Timeslot(int timeslotId, Service chosenService, Person chosenBarber, Person customer) {
        this.timeslotId = timeslotId;
        this.chosenService = chosenService;
        this.chosenBarber = chosenBarber;
        this.customer = customer;
    }


    public int getTimeslotId() {
        return timeslotId;
    }

    public void setTimeslotId(int timeslotId) {
        this.timeslotId = timeslotId;
    }

    public Service getChosenService() {
        return chosenService;
    }

    public void setChosenService(Service chosenService) {
        this.chosenService = chosenService;
    }

    public Person getChosenBarber() {
        return chosenBarber;
    }

    public void setChosenBarber(Person chosenBarber) {
        this.chosenBarber = chosenBarber;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return ("Timeslot ID: " + timeslotId + ", Had Barber: " + chosenBarber.toString() + "\nperform Service: " + chosenService.toString() + "\nfor Customer"+ customer.toString());
    }


}
