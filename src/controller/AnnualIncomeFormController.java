package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AnnualIncomeFormController {
    public AnchorPane annualIncomeContext;
    public TableView tblAnnualIncome;
    public TableColumn colCurrentYear;
    public TableColumn colPriorYear;

    public void backToAnnualy(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) annualIncomeContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/IncomeReportForm.fxml"))));
    }
}
