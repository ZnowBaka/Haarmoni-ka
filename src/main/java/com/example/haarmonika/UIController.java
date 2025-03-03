package com.example.haarmonika;

import com.example.haarmonika.Controller.PersonController;
import com.example.haarmonika.Model.Customer;
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

public class UIController {
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

    //endregion


    //region EmployeeSelectionScreen Controls
    @FXML
    private Label currentUserNameLabel;

    @FXML
    private Label currentUserIDLabel;

    @FXML
    public void onAdminOptionsButtonClick(ActionEvent event) throws IOException {
        switchToAdminSelectionScreen(event);
    }


    //Methods
    public void setCurrentUserLabels(Person currentUser) {
        setCurrentUserNameLabel(currentUser);
        setCurrentUserIDLabel(currentUser);
    }

    public void setCurrentUserNameLabel(Person currentUser) {
        currentUserNameLabel.setText("Current User: "
                + currentUser.getFirstName() + " " + currentUser.getLastName());
    }

    public void setCurrentUserIDLabel(Person currentUser) {
        currentUserIDLabel.setText("Worker ID: " + currentUser.getId());
    }


    //endregion


    //region EmployeeSchedule Controls
    @FXML
    private DatePicker currentUserScheduleDatePicker;

    @FXML
    private TableView currentUserScheduleTableView;

    public void onCurrentUserScheduleUpdateButtonClick(ActionEvent event) throws IOException {

    }
    //endregion


    //region Booking screen Controls
    @FXML
    private DatePicker bookingScreenDatePicker;

    @FXML
    private ChoiceBox bookingScreenChoseTimeslotBox;

    @FXML
    private ChoiceBox bookingScreenChoseServiceBox;

    @FXML
    private ChoiceBox bookingScreenChosePreferredBarberBox;

    @FXML
    private TableView bookingScreenTableView;

    public void onBookingScreenBookServiceButtonClick(ActionEvent event) throws IOException {

    }

    //endregion


    //region ChangeBookingScreen Controls
    @FXML
    private TableView changeBookingCurrentBookingTableView;

    @FXML
    private TableView changeBookingDesiredBookingTableView;

    @FXML
    private DatePicker changeBookingDatePicker;

    @FXML
    private ChoiceBox changeBookingDesiredBarberChoiceBox;

    @FXML
    private ChoiceBox changeBookingDesiredServiceChoiceBox;

    @FXML
    public void onChangeBookingTimeslotButtonClick(ActionEvent event) throws IOException {

    }

    @FXML
    public void onChangeBookingBarberButtonClick(ActionEvent event) throws IOException {

    }

    @FXML
    public void onChangeBookingServiceButtonClick(ActionEvent event) throws IOException {

    }

    @FXML
    public void onChangeBookingButtonClick(ActionEvent event) throws IOException {

    }

    //endregion


    //region AdminSelectionScreen Controls
    @FXML
    private TableView adminSelectionTableView;

    @FXML
    public void onAdminSelectionCreateEmployeeButtonClick(ActionEvent event) throws IOException {

    }

    @FXML
    public void onAdminSelectionModifyEmployeeButtonClick(ActionEvent event) throws IOException {

    }

    @FXML
    public void onAdminSelectionDeleteEmployeeButtonClick(ActionEvent event) throws IOException {

    }

    @FXML
    public void onAdminSelectionShowEntireScheduleButtonClick(ActionEvent event) throws IOException {

    }
    //endregion


    //region Switch Scene Controls
    @FXML
    public void switchToBookingScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("BookingScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Booking screen");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToChangeBookingScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ChangeBookingScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Change booking");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToDeleteBookingScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("DeleteBookingScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Booking Screen");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToCurrentUserSchedule(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("EmployeeScheduleScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Employee schedule");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToLoginScreen(ActionEvent event) throws IOException {
        resetCurrentUser(currentUser);

        root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login Screen");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToEmployeeSelectionScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("EmployeeSelectionScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("System controls");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToCustomerCreationScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("CustomerCreationScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Customer creation");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToAdminSelectionScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("AdminSelectionScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Admin system controls");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToAdminScheduleScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("AdminScheduleScreen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Admin schedule screen");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onBackToMainMenuClick(ActionEvent event) throws IOException {
        switchToEmployeeSelectionScreen(event);
    }


    //endregion


}// End