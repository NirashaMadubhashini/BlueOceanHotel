package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReserveRoomFormController<tm> {
    public AnchorPane reserveRoomContext;





    public void backToReserveRoom(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) reserveRoomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionWorkForm.fxml"))));
    }

    public void goToGuestDetail(ActionEvent actionEvent) throws IOException {
       Stage window = (Stage) reserveRoomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/GuestDetailForm.fxml"))));
    }


    public void goToCheck(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) reserveRoomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/CheckRoomAvailableForm.fxml"))));
    }

    public void goToFood(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) reserveRoomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/SelectMealForm.fxml"))));
    }
}
