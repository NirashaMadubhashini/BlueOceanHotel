package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RoomFormController {
    public AnchorPane roomContext;

    public void backToRoom(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) roomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminWorkForm.fxml"))));
    }

    public void goToAddNewRoomPage(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) roomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AddNewRoomForm.fxml"))));
    }

    public void goToDeleteNewRoomPage(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) roomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DeleteRoom.fxml"))));
    }

    public void goToModifyNewRoomPage(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) roomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ModifyRoomForm.fxml"))));
    }
}
