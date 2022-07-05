package view.TM;

public class OnDeliveryTM {
    private String VehicleNum;
    private String VehiType;
    private String DriverName;
    private String LeaveTime;

    public OnDeliveryTM() {
    }

    public OnDeliveryTM(String vehicleNum, String vehiType, String driverName, String leaveTime) {
        this.VehicleNum = vehicleNum;
        this.VehiType = vehiType;
        this.DriverName = driverName;
        this.LeaveTime = leaveTime;
    }

    @Override
    public String toString() {
        return "OnDelivery{" +
                "VehicleNum='" + VehicleNum + '\'' +
                ", VehiType='" + VehiType + '\'' +
                ", DriverName='" + DriverName + '\'' +
                ", LeaveTime='" + LeaveTime + '\'' +
                '}';
    }

    public String getVehicleNum() {
        return VehicleNum;
    }

    public void setVehicleNum(String vehicleNum) {
        VehicleNum = vehicleNum;
    }

    public String getVehiType() {
        return VehiType;
    }

    public void setVehiType(String vehiType) {
        VehiType = vehiType;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    public String getLeaveTime() {
        return LeaveTime;
    }

    public void setLeaveTime(String leaveTime) {
        LeaveTime = leaveTime;
    }
}
