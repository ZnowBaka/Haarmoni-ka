package com.example.haarmonika.Model;

public class Timeslot {
    private int timeslotId;
    private String time;

    public Timeslot(int timeslotId, Service chosenService, Person chosenBarber, Person customer) {
        this.timeslotId = timeslotId;

    }
    @Override
    public String toString() {
        return ("Timeslot ID: " + timeslotId + " Time: " + time);
    }

    public int getTimeslotId() {
        return timeslotId;
    }

    public void setTimeslotId(int timeslotId) {
        this.timeslotId = timeslotId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
