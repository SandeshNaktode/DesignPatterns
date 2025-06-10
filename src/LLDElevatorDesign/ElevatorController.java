package LLDElevatorDesign;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ElevatorController {
    PriorityQueue<Integer> upMinPQ;
    PriorityQueue<Integer> downMaxPQ;
    ElevatorCar elevatorCar;

    ElevatorController(ElevatorCar elevatorCar){
        this.elevatorCar = elevatorCar;
        upMinPQ = new PriorityQueue<>();
        downMaxPQ = new PriorityQueue<>(Comparator.reverseOrder());
    }
    public void submitExternalRequest(int floor, Direction direction){
        if(direction == Direction.DOWN) {
            downMaxPQ.offer(floor);
        } else {
            upMinPQ.offer(floor);
        }
        System.out.println("Direction: " + direction + " Floor Number: " + floor);
    }

    public void submitInternalRequest(int floor){

    }

    public void controlElevator(){
        while(true) {
            if(elevatorCar.elevatorDirection == Direction.UP){
            }
        }
    }

}
