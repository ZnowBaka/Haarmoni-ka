package com.example.haarmonika;

import com.example.haarmonika.Controller.BookingController;
import com.example.haarmonika.Controller.PersonController;
import com.example.haarmonika.Controller.TimeSlotController;
import com.example.haarmonika.Model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BookingScreenView implements Initializable{
    HelloController controller = new HelloController();
    PersonController personController = new PersonController();
    BookingController bookingController = new BookingController();
    TimeSlotController timeSlotController = new TimeSlotController();
    @FXML
    private DatePicker bookingScreenDatePicker;

    @FXML
    private ChoiceBox bookingScreenChoseTimeslotBox;
    private String[] possibleTimeslots = {"9-10", "10-11", "11-12"};// We need to call the database to get a string of all our services

    @FXML
    private ChoiceBox bookingScreenChoseServiceBox;
    private String[] possibleServices = {"Short cuts", "long cuts", "trim", "Hair dyeing"};// We need to call DB to get a String all services

    @FXML
    private ChoiceBox bookingScreenChosePreferredBarberBox;
    private String[] possibleBarbers = {"Fabian", "Stine", "Christine"};// We need to find out what Barbers are available

    @FXML
    private TableView<Timeslot> bookingScreenTableView;

    @FXML
    private TableColumn<Timeslot, String> bookingScreenDateColumn;

    @FXML
    private TableColumn<Timeslot, String> bookingScreenTimeslotColumn;

    private ObservableList<Timeslot> getBookingScreenList(){
        ObservableList<Timeslot> WorkWeekSchedule = FXCollections.observableArrayList();
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String[] timeSlots = {"09:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00"};

        for (String day : days) {
            for (Timeslot timeSlot : timeSlotController.getTimeSlots()) {
                WorkWeekSchedule.add(timeSlotController.getTimeSlots().get(timeSlot).getTime());
            }
        }
    }


    @FXML
    private TextField BookingScreenCustomerEmailTextField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        // Putting options into the choice-boxes
        bookingScreenChoseTimeslotBox.getItems().addAll(possibleTimeslots);
        bookingScreenChoseServiceBox.getItems().addAll(possibleServices);

    }

    public void onBookingScreenBookServiceButtonClick(ActionEvent event) throws IOException {
        int selector;
        String bookingTimeString = bookingScreenDatePicker.getConverter().toString(bookingScreenDatePicker.getValue());
        Timeslot timeslot = (Timeslot) bookingScreenChoseTimeslotBox.getValue();
        Service service = (Service) bookingScreenChoseServiceBox.getValue();
        Employee barber = (Employee) bookingScreenChosePreferredBarberBox.getValue();
        String email = BookingScreenCustomerEmailTextField.getText();
        Customer customer = personController.findCustomer(email);
        if (customer != null) {
            selector = 2;
        } else {
            selector = 1;
        }
        switch (selector) {
            case 1:
                controller.switchToCustomerCreationScreen(event);
                break;
            case 2:
                bookingController.createNewBooking(bookingTimeString, timeslot, service, barber, customer);
                break;
        }
    }
    public void onBackButtonClick(ActionEvent event) throws IOException {
        controller.onBackToMainMenuClick(event);
    }
}
