package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SelectMealFormController {
    public AnchorPane selectMealContext;

    public void goToCheckMeal(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)selectMealContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReserveRoomForm.fxml"))));
    }
}
