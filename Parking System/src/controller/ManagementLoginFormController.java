package controller;

import Database.Database;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import model.Driver;
import model.InParking;
import model.OnDelivery;
import model.Vehicle;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;

public class ManagementLoginFormController extends ParkingSlotAndType {
    public AnchorPane ManagementContext;
    public ComboBox<String> cmbSelectVehicle;
    public ComboBox<String> cmbDriver;
    public Label lblSlotNumber;
    public Label lblDate;
    public Label lblTime;
    public Label lblVehicleType;
    String AddVehicleNumber[]=new String[14];
    int Next;

   // VehicleParkCollection vehicleParkCollection=new VehicleParkCollection();
    ParkingSlotAndType parkingSlotAndType=new ParkingSlotAndType();

    public void initialize() {

        cmbSelectVehicle.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->{
            park(newValue);
            if (isExistsSlot()){
                lblSlotNumber.setText("Already Parked!");
            }else{
                lblSlotNumber.setText(vehicleSlot);
            }
        } );

        dateAndTime();

        ObservableList<String> vehicleList= FXCollections.observableArrayList();
        for (Vehicle v1: Database.vehicles){
            vehicleList.add(v1.getVehicleNumber());
        }
        cmbSelectVehicle.setItems(vehicleList);


        ObservableList<String> driverList= FXCollections.observableArrayList();
        for (Driver d1: Database.drivers){
            driverList.add(d1.getName());
        }
        cmbDriver.setItems(driverList);

    }

    public void ParkVehicleOnAction(ActionEvent actionEvent) {

        if (isExistsSlot()){
            new Alert(Alert.AlertType.WARNING,"Already Parked!!").show();
        }else{

            InParking inParking = new InParking(cmbSelectVehicle.getValue(),lblVehicleType.getText(),lblSlotNumber.getText(),lblTime.getText());
            Database.inParkings.add(inParking);
            AddVehicleNumber[Next++]=cmbSelectVehicle.getValue();

        }


    }


    public void OnDeliveryOnAction(ActionEvent actionEvent) throws IOException {
        if (Database.inParkings.size() == 0) {
            new Alert(Alert.AlertType.WARNING, "Parked The Vehicle First").show();


        } else {
            for (int i = 0; i < Database.inParkings.size(); i++) {
                if (cmbSelectVehicle.getValue().equals(Database.inParkings.get(i).getVehicleNumber())) {

                    Database.inParkings.remove(i);
                    OnDelivery onDelivery = new OnDelivery(cmbSelectVehicle.getValue(), lblVehicleType.getText(), cmbDriver.getValue(), lblTime.getText());
                    Database.onDeliveries.add(onDelivery);

                    new Alert(Alert.AlertType.CONFIRMATION, "DELIVERED!..").show();
                    break;

                  
                }
            }
        }


    }
    public void ManagementOnAction(ActionEvent actionEvent) throws IOException {
        Database.loweranp=ManagementContext;

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/LoginManagement.fxml"));
        Parent parent = fxmlLoader.load();
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }
    private void dateAndTime() {


        Calendar clndr = Calendar.getInstance();
        SimpleDateFormat format1 = new SimpleDateFormat(" aa");



        Timeline clock = new Timeline(new KeyFrame(Duration.INDEFINITE.ZERO, e -> {
            LocalTime currenttime = LocalTime.now();
            LocalDate currentdate = LocalDate.now();
            lblTime.setText(currenttime.getHour() + ":" + currenttime.getMinute() + ":" + currenttime.getSecond()+"  "+format1.format(clndr.getTime()));
            lblDate.setText(currentdate.getDayOfMonth() + "-" + currentdate.getMonthValue() + "-" + currentdate.getYear());

        }),
                new KeyFrame(Duration.seconds(1))
        );
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }


    public void SelectVehicleOnAction(ActionEvent actionEvent) {
        for (int i=0;i<Database.vehicles.size();i++){
            if(cmbSelectVehicle.getValue().equals(Database.vehicles.get(i).getVehicleNumber())){
                lblVehicleType.setText(Database.vehicles.get(i).getVehicleType());

            }

        }

    }
    public boolean isExistsSlot(){
        for (int i=0;i<Next;i++){
            if (AddVehicleNumber[i].equals(cmbSelectVehicle.getValue())){
                return true;
            }
        }return false;
    }

}
