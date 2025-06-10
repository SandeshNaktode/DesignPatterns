package LLDDesignParkingLot.Simple;

import LLDDesignParkingLot.Simple.Fees.HourlyFeeCalculator;
import LLDDesignParkingLot.Simple.Parking.ParkingFloor;
import LLDDesignParkingLot.Simple.Parking.ParkingSpot;
import LLDDesignParkingLot.Simple.Parking.Ticket;
import LLDDesignParkingLot.Simple.Vehicle.Bike;
import LLDDesignParkingLot.Simple.Vehicle.Car;
import LLDDesignParkingLot.Simple.Vehicle.Vehicle;
import LLDDesignParkingLot.Simple.Vehicle.VehicleType;

import java.util.Arrays;
import java.util.List;

public class ParkingLotMain {
    public static void main(String[] args) throws InterruptedException {
        // Create Parking Lot
        ParkingLotManager lot = constructParkingLot();

        // Park vehicle
        Vehicle myCar = new Car("MH12AB1234");
        Ticket carTicket = lot.parkVehicle(myCar);

        // Simulate time
        Thread.sleep(5000); // 2 seconds

        // Unpark vehicle
        lot.unparkVehicle(carTicket.getId());

        Vehicle myBike = new Bike("MH12AB4567");
        Ticket bikeTicket = lot.parkVehicle(myBike);

        // Simulate time
        Thread.sleep(8000); // 2 seconds

        // Unpark vehicle
        lot.unparkVehicle(bikeTicket.getId());
    }

    private static ParkingLotManager constructParkingLot() {
        List<ParkingSpot> floor1Spots = Arrays.asList(
                new ParkingSpot("1A", VehicleType.CAR),
                new ParkingSpot("1B", VehicleType.BIKE),
                new ParkingSpot("1C", VehicleType.CAR)
        );

        List<ParkingSpot> floor2Spots = Arrays.asList(
                new ParkingSpot("2A", VehicleType.CAR),
                new ParkingSpot("2B", VehicleType.BIKE),
                new ParkingSpot("3C", VehicleType.CAR)
        );

        ParkingFloor floor1 = new ParkingFloor("F1", floor1Spots);
        ParkingFloor floor2 = new ParkingFloor("F1", floor2Spots);

        ParkingLotManager lot = new ParkingLotManager(List.of(floor1, floor2), new HourlyFeeCalculator());
        return lot;
    }
}

