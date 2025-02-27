package com.example.haarmonika;

import com.example.haarmonika.Model.Person;

public final class LoggedInUser {

    private static LoggedInUser INSTANCE;
    private Person currentUser;

    public LoggedInUser() {
    }

    public static LoggedInUser getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LoggedInUser();
        }
        return INSTANCE;
    }

    // getters and setters
    public Person getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Person currentUser) {
        this.currentUser = currentUser;
    }


}// End
