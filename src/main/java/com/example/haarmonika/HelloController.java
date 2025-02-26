package com.example.haarmonika;

import com.example.haarmonika.Model.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    private Parent root;
    private Stage stage;
    private Scene scene;

    // We set our Controllers User object in our LoggedInUser Singleton, this way only a single specific Users information will be referred to if we make calls from our FXController
    LoggedInUser loggedInUser = LoggedInUser.getInstance();
    Person currentPerson = loggedInUser.getCurrentUser();







    //region Switch Scene Controls
    @FXML
    public void switchToExampleScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Exmaple.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToExampleScene01(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Exmaple.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //endregion


}// End