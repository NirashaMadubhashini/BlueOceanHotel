package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.AddMealNew;

import java.io.IOException;
import java.util.ArrayList;

public class AddNewMealFormController {
    public AnchorPane addNewMealContext;
    public TableView tblAddNewMeal;
    public TableColumn colAddMon;
    public TableColumn colAddTue;
    public TableColumn colAddWed;
    public TableColumn colAddThu;
    public TableColumn colAddFri;
    public TableColumn colAddSat;
    public TableColumn colAddSun;
    public JFXTextField txtMon;
    public JFXTextField txtTue;
    public JFXTextField txtWed;
    public JFXTextField txtThu;
    public JFXTextField txtFri;
    public JFXTextField txtSat;
    public JFXTextField txtSun;


    static ArrayList<AddMealNew> addMealNewList=new ArrayList<>();

    public void initialize() {
        loadMealNew();
        colAddMon.setCellValueFactory(new PropertyValueFactory<>("mon"));
        colAddTue.setCellValueFactory(new PropertyValueFactory<>("tue"));
        colAddWed.setCellValueFactory(new PropertyValueFactory<>("wed"));
        colAddThu.setCellValueFactory(new PropertyValueFactory<>("thu"));
        colAddFri.setCellValueFactory(new PropertyValueFactory<>("fri"));
        colAddSat.setCellValueFactory(new PropertyValueFactory<>("sat"));
        colAddSun.setCellValueFactory(new PropertyValueFactory<>("sun"));
    }

    private void loadMealNew() {
        ObservableList<Object> tmObservableList = FXCollections.observableArrayList();
        for (AddMealNew temp : addMealNewList) {
            tmObservableList.add(new AddMealNew(temp.getMon(),temp.getTue(),temp.getWed(),temp.getThu(),temp.getFri(),temp.getSat(),temp.getSun()));
        }
        tblAddNewMeal.setItems(tmObservableList);
    }

    public void goMeal(ActionEvent actionEvent) throws IOException {
        AddMealNew addMealNew= new AddMealNew(txtMon.getText(),txtTue.getText(),txtWed.getText(),txtThu.getText(),txtFri.getText(),txtSat.getText(),txtSun.getText());
        if (addMealNewList.add(addMealNew)) {
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();
        } else {
            new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
        }
        Stage window = (Stage) addNewMealContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AddNewMealForm.fxml"))));
    }

    public void meal(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) addNewMealContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MealForm.fxml"))));
    }
}
