package AbstractDesignFactoryPattern.LuxuryVehicle;

import AbstractDesignFactoryPattern.LuxuryVehicle.Brand.BMW;
import AbstractDesignFactoryPattern.LuxuryVehicle.Brand.Mercedes;
import AbstractDesignFactoryPattern.Vehicle;
import AbstractDesignFactoryPattern.VehicleFactory;

public class LuxuryVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String brand) {
        switch (brand.toLowerCase()) {
            case "bmw":
                return new BMW();
            case "mercedes":
                return new Mercedes();
            default:
                throw new IllegalArgumentException("Unknown luxury brand: " + brand);
        }
    }
}
