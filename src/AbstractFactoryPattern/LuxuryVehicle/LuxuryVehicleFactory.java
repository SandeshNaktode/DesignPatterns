package AbstractFactoryPattern.LuxuryVehicle;

import AbstractFactoryPattern.LuxuryVehicle.Brand.BMW;
import AbstractFactoryPattern.LuxuryVehicle.Brand.Mercedes;
import AbstractFactoryPattern.Vehicle;
import AbstractFactoryPattern.VehicleFactory;

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
