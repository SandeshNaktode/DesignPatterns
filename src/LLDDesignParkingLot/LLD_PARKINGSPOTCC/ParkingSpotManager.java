package LLDDesignParkingLot.LLD_PARKINGSPOTCC;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ParkingSpotManager {
    private List<ParkingSpot> parkingSpots;
    private final Map<String, ParkingSpot> occupiedSpotsByVehicleNumber = new HashMap<>();

    public ParkingSpotManager(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    // 1. Add Parking Spot
    public void addParkingSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
    }

    // 2. Remove Parking Spot by ID
    public boolean removeParkingSpot(String spotId) {
        return parkingSpots.removeIf(spot -> spot.getId().equals(spotId));
    }

    // 3. Find an Available Parking Spot for a Vehicle
    public ParkingSpot findParkingSpot(Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isOccupied() && spot.getType() == vehicle.getType()) {
                return spot;
            }
        }
        return null;
    }

    // 4. Park Vehicle
    public ParkingSpot parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = findParkingSpot(vehicle);
        if (spot != null && spot.parkVehicle(vehicle)) {
            occupiedSpotsByVehicleNumber.put(vehicle.getPlateNumber(), spot);
            return spot;
        }
        return null;
    }

    // 5. Remove Vehicle
    public boolean removeVehicle(String vehicleId) {
        ParkingSpot spot = occupiedSpotsByVehicleNumber.remove(vehicleId);
        if (spot != null) {
            spot.removeVehicle();
            return true;
        }
        return false;
    }

    // Optional helper
    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public ParkingSpot getSpotByVehicleId(String vehicleId) {
        return occupiedSpotsByVehicleNumber.get(vehicleId);
    }
}

