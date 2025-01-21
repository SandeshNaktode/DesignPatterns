package StrategyPattern.Strategy;

public class NewDriveStrategy  implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Its New Drive Strategy");
    }
}
