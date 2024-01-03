package com.example.gamesystemmanagement.controllers;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class Mainmenu {
        public void openFXML(String fxml) {
            try {
                Parent root = FXMLLoader.load(getClass().getResource(fxml));
                Stage stage = new Stage();
                stage.setTitle("Game System Management");
                stage.setScene(new Scene(root, 600, 400));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void openGameMenu() {
            openFXML("GameMenu.fxml");
        }

        public void openGameMachineMenu() {
            openFXML("GameMachineMenu.fxml");
        }

        public void openGamePortMenu() {
            openFXML("GamePortMenu.fxml");
        }
}
