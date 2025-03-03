package com.example.haarmonika;

import com.example.haarmonika.Controller.BookingController;
import com.example.haarmonika.Controller.PersonController;
import com.example.haarmonika.Controller.TimeslotController;
import com.example.haarmonika.Controller.WorkDayController;
import com.example.haarmonika.Model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BookingScreenView implements Initializable {
    UIController controller = new UIController();
    PersonController personController = new PersonController();
    BookingController bookingController = new BookingController();
    TimeslotController timeSlotController = new TimeslotController();
    WorkDayController workDaySchedule = new WorkDayController();
    //workDaySchedule.printSchedule();

    @FXML
    private DatePicker bookingScreenDatePicker;

    @FXML
    private ChoiceBox bookingScreenChoseTimeslotBox;

    @FXML
    private ChoiceBox bookingScreenChoseServiceBox;


    @FXML
    private ChoiceBox bookingScreenChosePreferredBarberBox;

    @FXML
    private TableView<Timeslot> bookingScreenTableView;

    @FXML
    private TableColumn<Timeslot, String> bookingScreenDateColumn;

    @FXML
    private TableColumn<Timeslot, String> bookingScreenTimeslotColumn;

    private ObservableList<Timeslot> getBookingScreenList(WorkDayController workDaySchedule) {
        ObservableList<Timeslot> workDayTimeslots = FXCollections.observableArrayList();
        workDaySchedule.fillTimeslots();
        for (int i = 0; i < workDaySchedule.length(); i++) {
            workDayTimeslots.add(workDaySchedule.getTimeslot(i));
        }
        return workDayTimeslots;
    }


    @FXML
    private TextField BookingScreenCustomerEmailTextField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        // Putting options into the choice-boxes
        String[] timeslotChoices = getBookingScreenList(workDaySchedule).toString().split(",");
        bookingScreenChoseTimeslotBox.getItems().addAll(timeslotChoices);

        //bookingScreenChoseServiceBox.getItems().addAll(possibleServices);

    }

    public void onBookingScreenBookServiceButtonClick(ActionEvent event) throws IOException {
        int selector;
        String bookingDate = bookingScreenDatePicker.getConverter().toString(bookingScreenDatePicker.getValue());
        Timeslot bookingTime = (Timeslot) bookingScreenChoseTimeslotBox.getValue();
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
                bookingController.createNewBooking(bookingDate, bookingTime.getTime(), barber.getId(), customer.getId(), service.getServiceId());
                break;
        }
    }

    public void onBackButtonClick(ActionEvent event) throws IOException {
        controller.onBackToMainMenuClick(event);
    }
}
