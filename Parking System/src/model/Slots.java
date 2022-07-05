package model;

public class Slots {
    private String slotNum;
    private String slotVehicleType;
    private String slotStatus;

    public Slots() {
    }

    public Slots(String slotNum, String slotVehicleType, String slotStatus) {
        this.slotNum = slotNum;
        this.slotVehicleType = slotVehicleType;
        this.slotStatus = slotStatus;
    }

    public String getSlotNum() {
        return slotNum;
    }

    public void setSlotNum(String slotNum) {
        this.slotNum = slotNum;
    }

    public String getSlotVehicleType() {
        return slotVehicleType;
    }

    public void setSlotVehicleType(String slotVehicleType) {
        this.slotVehicleType = slotVehicleType;
    }

    public String getSlotStatus() {
        return slotStatus;
    }

    public void setSlotStatus(String slotStatus) {
        this.slotStatus = slotStatus;
    }
}
