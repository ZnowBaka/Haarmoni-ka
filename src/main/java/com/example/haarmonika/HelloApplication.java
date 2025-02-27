package com.example.haarmonika;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;


import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
   @Override
    public void start(Stage primaryStage) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("login screen");
            primaryStage.setWidth(640);
            primaryStage.setHeight(360);
            primaryStage.show();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        // Create an instance of the LoginSystem
        LoginSystem loginSystem = LoginSystem.getInstance();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;

        while (!loggedIn) {
            // Prompt the user for username and password
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            // Attempt to log in
            if (loginSystem.login(username, password)) {
                System.out.println("Login successful!");
                loggedIn = true; // Set loggedIn to true to exit the loop
                // You can add additional logic here, such as loading the main application
            } else {
                System.out.println("Login failed. Please check your username and password.");
                System.out.print("Would you like to try again? (yes/no): ");
                String response = scanner.nextLine();
                if (!response.equalsIgnoreCase("yes")) {
                    System.out.println("Exiting the application.");
                    break; // Exit the loop if the user does not want to try again
                }
            }
        }

    }// main End
}// End