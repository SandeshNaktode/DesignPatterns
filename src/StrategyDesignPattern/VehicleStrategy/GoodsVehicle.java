package StrategyDesignPattern.VehicleStrategy;

import StrategyDesignPattern.VehicleStrategy.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
