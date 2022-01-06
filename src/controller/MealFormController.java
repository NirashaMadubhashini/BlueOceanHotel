package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MealFormController {
    public AnchorPane mealContext;

    public void backToMeal(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) mealContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminWorkForm.fxml"))));

    }

    public void goToAddNewMealPage(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) mealContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AddNewMealForm.fxml"))));
    }

    public void goToDeleteMealPage(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) mealContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DeleteMealForm.fxml"))));
    }

    public void goToModifyMealPage(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) mealContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ModifyMealForm.fxml"))));
    }
}
