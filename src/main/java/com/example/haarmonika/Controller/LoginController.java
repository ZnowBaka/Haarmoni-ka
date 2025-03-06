package com.example.haarmonika.Controller;

import com.example.haarmonika.Model.Employee;
import com.example.haarmonika.Model.Person;
import com.example.haarmonika.Utilities.LoggedInUser;

public final class LoginController {
    DatabaseRepository databaseRepository = new DatabaseRepository();

    private static LoginController instance;
    LoggedInUser loggedInUser = LoggedInUser.getInstance();


    public LoginController() {
    }

    public static LoginController getInstance() {
        if (instance == null) {
            instance = new LoginController();
        }
        return instance;
    }


    // Methods
    public boolean checkLogin(Employee userEmployee) {
        System.out.println("Checking login");
        if (DatabaseRepository.login(userEmployee)){
            loggedInUser.setCurrentUser(userEmployee);
            return true;
        } else {
            return false;
        }
    }


}// End
