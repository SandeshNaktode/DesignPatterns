package AbstractFactoryPattern.LuxuryVehicle.Brand;

import AbstractFactoryPattern.Vehicle;

public class BMW implements Vehicle {
    @Override
    public void getVehicleDetails() {
        System.out.println("Luxury Vehicle: BMW");
    }
}
