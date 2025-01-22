package StrategyDesignPattern;

import StrategyDesignPattern.Strategy.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SportDriveStrategy());
    }
}
