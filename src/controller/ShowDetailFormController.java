package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Guest;

import java.io.IOException;
import java.util.ArrayList;

public class ShowDetailFormController extends GuestDetailFormController{
    public AnchorPane showDetailContext;

    public TableColumn colGFName;
    public TableColumn colGLName;
    public TableColumn colGMail;
    public TableColumn colGMobileOne;
    public TableColumn colGMobileTwo;
    public TableColumn colGAddress;
    public TableColumn colGInDate;
    public TableColumn colGOutDate;
    public TableColumn colGNumber;
    public TableColumn colGRoomNo;
    public TableColumn colGAmount;
    public TableView tblGuest;

    ArrayList<Guest> guestArrayList = guestList;
    public void initialize() {
        loadGuest();
        colGFName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        colGLName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        colGMail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colGMobileOne.setCellValueFactory(new PropertyValueFactory<>("mobileOne"));
        colGMobileTwo.setCellValueFactory(new PropertyValueFactory<>("mobileTwo"));
        colGAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colGInDate.setCellValueFactory(new PropertyValueFactory<>("checkedInDate"));
        colGOutDate.setCellValueFactory(new PropertyValueFactory<>("checkedOutDate"));
        colGNumber.setCellValueFactory(new PropertyValueFactory<>("guestNumber"));
        colGRoomNo.setCellValueFactory(new PropertyValueFactory<>("roomType"));
        colGAmount.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));


    }

    public void loadGuest(){
        ObservableList<Guest> tmObservableList = FXCollections.observableArrayList();
        for (Guest temp : guestArrayList) {
            tmObservableList.add(new Guest(temp.getFirstName(),temp.getLastName(),temp.getEmail(),temp.getMobileOne(),temp.getMobileTwo(),temp.getAddress(),temp.getCheckedInDate(),temp.getCheckedOutDate(),temp.getGuestNumber(),temp.getRoomType(),temp.getTotalAmount()));
        }
        tblGuest.setItems(tmObservableList);
    }


    public void backToRuestForm(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) showDetailContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/GuestDetailForm.fxml"))));
    }
}
