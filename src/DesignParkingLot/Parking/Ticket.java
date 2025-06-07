package DesignParkingLot.Parking;

import DesignParkingLot.Parking.ParkingSpot;
import DesignParkingLot.Vehicle.Vehicle;

import java.time.LocalDateTime;

public class Ticket {
    private final String id;
    private final LocalDateTime entryTime;
    private final ParkingSpot spot;
    private final Vehicle vehicle;

    public Ticket(String id, Vehicle vehicle, ParkingSpot spot) {
        this.id = id;
        this.vehicle = vehicle;
        this.spot = spot;
        this.entryTime = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}

