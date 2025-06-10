package LLDDesignParkingLot.LLD_PARKINGSPOTCC;

public class TwoWheelerSpot extends ParkingSpot {
    private final int price = 10; // example price per hour/minute

    public TwoWheelerSpot(String id) {
        super(id, VehicleType.TWO_WHEELER);
    }

    @Override
    public int getPrice() {
        return price;
    }
}

