package LLDDesignParkingLot.Simple.Fees;

import LLDDesignParkingLot.Simple.Vehicle.VehicleType;

import java.time.LocalDateTime;

public interface FeeCalculator {
    double calculate(LocalDateTime entryTime, LocalDateTime exitTime, VehicleType type);
}