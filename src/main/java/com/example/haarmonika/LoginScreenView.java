package com.example.haarmonika;

import com.example.haarmonika.Controller.LoginController;
import com.example.haarmonika.Model.Employee;
import com.example.haarmonika.Utilities.LoggedInUser;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginScreenView {
    // We use a separate singleton class to verify login attempts, this way I/O from our database containing sensitive user data is kept separate from other operations
    LoginController loginSystem = LoginController.getInstance();
    // DatabaseRepo

    private Parent root;
    private Stage stage;
    private Scene scene;

    LoggedInUser loggedInUser = LoggedInUser.getInstance();
    Employee employee;


    @FXML
    private Label welcomeLabel;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    private Label loginScreenLabel;

    @FXML
    protected void onLoginButtonClick() {
        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        loginScreenLabel.setText("Trying to login...");
    }

    @FXML
    public void onExitButtonClick() {
        stage.close();
    }


    // Method to handle login
    private void handleLogin(Employee userLogginIn) {
        userLogginIn.setEmail(usernameField.getText());
        userLogginIn.setPassword(passwordField.getText());

        // instance af controller


        // Check login
        if (loginSystem.checkLogin(userLogginIn.getEmail(), userLogginIn.getPassword()) == true) {
            loginScreenLabel.setText("Login Successful");
        } else {
            loginScreenLabel.setText("Login Failed");
        }
    }




    /*
    @FXML
    public void switchToEmployeeSelectionScreen(ActionEvent event) throws IOException {
        storeLoggedInPersonAsCurrentUser(loggedInUser, person);
        root = FXMLLoader.load(getClass().getResource("EmployeeSelectionScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    // When the LoginSystem has confirmed that a login is successful, we then store the users data
    public void storeLoggedInPersonAsCurrentUser(LoggedInUser loggedInUser, Person user) throws IOException {
        user = databaseRepo.getUser;
        loggedInUser.setCurrentUser(user);
    }
    */


}
