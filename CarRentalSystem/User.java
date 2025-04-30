package CarRentalSystem;

public class User {

    private int userId;
    private String username;
    private String drivingLicense;

    public User(int userId, String username, String drivingLicense) {
        this.userId = userId;
        this.username = username;
        this.drivingLicense = drivingLicense;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }
}
