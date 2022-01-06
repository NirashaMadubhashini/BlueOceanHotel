package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpFormController {
    public AnchorPane signUpContext;
    public JFXTextField txtSName;
    public JFXTextField txtSNic;
    public JFXTextField txtSEmail;
    public JFXTextField txtSAddress;
    public JFXTextField txtSTelephone;

    public void goToReception(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) signUpContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionWorkForm.fxml"))));
    }

    public void goToDashBoard(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) signUpContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashBoardForm.fxml"))));
    }
}
