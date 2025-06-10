package LLDDesignParkingLot.LLD_PARKINGSPOTCC;

public abstract class ParkingSpot {
    private final String id;
    private final VehicleType type;
    private boolean isOccupied;
    private Vehicle vehicle;

    public ParkingSpot(String id, VehicleType type) {
        this.id = id;
        this.type = type;
        this.isOccupied = false;
    }

    public abstract int getPrice(); // Overridden in subclasses

    public boolean parkVehicle(Vehicle vehicle) {
        if (!isOccupied && vehicle.getType() == this.type) {
            this.vehicle = vehicle;
            this.isOccupied = true;
            return true;
        }
        return false;
    }

    public Vehicle removeVehicle() {
        Vehicle v = this.vehicle;
        this.vehicle = null;
        this.isOccupied = false;
        return v;
    }

    public String getId() {
        return id;
    }

    public VehicleType getType() {
        return type;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

