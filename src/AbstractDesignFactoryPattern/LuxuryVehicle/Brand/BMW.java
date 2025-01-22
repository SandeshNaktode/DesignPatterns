package AbstractDesignFactoryPattern.LuxuryVehicle.Brand;

import AbstractDesignFactoryPattern.Vehicle;

public class BMW implements Vehicle {
    @Override
    public void getVehicleDetails() {
        System.out.println("Luxury Vehicle: BMW");
    }
}
