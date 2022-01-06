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
import model.AddRoom;

import java.io.IOException;
import java.util.ArrayList;


public class AddNewRoomFormController {
    public AnchorPane addNewRoomContext;

    public TableView<Object> tblAddNewRoom;
    public TableColumn colAddRoomNo;
    public TableColumn colAddRoomType;
    public TableColumn colAddRoomBedType;
    public TableColumn colAddRoomBed;
    public JFXTextField txtARoomNo;
    public JFXTextField txtARoomType;
    public JFXTextField txtABedType;
    public JFXTextField txtABedNo;

    static ArrayList<AddRoom> addRoomList =new ArrayList<>();


    public void initialize() {
        loadAddRoom();
        colAddRoomNo.setCellValueFactory(new PropertyValueFactory<>("roomNo"));
        colAddRoomType.setCellValueFactory(new PropertyValueFactory<>("roomType"));
        colAddRoomBedType.setCellValueFactory(new PropertyValueFactory<>("typeofBed"));
        colAddRoomBed.setCellValueFactory(new PropertyValueFactory<>("noOfBeds"));
    }

    private void loadAddRoom() {
        ObservableList<Object> tmObservableList = FXCollections.observableArrayList();
        for (AddRoom temp : addRoomList) {
            tmObservableList.add(new AddRoom(temp.getRoomNo(),temp.getRoomType(),temp.getTypeofBed(),temp.getNoOfBeds()));
        }
       tblAddNewRoom.setItems(tmObservableList);
    }



    public void goRoom(ActionEvent actionEvent) throws IOException {
        AddRoom addRoom = new AddRoom(txtARoomNo.getText(),txtARoomType.getText(),txtABedType.getText(),txtABedNo.getText());
        if (addRoomList.add(addRoom)) {
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();
        } else {
            new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
        }
        Stage window = (Stage) addNewRoomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AddNewRoomForm.fxml"))));
    }

    public void goBack(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) addNewRoomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/RoomForm.fxml"))));
    }
}


