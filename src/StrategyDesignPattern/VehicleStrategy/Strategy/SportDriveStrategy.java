package StrategyDesignPattern.VehicleStrategy.Strategy;

public class SportDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Its Sport Drive");
    }
}
