package CarRentalSystem;

import java.util.*;
public class VehicleRentalSystem {

    private List<User> userList;
    private List<Store> storeList;

    public VehicleRentalSystem(List<User> userList, List<Store> storeList) {
        this.userList = userList;
        this.storeList = storeList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(List<Store> storeList) {
        this.storeList = storeList;
    }

    public Store getStore(Location location) {
        //search store based on location and return the store
        return storeList.get(0);
    }

    // CRUD operations on users and stores
}
