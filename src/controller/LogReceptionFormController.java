package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LogReceptionFormController {
    public JFXTextField txtReceptionUser;
    public JFXTextField txtReceptionPs;
    public AnchorPane logReceptionContext;




    public void logReception(ActionEvent actionEvent) throws IOException {
        if (txtReceptionUser.getText().equals("Abc")&txtReceptionPs.getText().equals("1234")) {
            Stage window = (Stage) logReceptionContext.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionWorkForm.fxml"))));
        }
    }

    public void reception(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) logReceptionContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LogInForm.fxml"))));

    }
}
