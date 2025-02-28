package com.example.haarmonika;

import com.example.haarmonika.Controller.PersonController;
import com.example.haarmonika.Model.Customer;
import com.example.haarmonika.Model.Employee;
import com.example.haarmonika.Model.Person;
import com.example.haarmonika.Utilities.LoggedInUser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    private Parent root;
    private Stage stage;
    private Scene scene;

    PersonController personController = new PersonController();

    // We set our Controllers User object in our LoggedInUser Singleton, this way only a single specific Users information will be referred to if we make calls from our FXController
    LoggedInUser loggedInUser = LoggedInUser.getInstance();
    Person currentUser = loggedInUser.getCurrentUser();
    Customer customer;



    public void resetCurrentUser(Person currentUser) {
        currentUser = null;
    }


    //region Switch Scene Controls
    @FXML
    public void switchToBookingScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("BookingScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



    @FXML
    public void switchToChangeBookingScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ChangeBookingScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToDeleteBookingScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("DeleteBookingScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToCurrentUserSchedule(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("EmployeeScheduleScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToLoginScreen(ActionEvent event) throws IOException {
        resetCurrentUser(currentUser);

        root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToEmployeeSelectionScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("EmployeeSelectionScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToCustomerCreationScreen(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("CustomerCreationScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    //endregion


}// End