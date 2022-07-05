package controller;

import Database.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginManagementController {
    public TextField txtUserName;
    public PasswordField txtPassword;
    public AnchorPane LoginManagementContext;

    int attempts=0;
    public void LogInOnaction(ActionEvent actionEvent) throws IOException {
        attempts++;
        if(attempts<=3){
            String tempUserName=txtUserName.getText();
            String tempPassword=txtPassword.getText();
            if(tempUserName.equals("Admin") && tempPassword.equals("0305")){

                Stage stage = (Stage) LoginManagementContext.getScene().getWindow();
                stage.close();
                Database.loweranp.getChildren().clear();
                Parent parent = FXMLLoader.load(getClass().getResource("../view/InParkingOnDeliveryForm.fxml"));
                Database.loweranp.getChildren().add(parent);




            }else{
                new Alert(Alert.AlertType.WARNING,"Try Again!!").show();
            }

        }else{
            txtUserName.setEditable(false);
            txtPassword.setEditable(false);
        }
    }

    public void CancelOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) LoginManagementContext.getScene().getWindow();
       stage.close();

    }
    
}
