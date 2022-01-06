package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Guest;

import java.io.IOException;
import java.util.ArrayList;

public class GuestDetailFormController {
    public AnchorPane guestDetailContext;

    public JFXTextField txtFirstName;
    public JFXTextField txtLastName;
    public JFXTextField txtEmail;
    public JFXTextField txtMobileOne;
    public JFXTextField txtMobileTwo;
    public JFXTextField txtAddress;
    public JFXTextField txtCheckedInDate;
    public JFXTextField txtCheckOutDate;
    public JFXTextField txtGuestNumber;
    public JFXTextField txtRoomType;
    public JFXTextField txtTotalAmount;


    static ArrayList<Guest> guestList =new ArrayList<>();


    public void goToReserve(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) guestDetailContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReserveRoomForm.fxml"))));
    }

    public void showDetails(ActionEvent actionEvent) throws IOException {
       Guest guest = new Guest(txtFirstName.getText(), txtLastName.getText(), txtEmail.getText(), txtMobileOne.getText(),txtMobileTwo.getText(),txtAddress.getText(),txtCheckedInDate.getText(),txtCheckOutDate.getText(),txtGuestNumber.getText(),txtRoomType.getText(),txtTotalAmount.getText());
        if (guestList.add(guest)) {
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();
        } else {
            new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
        }


        Stage window = (Stage) guestDetailContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ShowDetailForm.fxml"))));


    }
}