package ElevatorSystem;

import java.util.PriorityQueue;

public class ElevatorController {
    private PriorityQueue<Integer> upMinPQ;
    private PriorityQueue<Integer> downMaxPQ;
    private ElevatorCar elevatorCar;

    public ElevatorController(int id){
        upMinPQ = new PriorityQueue<>();
        downMaxPQ = new PriorityQueue<>((a,b) -> b-a);
        elevatorCar = new ElevatorCar(id);
    }

    public ElevatorCar getElevatorCar() {
        return elevatorCar;
    }

    public void submitExternalRequest(int floorNumber, Direction direction) {
        if(direction == Direction.UP) upMinPQ.offer(floorNumber);
        else downMaxPQ.offer(floorNumber);
    }

    public void submitInternalRequest(int floorNumber){

    }

    public void controlElevator(){

    }
}
