package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class DashBoardFormController {
    public AnchorPane dashBoardContext;


    public void home(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) dashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HomeForm.fxml"))));

    }

    public void about(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) dashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AboutUsForm.fxml"))));

    }

    public void contactTo(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) dashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ContactForm.fxml"))));

    }

    public void log(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) dashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LogInForm.fxml"))));

    }

    public void signUp(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) dashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/SignUpForm.fxml"))));
    }
}
