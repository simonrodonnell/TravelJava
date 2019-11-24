import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Flight {

    private Plane plane;
    private String flightNumber;
    private String destination;
    private String inputDepartureTime;
    private ArrayList<Passenger> passengers;
//    private DateFormat departureTimeDateFormat;
//    private DateFormat departureTime;
    private ArrayList<Integer> bookedSeats;

    public Flight(Plane plane, String flightNumber, String destination, String inputDepartureTime) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.passengers = new ArrayList<>();
//        this.departureTimeDateFormat = new SimpleDateFormat ("dd-MMM-yyyy hh:mm");
//        this.departureTime = departureTimeDateFormat.parse(inputDepartureTime);
        this.bookedSeats = new ArrayList<>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public ArrayList getPassengers() {
        return this.passengers;
    }

    public Plane getPlane(){
        return this.plane;
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
            addFlightToPassenger(passenger);
            assignSeatNumberToPassenger(passenger);
        }
    }

    private void assignSeatNumberToPassenger(Passenger passenger) {
        int availableSeats = numberOfAvailableSeats();

    }

    private void addFlightToPassenger(Passenger passenger) {
    }

    public int numberOfAvailableSeats() {
        return this.plane.getPlaneType().getCapacity() - this.passengers.size();
    }
}
