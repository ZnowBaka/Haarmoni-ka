package com.example.haarmonika;

import com.example.haarmonika.Controller.PersonController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CustomerCreationScreenView {
    PersonController personController = new PersonController();
    UIController UIController = new UIController();
    @FXML
    private TextField customerEmailTextField;
    @FXML
    private TextField customerPhoneTextField;
    @FXML
    private TextField customerFirstNameTextField;
    @FXML
    private TextField customerLastNameTextField;
    @FXML
    private Button customerCreateButton;

    public void onSaveButtonClicked(ActionEvent event) throws IOException {
        String email = customerEmailTextField.getText();
        String phoneNumber = customerPhoneTextField.getText();
        String firstName = customerFirstNameTextField.getText();
        String lastName = customerLastNameTextField.getText();
        personController.newCustomer(email, phoneNumber, firstName, lastName);
        UIController.switchToBookingScreen(event);
    }
}
