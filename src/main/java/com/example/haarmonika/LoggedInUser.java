package com.example.haarmonika;

import com.example.haarmonika.Model.User;

public final class LoggedInUser {

    private static LoggedInUser INSTANCE;
    private User currentUser;

    private LoggedInUser() {
    }

    public static LoggedInUser getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LoggedInUser();
        }
        return INSTANCE;
    }

    // getters and setters
    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

}// End
