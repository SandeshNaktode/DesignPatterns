package StrategyPattern.Strategy;

import StrategyPattern.Strategy.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Its Normal Drive");
    }
}
