package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class LogInFormController {
    public AnchorPane logInFormContext;


    public void back(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) logInFormContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashBoardForm.fxml"))));

    }

    public void go(ActionEvent actionEvent) throws IOException {
                Stage window = (Stage) logInFormContext.getScene().getWindow();
                window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/logAdminForm.fxml"))));
    }

    public void went(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) logInFormContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LogReceptionForm.fxml"))));

    }
}
