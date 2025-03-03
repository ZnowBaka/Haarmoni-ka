package com.example.haarmonika.Controller;

import com.example.haarmonika.Model.Timeslot;
import com.example.haarmonika.Model.WorkDay;

public class WorkDayController {
    WorkDay workDay;

    public WorkDayController() {
        workDay = new WorkDay();
        fillTimeslots();
    }

    public void fillTimeslots() {
        String[] timeslot24hText = {
                "09:00", "09:15", "09:30", "09:45",
                "10:00", "10:15", "10:30", "10:45",
                "11:00", "11:15", "11:30", "11:45",
                "12:00", "12:15", "12:30", "12:45",
                "13:00", "13:15", "13:30", "13:45",
                "14:00", "14:15", "14:30", "14:45",
                "15:00", "15:15", "15:30", "15:45",
        };

        for (int i = 0; i < timeslot24hText.length; i++) {
            workDay.addTimeslot(i, new Timeslot(i, timeslot24hText[i]));
        }
    }// This needs to be populated via our databaseRepository in the future

    public void printSchedule() {
        workDay.printTimeslots();
    }

    public int length() {
        return workDay.getLength();
    }

    public Timeslot getTimeslot(int i) {
        return workDay.getSpecificTimeslot(i);
    }


}
