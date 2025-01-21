package AbstractFactoryPattern;

import AbstractFactoryPattern.LuxuryVehicle.LuxuryVehicleFactory;
import AbstractFactoryPattern.OrdinaryVehicle.OrdinaryVehicleFactory;

public class FactoryProducer {
    public VehicleFactory getVehicleFactory(String type){
        switch (type.toLowerCase()) {
            case "luxury":
                return new LuxuryVehicleFactory();
            case "ordinary":
                return new OrdinaryVehicleFactory();
            default:
                throw new IllegalArgumentException("Unknown factory type: " + type);
        }

    }
}
