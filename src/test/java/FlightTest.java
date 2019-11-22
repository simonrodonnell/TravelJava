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
    public void canBookPassengerToPlane(){
        flight.bookPassenger(passenger);
        assertEquals(1, flight.passengerCount());
    }

    @Test
    public void cantBookPassengerToFullPlane(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals(10, flight.passengerCount());
    }

}
