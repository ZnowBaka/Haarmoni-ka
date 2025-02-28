package com.example.haarmonika.Controller;

import com.example.haarmonika.Model.Person;

public final class LoginSystem {

    private static LoginSystem instance;
    private short maxLoginAttempts;
    private Person person;
    private String userLogin;
    private String password;

    // DatabaseRepository
    // List userNames
    // List userPasses


    private LoginSystem() {
        maxLoginAttempts = 10;
    }

    public static LoginSystem getInstance() {
        if (instance == null) {
            instance = new LoginSystem();
        }
        return instance;
    }


    // Getters and Setters

    public short getMaxLoginAttempts() {
        return maxLoginAttempts;
    }

    public void setMaxLoginAttempts(short maxLoginAttempts) {
        this.maxLoginAttempts = maxLoginAttempts;
    }

    public Person getUser() {
        return person;
    }

    public void setUser(Person person) {
        this.person = person;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    // Methods



    public boolean checkLogin(String Email, String password) {
        if (!Datarepo.login(Email, password)) {
            return false;
        } else {
            return true;
        }
    }


}// End
