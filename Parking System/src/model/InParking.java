package model;

public class InParking {
    private String VehicleNumber;
    private String VehicleType;
    private String ParkingSlot;
    private String ParkTime;

    public InParking() {
    }

    public InParking(String vehicleNumber, String vehicleType, String parkingSlot, String parkTime) {
        this.VehicleNumber = vehicleNumber;
        this.VehicleType = vehicleType;
        this.ParkingSlot = parkingSlot;
        this.ParkTime = parkTime;
    }

    @Override
    public String toString() {
        return "InParking{" +
                "VehicleNumber='" + VehicleNumber + '\'' +
                ", VehicleType='" + VehicleType + '\'' +
                ", ParkingSlot='" + ParkingSlot + '\'' +
                ", ParkTime='" + ParkTime + '\'' +
                '}';
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public String getParkingSlot() {
        return ParkingSlot;
    }

    public void setParkingSlot(String parkingSlot) {
        ParkingSlot = parkingSlot;
    }

    public String getParkTime() {
        return ParkTime;
    }

    public void setParkTime(String parkTime) {
        ParkTime = parkTime;
    }
}
