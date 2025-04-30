package CarRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"Suraj Jha","WB100712"));
        userList.add(new User(2,"Priya Jha","JH100712"));

        List<Vehicle> vehicleList1 = new ArrayList<>();
        List<Vehicle> vehicleList2 = new ArrayList<>();
        vehicleList1.add(new Vehicle(1,2275,VehicleType.CAR,100,1000,100,Status.ACTIVE));
        vehicleList2.add(new Vehicle(2,2278,VehicleType.CAR,500,900,90,Status.ACTIVE));

        List<Store> storeList = new ArrayList<>();
        storeList.add(new Store(1,new VehicleInventoryManager(vehicleList1), new Location("Laxmi Chowk","Pune", "Maharastra", "India", 411027), new ArrayList<>()));
        storeList.add(new Store(2,new VehicleInventoryManager(vehicleList2), new Location("Narkeldanga Rd","Kolkata","West Bengal","India",700023), new ArrayList<>()));

        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem(userList, storeList);

        //User comes and search store based on location
        Location location = new Location("Laxmi Chowk","Pune", "Maharastra", "India", 411027);
        Store store = vehicleRentalSystem.getStore(location);

        //Get the vehicles in store based on need
        List<Vehicle> vehicles = store.getVehicles(VehicleType.CAR);

        //Choose and reserve the vehicle
        Reservation reservation = store.createReservation(vehicles.get(0), userList.get(0));

        //Generate Bill
        Bill bill = new Bill(reservation);

        //Payment
        Payment payment = new Payment();
        payment.payBill(bill);

        //submit the vehicle
        store.completeReservation(reservation);
    }
}
