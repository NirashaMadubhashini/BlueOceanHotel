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

public class logAdminFormController {
    public AnchorPane logAdminContext;
    public JFXTextField txtUserAdminName;
    public JFXTextField txtUserAdminPas;


    public void admin(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) logAdminContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LogInForm.fxml"))));

    }

    public void adminWorkFormLog(ActionEvent actionEvent) throws IOException {

        if (txtUserAdminName.getText().equals("Admin")&txtUserAdminPas.getText().equals("123")) {
                Stage window = (Stage) logAdminContext.getScene().getWindow();
                window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminWorkForm.fxml"))));
            }
        }
    }


