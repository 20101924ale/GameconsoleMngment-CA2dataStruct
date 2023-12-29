package com.example.gamesystemmanagement.models;

public class GamesMachine {
    public String name;
    public String manufacturer;
    public String description;
    public String type;
    public String media;
    public int launchYear;
    public double initialPrice;
    public String imageURL;

    public GamesMachine(String name, String manufacturer, String description, String type, String media, int launchYear, double initialPrice, String imageURL) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.description = description;
        this.type = type;
        this.media = media;
        this.launchYear = launchYear;
        this.initialPrice = initialPrice;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public double getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(double initialPrice) {
        this.initialPrice = initialPrice;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
