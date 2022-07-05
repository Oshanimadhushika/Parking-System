package model;

public class Driver {
    private String Name;
    private String NIC;
    private String DrivingLicenseNo;
    private String Address;
    private String Contact;

    public Driver() {
    }

    public Driver(String name, String NIC, String drivingLicenseNo, String address, String contact) {
        this.Name = name;
        this.NIC = NIC;
        this.DrivingLicenseNo = drivingLicenseNo;
        this.Address = address;
        this.Contact = contact;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getDrivingLicenseNo() {
        return DrivingLicenseNo;
    }

    public void setDrivingLicenseNo(String drivingLicenseNo) {
        DrivingLicenseNo = drivingLicenseNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }



}
