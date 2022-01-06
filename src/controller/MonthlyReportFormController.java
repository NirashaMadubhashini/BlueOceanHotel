package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MonthlyReportFormController {
    public AnchorPane monthlyReportContext;
    public TableView tblMonthlyIncome;
    public TableColumn colMJan;
    public TableColumn colMFeb;
    public TableColumn colMMar;
    public TableColumn colMApr;
    public TableColumn colMMay;
    public TableColumn colMJun;

    public void backTomonthly(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) monthlyReportContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/IncomeReportForm.fxml"))));
    }
}
