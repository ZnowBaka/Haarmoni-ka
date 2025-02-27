package com.example.haarmonika;

import com.example.haarmonika.Model.Customer;
import com.example.haarmonika.Model.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    private Parent root;
    private Stage stage;
    private Scene scene;

    // We set our Controllers User object in our LoggedInUser Singleton, this way only a single specific Users information will be referred to if we make calls from our FXController
    LoggedInUser loggedInUser = LoggedInUser.getInstance();
    Person currentUser = loggedInUser.getCurrentUser();
    Customer customer;

    //region Shared Screen Controls
    @FXML
    public void onLogOutButtonClick(ActionEvent event, Person currentUser) throws IOException {
        resetCurrentUser(currentUser);
        switchToLoginScreen(event);
    }

    @FXML
    public void onBackToMainMenuClick(ActionEvent event) throws IOException {
        switchToEmployeeSelectionScreen(event);
    }

    public void resetCurrentUser(Person currentUser) {
        currentUser = null;
    }

    //endregion


    //region EmployeeSelectionScreen Controls
    @FXML
    private Label currentUserNameLabel;

    @FXML
    private Label currentUserIDLabel;


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


    //endregion


}// End