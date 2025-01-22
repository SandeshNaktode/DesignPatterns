package AbstractDesignFactoryPattern.OrdinaryVehicle.Brand;

import AbstractDesignFactoryPattern.Vehicle;

public class Suzuki implements Vehicle {
    @Override
    public void getVehicleDetails() {
        System.out.println("Ordinary Vehicle: Suzuki");
    }
}
