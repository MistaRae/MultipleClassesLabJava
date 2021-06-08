import org.junit.Before;
import org.junit.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

import static org.junit.Assert.assertEquals;

public class TestBus {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Haymarket");
        person = new Person();
        busStop = new BusStop("Leith");
    }

    @Test
    public void busHasDestination(){
        assertEquals("Haymarket", bus.getDestination());
    }

    @Test
    public void busHasCapacity(){
        assertEquals(40,bus.getCapacity());
    }

    @Test
    public void busStartsWithNoPassengers() {
        assertEquals(0, bus.getPassengerCount());
    }

//    @Test
//    public void busCanAddPassengers(){
//        bus.addPassenger(busStop);
//        assertEquals(1, bus.getPassengerCount());
//    }

    @Test
    public void canRemovePassengerFromBus(){
        busStop.addToQueue(person);
        bus.addPassenger(busStop);
        bus.removePassenger();
        assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void busCanPickUpFromBusStop(){
        busStop.addToQueue(person);
//        busStop.removeFromQueue();
        bus.addPassenger(busStop);
        assertEquals(1, bus.getPassengerCount());
        assertEquals(0, busStop.getQueueSize());
    }
}
