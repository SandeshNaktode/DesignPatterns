package LLDDesignParkingLot.Simple;

import LLDDesignParkingLot.Simple.Fees.FeeCalculator;
import LLDDesignParkingLot.Simple.Parking.ParkingFloor;
import LLDDesignParkingLot.Simple.Parking.ParkingSpot;
import LLDDesignParkingLot.Simple.Parking.Ticket;
import LLDDesignParkingLot.Simple.Vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.*;

class ParkingLotManager {
    private final List<ParkingFloor> floors;
    private final Map<String, Ticket> activeTickets;
    private final FeeCalculator feeCalculator;

    public ParkingLotManager(List<ParkingFloor> floors, FeeCalculator feeCalculator) {
        this.floors = floors;
        this.feeCalculator = feeCalculator;
        this.activeTickets = new HashMap<>();
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        for (ParkingFloor floor : floors) {
            Optional<ParkingSpot> spotOpt = floor.findAvailableSpot(vehicle);
            if (spotOpt.isPresent()) {
                ParkingSpot spot = spotOpt.get();
                spot.assignVehicle(vehicle);
                String ticketId = UUID.randomUUID().toString();
                Ticket ticket = new Ticket(ticketId, vehicle, spot);
                activeTickets.put(ticketId, ticket);
                System.out.println("Vehicle parked. Ticket ID: " + ticketId);
                return ticket;
            }
        }
        throw new RuntimeException("No available spot for vehicle type: " + vehicle.getType());
    }

    public double unparkVehicle(String ticketId) {
        Ticket ticket = activeTickets.get(ticketId);
        if (ticket == null) throw new RuntimeException("Invalid Ticket ID");

        LocalDateTime exitTime = LocalDateTime.now();
        double fee = feeCalculator.calculate(ticket.getEntryTime(), exitTime, ticket.getVehicle().getType());

        ticket.getSpot().removeVehicle();
        activeTickets.remove(ticketId);

        System.out.println(ticket.getVehicle().getLicensePlate() + " Vehicle Unparked!!! - Type: "+ ticket.getVehicle().getType() +" - Fee: Rs" + fee);
        return fee;
    }
}
