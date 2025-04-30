package ElevatorSystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Floor> floorList = new ArrayList<>();
        for(int i=1; i<=10; i++) floorList.add(new Floor(i));

        ElevatorController elevatorController1 = new ElevatorController(1);
        ElevatorController elevatorController2 = new ElevatorController(2);
        Building building = new Building(floorList);
    }
}
