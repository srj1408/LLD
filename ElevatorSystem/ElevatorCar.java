package ElevatorSystem;

public class ElevatorCar {
    private int id;
    private int currentFloor;
    private Direction elevatorDirection;
    private ElevatorStatus elevatorStatus;
    private InternalButtons internalButtons;
    private ElevatorDisplay display;

    public ElevatorCar(int id){
        this.id = id;
        currentFloor = 0;
        elevatorDirection = Direction.UP;
        elevatorStatus = ElevatorStatus.IDLE;
        internalButtons = new InternalButtons();
        display = new ElevatorDisplay();
    }

    public int getId() {
        return id;
    }

    public void showDisplay(){
        display.showDisplay();
    }

    public void pressButton(int destination){
        internalButtons.pressButton(destination,this);
    }

    public void setDisplay(){
        this.display.setDisplay(currentFloor,elevatorDirection);
    }
}
