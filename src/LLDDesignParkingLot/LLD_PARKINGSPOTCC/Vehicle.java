package LLDDesignParkingLot.LLD_PARKINGSPOTCC;

public class Vehicle {
    private final String plateNumber;
    private final VehicleType type;
    private final boolean isHandicapped;

    public Vehicle(String plateNumber, VehicleType type, boolean isHandicapped) {
        this.plateNumber = plateNumber;
        this.type = type;
        this.isHandicapped = isHandicapped;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public boolean isHandicapped() {
        return isHandicapped;
    }
}

