package com.example.haarmonika;


import com.example.haarmonika.Model.Employee;
import com.example.haarmonika.Utilities.LoggedInUser;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeSelectionScreenView implements Initializable {

    private final com.example.haarmonika.UIController uiController = new com.example.haarmonika.UIController();
    LoggedInUser loggedInUser = LoggedInUser.getInstance();
    Employee currentUser = loggedInUser.getCurrentUser();

    @FXML
    private Label currentUserNameLabel;

    @FXML
    private Label currentUserIDLabel;

    @FXML
    public void onAdminOptionsButtonClick(ActionEvent event) throws IOException {
        uiController.switchToAdminSelectionScreen(event);
    }

    //Methods
    public void setCurrentUserLabels(Employee currentUser) {
        setCurrentUserNameLabel(currentUser);
        setCurrentUserIDLabel(currentUser);
    }


    public void setCurrentUserNameLabel(Employee currentUser) {
        currentUserNameLabel.setText("Current User: "
                + currentUser.getFirstName() + " " + currentUser.getLastName());
    }


    public void setCurrentUserIDLabel(Employee currentUser) {
        currentUserIDLabel.setText("Worker ID: " + currentUser.getId());
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loggedInUser = LoggedInUser.getInstance();
        currentUser = loggedInUser.getCurrentUser();
        setCurrentUserLabels(currentUser);


    }


    @FXML
    public void switchToBookingScreen(ActionEvent event) throws IOException {
        uiController.switchToBookingScreen(event);
    }

    @FXML
    public void switchToChangeBookingScreen(ActionEvent event) throws IOException {
        uiController.switchToChangeBookingScreen(event);
    }

    @FXML
    public void switchToDeleteBookingScreen(ActionEvent event) throws IOException {
        uiController.switchToDeleteBookingScreen(event);
    }

    @FXML
    public void switchToCurrentUserSchedule(ActionEvent event) throws IOException {
        uiController.switchToCurrentUserSchedule(event);
    }

    @FXML
    public void switchToLoginScreen(ActionEvent event) throws IOException {
        uiController.switchToLoginScreen(event);
    }

    @FXML
    public void switchToEmployeeSelectionScreen(ActionEvent event) throws IOException {
        uiController.switchToEmployeeSelectionScreen(event);
    }

    @FXML
    public void switchToCustomerCreationScreen(ActionEvent event) throws IOException {
        uiController.switchToCustomerCreationScreen(event);
    }

    @FXML
    public void switchToAdminSelectionScreen(ActionEvent event) throws IOException {
        uiController.switchToAdminSelectionScreen(event);
    }

    @FXML
    public void switchToAdminScheduleScreen(ActionEvent event) throws IOException {
        uiController.switchToAdminScheduleScreen(event);
    }

    @FXML
    public void onExitButtonClick() {
        uiController.onExitButtonClick();
    }

    @FXML
    public void onBackToMainMenuClick(ActionEvent event) throws IOException {
        uiController.onBackToMainMenuClick(event);
    }


}
