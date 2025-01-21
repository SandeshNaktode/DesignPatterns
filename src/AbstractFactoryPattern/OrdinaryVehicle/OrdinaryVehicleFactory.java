package AbstractFactoryPattern.OrdinaryVehicle;

import AbstractFactoryPattern.OrdinaryVehicle.Brand.Hyundai;
import AbstractFactoryPattern.OrdinaryVehicle.Brand.Suzuki;
import AbstractFactoryPattern.Vehicle;
import AbstractFactoryPattern.VehicleFactory;

public class OrdinaryVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String brand) {
        switch (brand.toLowerCase()) {
            case "hyundai":
                return new Hyundai();
            case "suzuki":
                return new Suzuki();
            default:
                throw new IllegalArgumentException("Unknown ordinary brand: " + brand);
        }
    }
}
