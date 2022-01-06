package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionWorkFormController {
    public AnchorPane receptionWorkContext;



    public void reserveARoom(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)receptionWorkContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReserveRoomForm.fxml"))));
    }

    public void wentBack(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) receptionWorkContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LogInForm.fxml"))));

    }

    public void maintain(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) receptionWorkContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/RoomMaintainForm.fxml"))));
    }
}
