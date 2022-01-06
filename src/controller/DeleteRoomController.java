package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class DeleteRoomController {
    public AnchorPane deleteRoomContext;
    public TableView tblDeleteRoom;
    public TableColumn colDeleteRoomNo;
    public TableColumn colDeleteRoomType;
    public TableColumn colDeleteRoomBed;
    public TableColumn colDeleteRoomNoBed;


    public void gotoRoom(ActionEvent actionEvent) throws IOException {
        /*Stage window = (Stage)deleteRoomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/RoomForm.fxml"))));*/
    }

    public void wenttoBack(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) deleteRoomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/RoomForm.fxml"))));
    }
}
