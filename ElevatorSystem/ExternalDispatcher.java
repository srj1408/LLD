package ElevatorSystem;

import java.util.List;

public class ExternalDispatcher {

    private List<ElevatorController> elevatorControllerList;

    // selecting elevator based on floor number is even or odd. Different elevator for odd floors and even floors.
    public void submitExternalRequest(int floorNumber, Direction direction) {
        for(ElevatorController elevatorController: elevatorControllerList){
            int elevatorId = elevatorController.getElevatorCar().getId();
            if(elevatorId%2==1 && floorNumber%2==1) elevatorController.submitExternalRequest(floorNumber,direction);
            else if(elevatorId%2==0 && floorNumber%2==0) elevatorController.submitExternalRequest(floorNumber,direction);
        }
    }
}
