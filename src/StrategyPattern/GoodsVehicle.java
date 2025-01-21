package StrategyPattern;

import StrategyPattern.Strategy.NormalDriveStrategy;
import StrategyPattern.Strategy.SportDriveStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
