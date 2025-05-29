package StrategyDesignPattern.VehicleStrategy;

public class MainClass {

    public  static void main(String args []){
        System.out.println("Strategy Design Pattern");
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();

        vehicle = new SportVehicle();
        vehicle.drive();

        vehicle = new OffRoadVehicle();
        vehicle.drive();
    }
}
