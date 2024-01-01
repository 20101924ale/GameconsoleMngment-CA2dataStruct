package com.example.gamesystemmanagement.controllers;

import com.example.gamesystemmanagement.models.GamesMachine;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class GamesMachineController {

    @FXML
    private TextField name;

    @FXML
    private TextField manufacturer;

    @FXML
    private TextField description;

    @FXML
    private TextField type;

    @FXML
    private TextField media;

    @FXML
    private TextField launchYear;

    @FXML
    private TextField initialPrice;

    @FXML
    private TextField imageURL;

    // Other methods and event handlers go here

    // Example event handler method
    @FXML
    private void addGamesMachine() {
        try {
            GamesMachine newMachine = createdMachineFromUser();
            // Call methods in your model or perform necessary actions
            // For example: gamesMachineController.addGamesMachine(newMachine);
            showAllGamesMachinesAdded();
            clearInfoGiven();
        } catch (NumberFormatException e) {
            sortInvalidInput();
        }
    }

    private GamesMachine createdMachineFromUser() {
        return new GamesMachine(
                name.getText(),
                manufacturer.getText(),
                description.getText(),
                type.getText(),
                media.getText(),
                Integer.parseInt(launchYear.getText()), // Assuming launchYear is an integer
                Double.parseDouble(initialPrice.getText()),
                imageURL.getText());
    }

    private void clearInfoGiven() {
        name.clear();
        manufacturer.clear();
        description.clear();
        type.clear();
        media.clear();
        launchYear.clear();
        initialPrice.clear();
        imageURL.clear();
    }

    private void sortInvalidInput() {
        if
            (name.getText().isEmpty() ||
                manufacturer.getText().isEmpty() ||
                description.getText().isEmpty() ||
                type.getText().isEmpty() ||
                media.getText().isEmpty() ||
                launchYear.getText().isEmpty() ||
                initialPrice.getText().isEmpty() ||
                imageURL.getText().isEmpty())

        System.out.println("Invalid!!");

    }

    private void showAllGamesMachinesAdded() {
        System.out.println("All Games Machines Added");
    }
}

