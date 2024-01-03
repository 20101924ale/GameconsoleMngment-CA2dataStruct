module com.example.gamesystemmanagement{
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gameapplication to javafx.fxml;
    exports com.example.gameapplication;
}