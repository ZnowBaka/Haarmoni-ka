package com.example.haarmonika;

import com.example.haarmonika.Controller.LoginController;
import com.example.haarmonika.Model.Employee;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

import java.io.IOException;

public class LoginScreenView {
    // We use a separate singleton class to verify login attempts, this way I/O from our database containing sensitive user data is kept separate from other operations
    LoginController loginSystem = LoginController.getInstance();
    UIController uiController = new UIController();
    // DatabaseRepo

    private Parent root;
    private Stage stage;
    private Scene scene;


    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    private Label loginScreenLabel;

    @FXML
    protected void onLoginButtonClick(ActionEvent event) throws IOException {
        try {
            loginScreenLabel.setText("Trying to login...");
            System.out.println("Login button clicked");
            Employee loginAttempt = new Employee(usernameField.getText(), passwordField.getText());

            if (loginSystem.checkLogin(loginAttempt)) {
                System.out.println("Employee logged in");
                uiController.switchToEmployeeSelectionScreen(event);

            } else {
                loginScreenLabel.setText("Invalid Username or Password");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    public void onExitButtonClick() {
        System.exit(0);
    }


    // Method to handle login
    private void handleLogin(Employee userLogginIn) {
        userLogginIn.setEmail(usernameField.getText());
        userLogginIn.setPassword(passwordField.getText());

        // instance af controller


        // Check login
        if (loginSystem.checkLogin(userLogginIn) == true) {
            loginScreenLabel.setText("Login Successful");
        } else {
            loginScreenLabel.setText("Login Failed");
        }
    }



    /*
    // When the LoginSystem has confirmed that a login is successful, we then store the users data
    public void storeLoggedInPersonAsCurrentUser(LoggedInUser loggedInUser, Person user) throws IOException {
        user = databaseRepo.getUser;
        loggedInUser.setCurrentUser(user);
    }
    */


}
