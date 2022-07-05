package controller;

import Database.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Driver;
import model.Vehicle;

import java.io.IOException;
import java.util.Optional;

public class AddDriverFormController {
    public AnchorPane AddDriverContext;
    public TextField txtDriverName;
    public TextField txtDrivingLicense;
    public TextField txtContactNo;
    public TextField txtNIC;
    public TextField txtAddress;

    public void WrongMarkOnAction(ActionEvent actionEvent) throws IOException {

    }

    public void AddDriverOnAction(ActionEvent actionEvent) {

            if (txtDriverName.getText().equals("") || txtNIC.getText().equals("") ||txtDrivingLicense.getText().equals("") ||txtAddress.getText().equals("") || txtContactNo.getText().equals("")  ) {



                Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"DATA NOT ENTERED",
                        ButtonType.OK);
                Optional<ButtonType> buttonType = alert.showAndWait();

                if(buttonType.get().equals(ButtonType.OK)){


                }

            }
            else {

                if (txtDriverName.getText().matches("[A-Z]{1}[a-z]*[ ][A-Z]{1}[a-z]*") && txtNIC.getText().matches("[0-9]{10}[V]") && txtDrivingLicense.getText().matches("[B][0-9]{7}") &&
                        txtAddress.getText().matches("[A-Z]{1}[a-z]*") && txtContactNo.getText().matches("[0]{1}[0-9]{2}[-][0-9]{7}")){

                    Driver d2 = new Driver(txtDriverName.getText(), txtNIC.getText(), txtDrivingLicense.getText(), txtAddress.getText(), txtContactNo.getText());
                    Database.drivers.add(d2);
                    new Alert(Alert.AlertType.CONFIRMATION,"Successfully Added!!").show();
                    Stage stage = (Stage) AddDriverContext.getScene().getWindow();
                    stage.close();
                }else {

                    Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"DATA NOT ENTERED",
                            ButtonType.OK);
                    Optional<ButtonType> buttonType = alert.showAndWait();

                    if(buttonType.get().equals(ButtonType.OK)){

                        txtContactNo.setText("");

                    }
                }


            }
        }


    }




