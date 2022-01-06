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
import model.ModifyMealNew;

import java.io.IOException;
import java.util.ArrayList;

public class ModifyMealFormController {
    public TableView tblModifyMeal;
    public TableColumn colModifyMon;
    public TableColumn colModifyTue;
    public TableColumn colModifyWed;
    public TableColumn colModifyThu;
    public TableColumn colModifyFri;
    public TableColumn colModifySat;
    public TableColumn colModifySun;
    public AnchorPane modifyMealContext;
    public JFXTextField txtMond;
    public JFXTextField txtTues;
    public JFXTextField txtWedn;
    public JFXTextField txtThus;
    public JFXTextField txtFrid;
    public JFXTextField txtSatu;
    public JFXTextField txtSund;

    static ArrayList<ModifyMealNew> modifyMealNewList=new ArrayList<>();

    public void initialize() {
        loadModifyMealNew();
        colModifyMon.setCellValueFactory(new PropertyValueFactory<>("mond"));
        colModifyTue.setCellValueFactory(new PropertyValueFactory<>("tues"));
        colModifyWed.setCellValueFactory(new PropertyValueFactory<>("wedn"));
        colModifyThu.setCellValueFactory(new PropertyValueFactory<>("thus"));
        colModifyFri.setCellValueFactory(new PropertyValueFactory<>("frid"));
        colModifySat.setCellValueFactory(new PropertyValueFactory<>("satu"));
        colModifySun.setCellValueFactory(new PropertyValueFactory<>("sund"));
    }

    private void loadModifyMealNew() {
        ObservableList<Object> tmObservableList = FXCollections.observableArrayList();
        for (ModifyMealNew temp : modifyMealNewList) {
            tmObservableList.add(new ModifyMealNew(temp.getMond(),temp.getTues(),temp.getWedn(),temp.getThus(),temp.getFrid(),temp.getSatu(),temp.getSund()));
        }
        tblModifyMeal.setItems(tmObservableList);
    }

    public void goModify(ActionEvent actionEvent) throws IOException {
        ModifyMealNew modifyMealNew= new ModifyMealNew(txtMond.getText(),txtTues.getText(),txtWedn.getText(),txtThus.getText(),txtFrid.getText(),txtSatu.getText(),txtSund.getText());
        if (modifyMealNewList.add(modifyMealNew)) {
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();
        } else {
            new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
        }
        Stage window = (Stage) modifyMealContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ModifyMealForm.fxml"))));
    }

    public void modify(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) modifyMealContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MealForm.fxml"))));
    }
}
