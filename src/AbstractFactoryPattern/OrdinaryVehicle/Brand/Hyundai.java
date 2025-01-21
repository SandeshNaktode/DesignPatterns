package AbstractFactoryPattern.OrdinaryVehicle.Brand;

import AbstractFactoryPattern.Vehicle;

public class Hyundai implements Vehicle {
    @Override
    public void getVehicleDetails() {
        System.out.println("Ordinary Vehicle: Hyundai");
    }
}
