package DesignParkingLot.Fees;

import DesignParkingLot.Vehicle.VehicleType;

import java.time.LocalDateTime;

public interface FeeCalculator {
    double calculate(LocalDateTime entryTime, LocalDateTime exitTime, VehicleType type);
}