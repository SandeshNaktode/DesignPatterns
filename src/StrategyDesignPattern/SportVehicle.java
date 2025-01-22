package StrategyDesignPattern;

import StrategyDesignPattern.Strategy.SportDriveStrategy;

public class SportVehicle extends Vehicle{

    public SportVehicle() {
        super(new SportDriveStrategy());
    }
}
