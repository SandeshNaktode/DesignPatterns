package StrategyDesignPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Its Normal Drive");
    }
}
