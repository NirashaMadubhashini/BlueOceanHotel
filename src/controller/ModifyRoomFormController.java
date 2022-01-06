package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.ModelRoom;

import java.io.IOException;
import java.util.ArrayList;


public class ModifyRoomFormController {
    public AnchorPane modifyRoomContext;
    public TableView tblModifyRoom;
    public TableColumn colModifyRoomNo;
    public TableColumn colModifyType;
    public TableColumn colModifyRoomBed;
    public TableColumn colModifyRoomNoBed;
    public JFXTextField txtRoom;
    public JFXTextField txtRoomM;
    public JFXTextField txtBed;
    public JFXTextField txtBedNum;



    static ArrayList<ModelRoom> modelRoomList =new ArrayList<>();

    public void initialize() {
        loadModelRoom();
        colModifyRoomNo.setCellValueFactory(new PropertyValueFactory<>("room"));
        colModifyType.setCellValueFactory(new PropertyValueFactory<>("roomM"));
        colModifyRoomBed.setCellValueFactory(new PropertyValueFactory<>("bed"));
        colModifyRoomNoBed.setCellValueFactory(new PropertyValueFactory<>("bedNum"));
    }

    private void loadModelRoom() {
        ObservableList<Object> tmObservableList = FXCollections.observableArrayList();
        for (ModelRoom temp : modelRoomList) {
            tmObservableList.add(new ModelRoom(temp.getRoom(),temp.getRoomM(),temp.getBed(),temp.getBedNum()));
        }
        tblModifyRoom.setItems(tmObservableList);
    }

    public void room(ActionEvent actionEvent) throws IOException {
        ModelRoom modelRoom = new ModelRoom(txtRoom.getText(),txtRoomM.getText(),txtBed.getText(),txtBedNum.getText());
        if (modelRoomList.add(modelRoom)) {
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();
        } else {
            new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
        }
        Stage window = (Stage) modifyRoomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ModifyRoomForm.fxml"))));
    }

    public void toBack(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) modifyRoomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/RoomForm.fxml"))));
    }
}
