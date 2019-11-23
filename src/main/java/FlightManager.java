import java.util.ArrayList;

public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public int getReservedWeight() {
        int totalWeight = this.flight.getPlane().getPlaneType().getWeightAllowance();
        return totalWeight / 2;
    }

    public int calculateTotalPassengerBaggageWeight() {
        int total = 0;
        ArrayList<Passenger> passengers = flight.getPassengers();
        for(Passenger passenger : passengers){
            total += passenger.passengerWeight();
        }
        return total;
    }

    public int CalculateRemainingWeight() {
        return getReservedWeight() - calculateTotalPassengerBaggageWeight();
    }
}
