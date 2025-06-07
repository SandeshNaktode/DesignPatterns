package DesignParkingLot.Fees;

import DesignParkingLot.Vehicle.VehicleType;

import java.time.Duration;
import java.time.LocalDateTime;

public class HourlyFeeCalculator implements FeeCalculator {
    public double calculate(LocalDateTime entryTime, LocalDateTime exitTime, VehicleType type) {
        long seconds = Duration.between(entryTime, exitTime).toSeconds();
        if (seconds == 0) seconds = 1;

        switch (type) {
            case BIKE: return seconds * 10;
            case CAR: return seconds * 20;
            case TRUCK: return seconds * 30;
            default: return seconds * 15;
        }
    }
}
