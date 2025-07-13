package HandleNullObject;

public class MainNullable {
    public static void main(String[] args){
        Vehicle bikeObject = VehicelFactory.getVehicleObject("Bike");
        getVehicleDetails(bikeObject);

        Vehicle carObject = VehicelFactory.getVehicleObject("Car");
        getVehicleDetails(carObject);
    }

    private static void getVehicleDetails(Vehicle vehicle) {
        System.out.println("Seating Capacity of " + vehicle.getClass().getSimpleName() + ": " + vehicle.getSeatingCapacity());
        System.out.println("Fuel Tank Capacity " + vehicle.getClass().getSimpleName() + ": " + vehicle.getTankCapacity());
    }
}
