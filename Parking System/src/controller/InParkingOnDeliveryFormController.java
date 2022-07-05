package controller;

import Database.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.InParking;
import model.OnDelivery;
import view.TM.InParkingTM;
import view.TM.OnDeliveryTM;

import java.io.IOException;
import java.util.Arrays;

public class InParkingOnDeliveryFormController {
    public AnchorPane InParkingContext;
    public ComboBox cmbInParking;
    public Button btnlogout;
    public TableView tblInParking;
    public TableColumn colVehicleNumber;
    public TableColumn colVehicleType;
    public TableColumn colParkingSlot;
    public TableColumn colParkedTime;

    public void initialize(){
        loadParkedTables();


        cmbInParking.getItems().add("In Parking");
        cmbInParking.getItems().add("On Delivery");


    }

    public void AddVehicleOnAction(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/AddVehicleForm.fxml"));
        Parent parent = fxmlLoader.load();
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }

    public void AddDriverOnAction(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/AddDriverForm.fxml"));
        Parent parent = fxmlLoader.load();
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void LogOutOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) InParkingContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ManagementLoginForm.fxml"))));

    }
   public void loadParkedTables(){
       ObservableList<InParkingTM> p = FXCollections.observableArrayList();

       for (InParking i : Database.inParkings) {
           InParkingTM ip = new InParkingTM(i.getVehicleNumber(), i.getVehicleType(), i.getParkingSlot(), i.getParkTime());
           p.add(ip);


       }
       colVehicleNumber.setCellValueFactory(new PropertyValueFactory("VehicleNumber"));
       colVehicleType.setCellValueFactory(new PropertyValueFactory("VehicleType"));
       colParkingSlot.setCellValueFactory(new PropertyValueFactory("ParkingSlot"));
       colParkedTime.setCellValueFactory(new PropertyValueFactory("ParkTime"));
       tblInParking.setItems(p);


   }
    public void loadDeliveryTables(){
        ObservableList<OnDeliveryTM> p = FXCollections.observableArrayList();

        for (OnDelivery i : Database.onDeliveries) {
            OnDeliveryTM ip = new OnDeliveryTM(i.getVehicleNum(), i.getVehiType(), i.getDriverName(), i.getLeaveTime());
            p.add(ip);


        }
        colVehicleNumber.setCellValueFactory(new PropertyValueFactory("VehicleNum"));
        colVehicleType.setCellValueFactory(new PropertyValueFactory("VehiType"));
        colParkingSlot.setCellValueFactory(new PropertyValueFactory("DriverName"));
        colParkedTime.setCellValueFactory(new PropertyValueFactory("LeaveTime"));
        tblInParking.setItems(p);

    }

    public void InParkOnDeliveryOnAction(ActionEvent actionEvent) {
        if (cmbInParking.getValue().equals("On Delivery")){
            colParkingSlot.setText("Driver Name");
            colParkedTime.setText("Leave Time");
            btnlogout.setVisible(false);
            loadDeliveryTables();
        }
        if (cmbInParking.getValue().equals("In Parking")){
            btnlogout.setVisible(true);
            colParkingSlot.setText("Parking Slot");
            colParkedTime.setText("Parked Time");

            loadParkedTables();
        }

    }
}
