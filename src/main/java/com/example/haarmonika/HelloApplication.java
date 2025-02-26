package com.example.haarmonika;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("Hello-view.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("TidrejseAgenturet");
            primaryStage.setWidth(640);
            primaryStage.setHeight(360);
            primaryStage.show();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /*
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 360);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
     */









    public static void main(String[] args) {
        // start test here

        launch();
    }// main End
}// End