import java.util.ArrayList;

public class Flight {

    Plane plane;
    String flightNumber;
    String destination;
    String departureTime;
    ArrayList<Passenger> passengers;

    public Flight(Plane plane, String flightNumber, String destination, String departureTime) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public int totalPassengerWeight() {
        int total = 0;
        for(Passenger passenger : this.passengers){
            total += passenger.passengerWeight();
        }
        return total;
    }

    public boolean seatsAvailable() {
        int availableWeight = plane.getPlaneType().getWeightAllowance() / 2;
        if (this.passengerCount() < plane.getPlaneType().getCapacity() && totalPassengerWeight() < availableWeight ){
            return true;
        } else {
            return false;
        }
    }

    public void bookPassenger(Passenger passenger) {
        if(seatsAvailable()){
            this.passengers.add(passenger);
        }
    }

}
