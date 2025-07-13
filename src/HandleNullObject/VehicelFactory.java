package HandleNullObject;

public class VehicelFactory {
    static Vehicle getVehicleObject(String vehicleType){
        if(vehicleType.equalsIgnoreCase("CAR")){
            return new Car();
        }
        return new NullVehicle();
    }
}
