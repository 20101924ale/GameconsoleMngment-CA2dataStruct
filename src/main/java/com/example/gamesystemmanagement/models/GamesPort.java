package com.example.gamesystemmanagement.models;

public class GamesPort {
    public Game originalGame;
    public String newMachine;
    public String portDeveloper;
    public int portReleaseYear;
    public String coverImageURL;

    public GamesPort(Game originalGame, String newMachine, String portDeveloper, int portReleaseYear, String coverImageURL) {
        this.originalGame = originalGame;
        this.newMachine = newMachine;
        this.portDeveloper = portDeveloper;
        this.portReleaseYear = portReleaseYear;
        this.coverImageURL = coverImageURL;
    }

    public Game getOriginalGame() {
        return originalGame;
    }

    public void setOriginalGame(Game originalGame) {
        this.originalGame = originalGame;
    }

    public String getNewMachine() {
        return newMachine;
    }

    public void setNewMachine(String newMachine) {
        this.newMachine = newMachine;
    }

    public String getPortDeveloper() {
        return portDeveloper;
    }

    public void setPortDeveloper(String portDeveloper) {
        this.portDeveloper = portDeveloper;
    }

    public int getPortReleaseYear() {
        return portReleaseYear;
    }

    public void setPortReleaseYear(int portReleaseYear) {
        this.portReleaseYear = portReleaseYear;
    }

    public String getCoverImageURL() {
        return coverImageURL;
    }

    public void setCoverImageURL(String coverImageURL) {
        this.coverImageURL = coverImageURL;
    }
}
