package CarRentalSystem;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

// Each vehicle is tagged to a store
public class Store {
    private int id;
    private VehicleInventoryManager vehicleInventoryManager;
    private Location location;
    private List<Reservation> reservationList;

    public Store(int id, VehicleInventoryManager vehicleInventoryManager, Location location, List<Reservation> reservationList) {
        this.id = id;
        this.vehicleInventoryManager = vehicleInventoryManager;
        this.location = location;
        this.reservationList = reservationList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VehicleInventoryManager getVehicleInventoryManager() {
        return vehicleInventoryManager;
    }

    public void setVehicleInventoryManager(VehicleInventoryManager vehicleInventoryManager) {
        this.vehicleInventoryManager = vehicleInventoryManager;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    public List<Vehicle> getVehicles(VehicleType vehicleType) {
        return vehicleInventoryManager.getVehiclesList().stream().filter((vehicle) -> vehicle.getType()==vehicleType).toList();
    }

    public Reservation createReservation(Vehicle vehicle, User user) {
        Reservation reservation = new Reservation(1,user,vehicle, LocalDate.now(), LocalDateTime.now(),LocalDateTime.now().plusDays(2),ReservationStatus.SCHEDULED);
        reservationList.add(reservation);
        //remove vehicle from vehicleInventoryManager for the reserved period of time
        return reservation;
    }

    public void completeReservation(Reservation reservation) {
        reservation.setStatus(ReservationStatus.COMPLETED);
        //add vehicle to vehicleInventoryManager
    }
}
