package StrategyDesignPattern.VehicleStrategy;

import StrategyDesignPattern.VehicleStrategy.Strategy.SportDriveStrategy;

public class SportVehicle extends Vehicle {

    public SportVehicle() {
        super(new SportDriveStrategy());
    }
}
