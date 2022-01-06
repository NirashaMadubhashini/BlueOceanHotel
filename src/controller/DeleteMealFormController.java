package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DeleteMealFormController {
    public AnchorPane deleteMealContext;
    public TableView tblDeleteMeal;
    public TableColumn colDeleteMon;
    public TableColumn colDeleteTue;
    public TableColumn colDeleteWed;
    public TableColumn colDeleteThu;
    public TableColumn colDeleteFri;
    public TableColumn colDeleteSat;
    public TableColumn colDeleteSun;


    public void goDelete(ActionEvent actionEvent) throws IOException {
       /* Stage window = (Stage) deleteMealContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MealForm.fxml"))));*/
    }

    public void delete(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) deleteMealContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MealForm.fxml"))));
    }
}
