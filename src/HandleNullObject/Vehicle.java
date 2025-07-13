package HandleNullObject;

public interface Vehicle {
    default int getSeatingCapacity(){
        return 0;
    }
    default int getTankCapacity(){
        return 0;
    }
}
