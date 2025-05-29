package StrategyDesignPattern.VehicleStrategy;

import StrategyDesignPattern.VehicleStrategy.Strategy.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SportDriveStrategy());
    }
}
