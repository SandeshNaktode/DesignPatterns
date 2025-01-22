package AbstractDesignFactoryPattern.LuxuryVehicle.Brand;

import AbstractDesignFactoryPattern.Vehicle;

public class Mercedes implements Vehicle {
    @Override
    public void getVehicleDetails() {
        System.out.println("Luxury Vehicle: Mercedes");
    }
}
