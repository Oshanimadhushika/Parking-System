package Database;

import javafx.scene.layout.AnchorPane;
import model.Driver;
import model.InParking;
import model.OnDelivery;
import model.Vehicle;

import java.util.ArrayList;

public class Database {
    public  static ArrayList<Vehicle> vehicles=new ArrayList<>();
    public  static ArrayList<Driver> drivers=new ArrayList<>();
    public static ArrayList<InParking> inParkings=new ArrayList<>();
    public static ArrayList<OnDelivery> onDeliveries=new ArrayList<>();


 public static AnchorPane loweranp;
    static {

        vehicles.add(new Vehicle("NA-3434","Bus","3500","60"));
        vehicles.add(new Vehicle("KA-4563","Van","1000","7"));
        vehicles.add(new Vehicle("58-3567","Van","1500","4"));
        vehicles.add(new Vehicle("GF-4358","Van","800","4"));
        vehicles.add(new Vehicle("CCB-3568","Van","1800","8"));
        vehicles.add(new Vehicle("LM-6679","Van","1500","4"));
        vehicles.add(new Vehicle("QA-3369","Van","1800","6"));
        vehicles.add(new Vehicle("KB-3668","Cargo Lorry","2500","2"));
        vehicles.add(new Vehicle("JJ-9878","Cargo Lorry","3000","2"));
        vehicles.add(new Vehicle("GH-5772","Cargo Lorry","4000","3"));
        vehicles.add(new Vehicle("XY-4456","Cargo Lorry","3500","2"));
        vehicles.add(new Vehicle("YQ-3536","Cargo Lorry","2000","2"));
        vehicles.add(new Vehicle("CBB-3566","Cargo Lorry","2500","2"));
        vehicles.add(new Vehicle("QH-3444","Cargo Lorry","5000","4"));


        drivers.add(new Driver("Sumith Kumara","7835348345V","B6474845","Panadura","0725637456"));
        drivers.add(new Driver("Amila Pathirana", "8826253734V", "B3354674", "Galle","0717573583"));
        drivers.add(new Driver("Jithmal Perera", "9283289272V"," B3674589"," Horana", "0772452457"));
        drivers.add(new Driver("Sumith Dissanayaka", "9425245373V", "B8366399","Kaluthara","0782686390"));
        drivers.add(new Driver("Sumanasiri Herath", "8976544373V", "B3537538", "Beruwala", "0772534436"));
        drivers.add(new Driver("Awantha Fernando", "9173537839V", "B3554789", "Colombo 5", "0714534356"));
        drivers.add(new Driver("Charith Sudara", "9573536833V", "B6835836", "Baththaramulla", "0771536662"));
        drivers.add(new Driver("Prashan Dineth", "9362426738V", "B2683536", "Wadduwa", "0715353434"));
        drivers.add(new Driver("Chethiya Dilan", "9162353436V", "B6836836", "Panadura", "0772436737"));
        drivers.add(new Driver("Dushantha Perera", "9255556343V", "B3334435", "Matara", "0777245343"));
        drivers.add(new Driver("Sumith Udayanga", "8735354355V", "B3573783", "Galle", "0703635442"));
        drivers.add(new Driver("Dinesh Udara", "9026344373V", "B5343783", "Hettimulla","0713456878"));
        drivers.add(new Driver("Udana Chathuranga", "9692653338V", "B7888632", "Kottawa", "0772442444"));
        drivers.add(new Driver("Mohommad Riaz", "9124537733V", "B3638537", "Kaluthara", "0777544222"));
        drivers.add(new Driver("Sandun Kumara", "9563524267V", "B2263333", "Panadura", "0772325544"));
        drivers.add(new Driver("Priyanga Perera", "9135343537V", "B3853753", "Matara", "0723344562"));

    }
}
