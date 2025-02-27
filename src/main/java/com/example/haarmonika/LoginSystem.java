package com.example.haarmonika;

import com.example.haarmonika.Model.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
