package com.example.gamesystemmanagement.controllers;

import com.example.gamesystemmanagement.models.Game;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;
import java.util.List;
import java.util.LinkedList;
import java.util.stream.Collectors;
public class GameController {
    @FXML
    private TextField gameName;
    @FXML
    private TextField gameGenre;
    @FXML
    private TextField gamePrice;
    @FXML
    private TextField gameRating;
    @FXML
    private ListView<String> gameList;
    private List<Game> games = new LinkedList<>();

    public void listAllGames() {
        games.forEach(game -> gameList.getItems().add(game.toString()));
    }
    @FXML
    protected void onRemoveButtonClick() {
        Game game = new Game();
        game.setName(gameName.getText());
        game.setDescription(gameGenre.getText());
        game.setDeveloper(gamePrice.getText());
        game.setPublisher(gameRating.getText());
        game.setCoverImageURL(game.getCoverImageURL());
        game.setReleaseYear(game.getReleaseYear());
        games.remove(game);
        gameList.getItems().remove(game.toString());
    }


    @FXML
    protected void onEditButtonClick() {
        Game game = new Game();
        game.setName(gameName.getText());
        game.setDescription(gameGenre.getText());
        game.setDeveloper(gamePrice.getText());
        game.setPublisher(gameRating.getText());
        game.setCoverImageURL(game.getCoverImageURL());
        game.setReleaseYear(game.getReleaseYear());
        games.add(game);
        gameList.getItems().add(game.toString());
    }
    @FXML
    protected void onAddButtonClick() {
        Game game = new Game();
        game.setName(gameName.getText());
        game.setDescription(gameGenre.getText());
        game.setDeveloper(gamePrice.getText());
        game.setPublisher(gameRating.getText());
        game.setCoverImageURL(game.getCoverImageURL());
        game.setReleaseYear(game.getReleaseYear());
        games.add(game);
        gameList.getItems().add(game.toString());
    }
    @FXML
    protected void onSearchButtonClick() {
        List<Game> filteredGames = games.stream()
                .filter(game -> game.getName().equals(gameName.getText()))
                .collect(Collectors.toList());
        gameList.getItems().clear();
        filteredGames.forEach(game -> gameList.getItems().add(game.toString()));
    }
    @FXML
    protected void onClearButtonClick() {
        gameName.clear();
        gameGenre.clear();
        gamePrice.clear();
        gameRating.clear();
    }

}
