package DesignParkingLot.Parking;

import DesignParkingLot.Vehicle.Vehicle;
import DesignParkingLot.Vehicle.VehicleType;

public class ParkingSpot {
    private final String id;
    private final VehicleType type;
    private boolean isOccupied;
    private Vehicle vehicle;

    public ParkingSpot(String id, VehicleType type) {
        this.id = id;
        this.type = type;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public boolean canFit(Vehicle vehicle) {
        return this.type == vehicle.getType();
    }

    public void assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isOccupied = false;
    }

    public String getId() {
        return id;
    }

    public VehicleType getType() {
        return type;
    }
}
