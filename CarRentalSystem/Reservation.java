package CarRentalSystem;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reservation {

    private int id;
    private User user;
    private Vehicle vehicle;
    private LocalDate bookingDate;
    private LocalDateTime bookedFrom;
    private LocalDateTime bookedTill;
    private ReservationStatus status;

    public Reservation(int id, User user, Vehicle vehicle, LocalDate bookingDate, LocalDateTime bookedFrom, LocalDateTime bookedTill, ReservationStatus status) {
        this.id = id;
        this.user = user;
        this.vehicle = vehicle;
        this.bookingDate = bookingDate;
        this.bookedFrom = bookedFrom;
        this.bookedTill = bookedTill;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public LocalDateTime getBookedFrom() {
        return bookedFrom;
    }

    public void setBookedFrom(LocalDateTime bookedFrom) {
        this.bookedFrom = bookedFrom;
    }

    public LocalDateTime getBookedTill() {
        return bookedTill;
    }

    public void setBookedTill(LocalDateTime bookedTill) {
        this.bookedTill = bookedTill;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

}
