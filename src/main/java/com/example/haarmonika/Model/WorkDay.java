package com.example.haarmonika.Model;

public class WorkDay {
    private Timeslot[] workTime;

    public WorkDay() {
        this.workTime = new Timeslot[28];
    }

    public Timeslot[] getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Timeslot[] workTime) {
        this.workTime = workTime;
    }

    public void addTimeslot(int index, Timeslot timeslot) {
        if (index >= 0 && index < workTime.length) {
            workTime[index] = timeslot;
        } else {
            System.out.println("Invalid index: " + index);
        }
    }

    public Timeslot[] getTimeslots() {
        return workTime;
    }

    public void printTimeslots() {
        for (Timeslot t : workTime) {
            if (t != null) {
                System.out.println(t);
            }
        }
    }




}
