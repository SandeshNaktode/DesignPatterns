package LLDDesignParkingLot.LLD_PARKINGSPOTCC;

public class ThreeWheelerSpot extends ParkingSpot {
        private final int price = 15;

        public ThreeWheelerSpot(String id) {
            super(id, VehicleType.THREE_WHEELER);
        }

        @Override
        public int getPrice() {
            return price;
        }
}
