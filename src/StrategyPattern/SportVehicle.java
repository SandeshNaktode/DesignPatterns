package StrategyPattern;

import StrategyPattern.Strategy.SportDriveStrategy;

public class SportVehicle extends Vehicle{

    public SportVehicle() {
        super(new SportDriveStrategy());
    }
}
