package AbstractDesignFactoryPattern.OrdinaryVehicle.Brand;

import AbstractDesignFactoryPattern.Vehicle;

public class Hyundai implements Vehicle {
    @Override
    public void getVehicleDetails() {
        System.out.println("Ordinary Vehicle: Hyundai");
    }
}
