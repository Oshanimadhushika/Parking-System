package model;

public class Vehicle {
    private String vehicleNumber;
    private String vehicleType;
    private String maxWeight;
    private String numOfPassengers;

    public Vehicle(String text, String txtNICText, String txtDrivingLicenseText, String txtAddressText, String txtContactNoText) {
    }

    public Vehicle(String vehicleNumber, String vehicleType, String maxWeight, String numOfPassengers) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.maxWeight = maxWeight;
        this.numOfPassengers = numOfPassengers;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(String maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(String numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }



}
