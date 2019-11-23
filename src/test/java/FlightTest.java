import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger;
    Plane plane;

    @Before
    public void before(){
        passenger = new Passenger("Bob", 2);
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "FR756", "GLA", "10.00");
    }

    @Test
    public void startsWithEmptyPassengerList(){
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void planeHasAvailableSeats(){
        assertEquals(true, flight.seatsAvailable());
    }

    @Test
    public void numberOfAvailableSeats(){
        assertEquals(10, flight.numberOfAvailableSeats());
    }

    @Test
    public void canBookPassengerToPlane(){
        flight.bookPassenger(passenger);
        assertEquals(1, flight.passengerCount());
    }

    @Test
    public void cantBookPassengerToFullPlane(){
        flight.bookPassenger(passenger);    // 1 passenger, 2 bags
        flight.bookPassenger(passenger);    // 2 passengers, 4 bags
        flight.bookPassenger(passenger);    // 3 passengers, 6 bags
        flight.bookPassenger(passenger);    // 4 passengers, 8 bags
        flight.bookPassenger(passenger);    // 5 passengers, 10 bags => available weight allowance is 10 (20 / 2)
        flight.bookPassenger(passenger);    // 6 passengers, 12 bags
        assertEquals(5, flight.passengerCount());
    }

    @Test
    public void passengersHaveWeight(){
        flight.bookPassenger(passenger);
        assertEquals(2, flight.totalPassengerWeight());
    }

}
