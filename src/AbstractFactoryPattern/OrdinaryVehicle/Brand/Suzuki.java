package AbstractFactoryPattern.OrdinaryVehicle.Brand;

import AbstractFactoryPattern.Vehicle;

public class Suzuki implements Vehicle {
    @Override
    public void getVehicleDetails() {
        System.out.println("Ordinary Vehicle: Suzuki");
    }
}
