import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void before(){
    passenger1 = new Passenger("Bob", 2);
    passenger2 = new Passenger("Sally", 4);
    plane = new Plane(PlaneType.BOEING747);
    flight = new Flight(plane, "FR756", "GLA", "2019-11-23 10.00");
    flightManager = new FlightManager(flight);
    }

    @Test
    public void reservedBaggageWeight(){
        assertEquals(10, flightManager.getReservedWeight());
    }

    @Test
    public void passengerBaggageWeight(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(6, flightManager.calculateTotalPassengerBaggageWeight());
    }

    @Test
    public void caculateRemainingWeight(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(4, flightManager.CalculateRemainingWeight());
    }
}
