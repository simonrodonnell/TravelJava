import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Flight {

    private Plane plane;
    private String flightNumber;
    private String destination;
    private String inputDepartureTime;
    private ArrayList<Passenger> passengers;
    private Date departureTime;


    public Flight(Plane plane, String flightNumber, String destination, String inputDepartureTime) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.passengers = new ArrayList<>();
//        String strDateFormat = "dd-MMM-yyyy hh:mm"; //Date format is Specified
//        SimpleDateFormat departureTimeSDF = new SimpleDateFormat(strDateFormat); //Date format string is passed as an argument to the Date format object
        this.departureTime = departureTime;
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
        }
    }

    public int numberOfAvailableSeats() {
        return this.plane.getPlaneType().getCapacity() - this.passengers.size();
    }
}
