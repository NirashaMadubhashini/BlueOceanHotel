package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RoomMaintainFormController {
    public AnchorPane roomMaintainContext;
    public JFXTextField txtRoomNumber;
    public JFXTextField txtRDate;
    public JFXTextField txtRStartTime;
    public JFXTextField txtREndTime;

    public void goToMaintainRooms(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) roomMaintainContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionWorkForm.fxml"))));
    }
}
