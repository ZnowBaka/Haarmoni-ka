package com.example.haarmonika;

import com.example.haarmonika.Model.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public final class LoginSystem {

    private static LoginSystem instance;
    private short maxLoginAttempts;
    private Person person;
    /*private String userLogin;
    private String password;
    */
    // DatabaseRepository
    // List userNames
    // List userPasses
    private Map<String,String>mockDatabase;


    private LoginSystem() {
        maxLoginAttempts = 10;
        mockDatabase = new HashMap<>();
        mockDatabase.put("username","password");
        mockDatabase.put("username1","password1");
        mockDatabase.put("username2","password2");
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
    /*
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
    public boolean login(String username, String password) {

        String sql = "SELECT * FROM employees WHERE username = ? AND password = ?";

        try (Connection connection = DriverManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            // retunere succes hvis user og pass stemmer overens
            return resultSet.next();
        } catch (Exception e) {
            e.printStackTrace();
            return false; // ved fejl retunere false
        }
    }


    public boolean checkLogin(String username, String password) {
        if (login(username, password) != true) {
            return false;
        } else {
            return true;
        }
    }
    */
    public boolean login(String username, String password) {
        return mockDatabase.containsKey(username)&& mockDatabase.get(username).equals(password);
    }

}// End
