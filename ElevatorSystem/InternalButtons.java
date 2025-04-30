package ElevatorSystem;

public class InternalButtons {
    InternalDispatcher internalDispatcher = new InternalDispatcher();
    private int[] buttons = {1,2,3,4,5,6,7,8,9,10};
    private int buttonPressed;

    public void pressButton(int destination, ElevatorCar elevatorCar){
        internalDispatcher.submitInternalRequest(destination,elevatorCar);
    }
}
