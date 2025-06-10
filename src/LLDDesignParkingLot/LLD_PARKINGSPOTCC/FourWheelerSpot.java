package LLDDesignParkingLot.LLD_PARKINGSPOTCC;

public class FourWheelerSpot extends ParkingSpot {
    private final int price = 20;

    public FourWheelerSpot(String id) {
        super(id, VehicleType.FOUR_WHEELER);
    }

    @Override
    public int getPrice() {
        return price;
    }
}
