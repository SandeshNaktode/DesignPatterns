package LLDElevatorDesign;

import java.util.ArrayList;
import java.util.List;

public class MainElevatorActor {
    public static void main(String args[]) {

        List<Floor> floorList = new ArrayList<>();
        Floor floor1 = new Floor(1);
        Floor floor2 = new Floor(2);
        Floor floor3 = new Floor(3);
        Floor floor4 = new Floor(4);
        Floor floor5 = new Floor(5);
        floorList.add(floor1);
        floorList.add(floor2);
        floorList.add(floor3);
        floorList.add(floor4);
        floorList.add(floor5);

        Building building = new Building(floorList);

        building.getAllFloorList().forEach(floor -> pressButton(floor));
    }

    private static void pressButton(Floor floor) {
        if(floor.floorNumber%2 == 0){
            floor.pressButton(Direction.UP);
        } else{
            floor.pressButton(Direction.DOWN);
        }
    }

}
