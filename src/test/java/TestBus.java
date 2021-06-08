import org.junit.Before;
import org.junit.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

import static org.junit.Assert.assertEquals;

public class TestBus {

    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("Haymarket");
        person = new Person();
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

    @Test
    public void busCanAddPassengers(){
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengerCount());
    }

    @Test
    public void canRemovePassengerFromBus(){
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.getPassengerCount());
    }

}
