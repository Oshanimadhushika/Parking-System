/*
package controller;

public class VehicleParkCollection {

    static VehicleParkAndLeave parkArray[];
    static  VehicleParkAndLeave leaveArray[];
    int nextElement;
    int nextIndex;

    public VehicleParkCollection() {
        parkArray=new VehicleParkAndLeave[14];
        leaveArray=new VehicleParkAndLeave[14];
        nextElement=0;
        nextIndex=0;
    }

    public void addParkData(VehicleParkAndLeave vehiclePark){
        if (leaveArray[0]!=null){
            for (int i=0;i<nextElement;i++){
                if (vehiclePark.getVehicleNumber()==leaveArray[i].getVehicleNumber()){
                    for (int j=i;j<nextElement;j++){
                        leaveArray[j]=leaveArray[j+1];
                    }
                    nextElement--;
                    break;
                }
            }
        }
        parkArray[nextIndex++]=vehiclePark;
    }

    public  void leaveData(VehicleParkAndLeave vehicleLeave){
        if (parkArray[0]!=null){
            for (int i=0;i<nextIndex;i++){
                if (vehicleLeave.getVehicleNumber()==parkArray[i].getVehicleNumber()){
                    for (int j=i;j<nextIndex;j++){
                        parkArray[j]=parkArray[j+1];
                    }
                    nextIndex--;
                    break;
                }
            }
        }
        leaveArray[nextElement++]=vehicleLeave;

    }

}


*/
