package StrategyPattern;

public class MainClass {

    public  static void main(String args []){
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();

        vehicle = new SportVehicle();
        vehicle.drive();

        vehicle = new OffRoadVehicle();
        vehicle.drive();
    }
}
