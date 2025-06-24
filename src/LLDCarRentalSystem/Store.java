package LLDCarRentalSystem;

import LLDCarRentalSystem.Product.Vehicle;
import LLDCarRentalSystem.Product.VehicleType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Store {
    int storeId;
    VehicleInventoryManagement inventoryManagement;
    Location storeLocation;
    List<Reservation> reservations = new ArrayList<>();

    public List<Vehicle> getVehicles(VehicleType vehicleType) {
        return inventoryManagement.getVehicles();
    }

    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReserve(user,vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationID) {
        //take out the reservation from the list and call complete the reservation method.
        Optional<Reservation> first = reservations.stream().filter(reservation -> reservation.reservationId == reservationID).findFirst();
        if(first.isPresent()) {
            reservations.remove(first.get());
            return true;
        }
        return false;
    }



}
