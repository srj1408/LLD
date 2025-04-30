package CarRentalSystem;

import java.util.*;

//specific to a store
//manages vehicle of a store
public class VehicleInventoryManager {

    private List<Vehicle> vehiclesList;

    public VehicleInventoryManager(List<Vehicle> vehiclesList) {
        this.vehiclesList = vehiclesList;
    }

    public List<Vehicle> getVehiclesList() {
        return vehiclesList;
    }

    public void setVehiclesList(List<Vehicle> vehiclesList) {
        this.vehiclesList = vehiclesList;
    }

    // CRUD operations on vehicle
}
