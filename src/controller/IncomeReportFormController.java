package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class IncomeReportFormController {
    public AnchorPane incomeReportContext;

    public void backToIncome(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)incomeReportContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminWorkForm.fxml"))));
    }

    public void goToMonthlyIncome(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) incomeReportContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MonthlyReportForm.fxml"))));
    }

    public void goToAnnualyIncome(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) incomeReportContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AnnualIncomeForm.fxml"))));
    }
}
