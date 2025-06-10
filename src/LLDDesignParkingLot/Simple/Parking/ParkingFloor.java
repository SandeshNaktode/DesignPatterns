package LLDDesignParkingLot.Simple.Parking;

import LLDDesignParkingLot.Simple.Vehicle.Vehicle;

import java.util.List;
import java.util.Optional;

public class ParkingFloor {
    private final String name;
    private final List<ParkingSpot> spots;

    public ParkingFloor(String name, List<ParkingSpot> spots) {
        this.name = name;
        this.spots = spots;
    }

    public Optional<ParkingSpot> findAvailableSpot(Vehicle vehicle) {
        return spots.stream()
                .filter(spot -> spot.canFit(vehicle) && spot.isAvailable())
                .findFirst();
    }
}

