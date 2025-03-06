package com.example.haarmonika;

import com.example.haarmonika.Controller.DatabaseRepository;
import com.example.haarmonika.Controller.LoginController;
import com.example.haarmonika.Controller.WorkDayController;
import com.example.haarmonika.Model.Timeslot;
import com.example.haarmonika.Model.WorkDay;
import com.example.haarmonika.Utilities.NukeOnStart;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("login screen");
            primaryStage.setWidth(640);
            primaryStage.setHeight(400);
            primaryStage.show();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        // start test here
        NukeOnStart.NukeTime();
        launch();
    }// main End
}// End