package controller;

import model.Slots;

import java.util.Arrays;

public class ParkingSlotAndType {
    String vehicleNumber;
    String vehicleType;
    String vehicleSlot;

    Slots vehicleParkingSlot[] = new Slots[14];

    {

        vehicleParkingSlot[0] = new Slots("1", "Van", "Not use");
        vehicleParkingSlot[1] = new Slots("2", "Van", "Not use");
        vehicleParkingSlot[2] = new Slots("3", "Van", "Not use");
        vehicleParkingSlot[3] = new Slots("4", "Van", "Not use");
        vehicleParkingSlot[4] = new Slots("5", "Cargo Lorry", "Not use");
        vehicleParkingSlot[5] = new Slots("6", "Cargo Lorry", "Not use");
        vehicleParkingSlot[6] = new Slots("7", "Cargo Lorry", "Not use");
        vehicleParkingSlot[7] = new Slots("8", "Cargo Lorry", "Not use");
        vehicleParkingSlot[8] = new Slots("9", "Cargo Lorry", "Not use");
        vehicleParkingSlot[9] = new Slots("10", "Cargo Lorry", "Not use");
        vehicleParkingSlot[10] = new Slots("11", "Cargo Lorry", "Not use");
        vehicleParkingSlot[11] = new Slots("12", "Van", "Not use");
        vehicleParkingSlot[12] = new Slots("13", "Van", "Not use");
        vehicleParkingSlot[13] = new Slots("14", "Bus", "Not use");

    }

    public ParkingSlotAndType() {
    }

    public ParkingSlotAndType(String vehicleNum, String vehicleType, String vehicleSlot, Slots[] vehicleParkingSlot) {
        this.vehicleNumber = vehicleNum;
        this.vehicleType = vehicleType;
        this.vehicleSlot = vehicleSlot;
        this.vehicleParkingSlot = vehicleParkingSlot;
    }

    @Override
    public String toString() {
        return "ParkingSlotAndType{" +
                "vehicleNum='" + vehicleNumber + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", vehicleSlot='" + vehicleSlot + '\'' +
                ", vehicleParkingSlot=" + Arrays.toString(vehicleParkingSlot) +
                '}';
    }

    public void park(String vehiNum) {
        vehicleNumber = vehiNum;
        if (vehicleNumber.equals("NA-3434")) {
            vehicleType = "Bus";
            for (int i = 0; i < vehicleParkingSlot.length; i++) {
                if (vehicleParkingSlot[i].getSlotVehicleType().equals("Bus")) {
                    if (vehicleParkingSlot[i].getSlotStatus().equals("Not use")) {
                        vehicleSlot = vehicleParkingSlot[i].getSlotNum();
                        vehicleParkingSlot[i].setSlotStatus(vehicleNumber);
                        break;
                    } else {
                        vehicleSlot = "Not Available";
                    }
                }
            }
        } else if (vehicleNumber.equals("KA-4563") || vehicleNumber.equals("58-3567") || vehicleNumber.equals("GF-4358") || vehicleNumber.equals("CCB-3568") || vehicleNumber.equals("LM-6679") || vehicleNumber.equals("QA-3369")) {
            vehicleType = "Van";
            for (int i = 0; i < vehicleParkingSlot.length; i++) {
                if (vehicleParkingSlot[i].getSlotVehicleType().equals("Van")) {
                    if (vehicleParkingSlot[i].getSlotStatus().equals("Not use")) {
                        vehicleSlot = vehicleParkingSlot[i].getSlotNum();
                        vehicleParkingSlot[i].setSlotStatus(vehicleNumber);
                        break;
                    } else {
                        vehicleSlot = "Not Available";
                    }
                }
            }
        } else if (vehicleNumber.equals("KB-3668") || vehicleNumber.equals("JJ-9878") || vehicleNumber.equals("GH-5772") || vehicleNumber.equals("XY-4456") || vehicleNumber.equals("YQ-3536") || vehicleNumber.equals("CBB-3566")) {
            vehicleType = "Cargo Lorry";
            for (int i = 0; i < vehicleParkingSlot.length; i++) {
                if (vehicleParkingSlot[i].getSlotVehicleType().equals("Cargo Lorry")) {
                    if (vehicleParkingSlot[i].getSlotStatus().equals("Not use")) {
                        vehicleSlot = vehicleParkingSlot[i].getSlotNum();
                        vehicleParkingSlot[i].setSlotStatus(vehicleNumber);
                        break;
                    } else {
                        vehicleSlot = "Not Available";
                    }
                }
            }
        }
    }

}
