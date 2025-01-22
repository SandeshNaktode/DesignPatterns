package AbstractDesignFactoryPattern.OrdinaryVehicle;

import AbstractDesignFactoryPattern.OrdinaryVehicle.Brand.Hyundai;
import AbstractDesignFactoryPattern.OrdinaryVehicle.Brand.Suzuki;
import AbstractDesignFactoryPattern.Vehicle;
import AbstractDesignFactoryPattern.VehicleFactory;

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
