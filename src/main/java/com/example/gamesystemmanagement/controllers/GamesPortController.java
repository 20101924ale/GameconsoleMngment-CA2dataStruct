package com.example.gamesystemmanagement.controllers;
import com.example.gamesystemmanagement.models.GamesMachine;
import com.example.gamesystemmanagement.models.GamesPort;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;
import java.util.List;
import java.util.LinkedList;
import java.util.HashMap;
public class GamesPortController {
    @FXML
    private TextField machineName;
    @FXML
    private TextField machineType;
    @FXML
    private TextField machineYear;
    @FXML
    private TextField machinePrice;
    @FXML
    private TextField machineRating;
    @FXML
    private TextField machineImageURL;
    @FXML
    private ListView<String> machineList;
    private final List<GamesMachine> machines = new LinkedList<>();
    private GamesMachineNode head;
    private GamesMachine pickedMachine;
    private final String fileName = "GamesMachine.xml";
    private HashMap<String, GamesMachine> machineHashMap;
    public GamesPortController() {
        machineHashMap = new HashMap<>();
    }
    @FXML
    protected void onRemoveButtonClick() {
        deleteMachine(machineName.getText());
    }
    private void deleteMachine(String text) {
        GamesMachineNode current = head;
        GamesMachineNode previous = null;
        while (current != null) {
            if (current.getMachine().getName().equals(text)) {
                if (previous == null) {
                    head = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }
                machineList.getItems().remove(current.getMachine().getName());
                break;
            }
            previous = current;
            current = current.getNext();
        }
    }
    @FXML
    protected void onAddButtonClick() {
        GamesMachine machine = new GamesMachine();
        machine.setName(machineName.getText());
        machine.setType(machineType.getText());
        machine.setYear(machineYear.getText());
        machine.setPrice(machinePrice.getText());
        machine.setRating(machineRating.getText());
        machine.setImageURL(machineImageURL.getText());
        addMachine(machine);
    }
    private void addMachine(GamesMachine machine) {
        if (machineHashMap.containsKey(machine.getName())) {
            return;
        }
        machineHashMap.put(machine.getName(), machine);
        machineList.getItems().add(machine.getName());
        if (head == null) {
            head = new GamesMachineNode(machine);
        } else {
            GamesMachineNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new GamesMachineNode(machine));
        }
    }
    @FXML
    protected void onEditButtonClick() {
        GamesPort machine = new GamesPort();
        machine.setName(machineName.getText());
        machine.setType(machineType.getText());
        machine.setYear(machineYear.getText());
        machine.setPrice(machinePrice.getText());
        machine.setRating(machineRating.getText());
        machine.setImageURL(machineImageURL.getText());
        editMachine(machine);
    }

}
