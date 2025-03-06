package com.example.haarmonika.Utilities;

import com.example.haarmonika.Model.Employee;

public final class LoggedInUser {

    private static LoggedInUser INSTANCE;
    private Employee currentUser;

    private LoggedInUser() {
    }

    public static LoggedInUser getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LoggedInUser();
        }
        return INSTANCE;
    }

    // getters and setters
    public Employee getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Employee currentUser) {
        this.currentUser = currentUser;
    }


}// End
