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

    public boolean seatsAvailable() {
        if (this.passengerCount() < plane.getPlaneType().getCapacity()){
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
