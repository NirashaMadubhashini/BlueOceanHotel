package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminWorkFormController {
    public AnchorPane AdminWorkContext;

    public void goBack(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) AdminWorkContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LogInForm.fxml"))));


    }

    public void room(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) AdminWorkContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/RoomForm.fxml"))));
    }

    public void meal(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) AdminWorkContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MealForm.fxml"))));

    }

    public void incomeReport(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) AdminWorkContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/IncomeReportForm.fxml"))));
    }
}
