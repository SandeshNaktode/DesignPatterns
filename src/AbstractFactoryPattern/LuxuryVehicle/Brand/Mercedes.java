package AbstractFactoryPattern.LuxuryVehicle.Brand;

import AbstractFactoryPattern.Vehicle;

public class Mercedes implements Vehicle {
    @Override
    public void getVehicleDetails() {
        System.out.println("Luxury Vehicle: Mercedes");
    }
}
