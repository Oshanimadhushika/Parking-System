package controller;

import Database.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Vehicle;

import java.io.IOException;
import java.util.Optional;

public class AddVehicleFormController {
    public AnchorPane AddVehicleContext;
    public ComboBox cmbVehicleType;
    public TextField txtVehicleNumber;
    public TextField txtMaximumWeight;
    public TextField txtNoOfPassengers;

    public void initialize() {
        cmbVehicleType.getItems().add("Van");
        cmbVehicleType.getItems().add("Cargo Lorry");
        cmbVehicleType.getItems().add("Bus");
    }

    public void WrongMarkOnAction(ActionEvent actionEvent) throws IOException {

    }

    public void AddVehicleOnAction(ActionEvent actionEvent) {
        if (txtVehicleNumber.getText().equals("") || txtMaximumWeight.getText().equals("") || txtNoOfPassengers.getText().equals("") || cmbVehicleType.getValue() == null) {


            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "DATA NOT ENTERED",
                    ButtonType.OK);
            Optional<ButtonType> buttonType = alert.showAndWait();

            if (buttonType.get().equals(ButtonType.OK)) {


            }

        } else {

            switch ((String) cmbVehicleType.getValue()) {
                case "Van":
                    if (txtVehicleNumber.getText().matches("[A-Z 0-9]{2}[-][0-9]{4}") && txtMaximumWeight.getText().matches("[0-9]{3}") && txtNoOfPassengers.getText().matches("[0-9]{1,2}")) {
                        Vehicle v1 = new Vehicle(txtVehicleNumber.getText(), (String) cmbVehicleType.getValue(), txtMaximumWeight.getText(), txtNoOfPassengers.getText());
                        Database.vehicles.add(v1);
                        new Alert(Alert.AlertType.CONFIRMATION,"Successfully Added!");

                        Stage stage = (Stage) AddVehicleContext.getScene().getWindow();
                        stage.close();
                    } else {
                        new Alert(Alert.AlertType.WARNING, "Data not Validate!").show();
                    }
                    break;

                case "Cargo Lorry":
                    if (txtVehicleNumber.getText().matches("[A-Z 0-9]{2}[-][0-9]{4}") && txtMaximumWeight.getText().matches("[0-9]{5}") && txtNoOfPassengers.getText().matches("[0-9]{1,2}")) {
                        Vehicle v1 = new Vehicle(txtVehicleNumber.getText(), (String) cmbVehicleType.getValue(), txtMaximumWeight.getText(), txtNoOfPassengers.getText());
                        Database.vehicles.add(v1);
                        new Alert(Alert.AlertType.CONFIRMATION,"Successfully Added!");

                        Stage stage = (Stage) AddVehicleContext.getScene().getWindow();
                        stage.close();
                    } else {
                        new Alert(Alert.AlertType.WARNING, "Data not Validate!").show();
                    }
                    break;

                case "Bus":
                    if (txtVehicleNumber.getText().matches("[A-Z 0-9]{2}[-][0-9]{4}") && txtMaximumWeight.getText().matches("[0-9]{4}") && txtNoOfPassengers.getText().matches("[0-9]{1,2}")) {
                        Vehicle v1 = new Vehicle(txtVehicleNumber.getText(), (String) cmbVehicleType.getValue(), txtMaximumWeight.getText(), txtNoOfPassengers.getText());
                        Database.vehicles.add(v1);
                        new Alert(Alert.AlertType.CONFIRMATION,"Successfully Added!");

                        Stage stage = (Stage) AddVehicleContext.getScene().getWindow();
                        stage.close();
                    } else {
                        new Alert(Alert.AlertType.WARNING, "Data not Validate!").show();
                    }
                    break;
            }
        }

    }
}