import org.junit.Before;
import org.junit.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

import static org.junit.Assert.assertEquals;

public class TestBusStop {

    private BusStop busStop;
    private Person person;


    @Before
    public void before(){
        busStop = new BusStop("Leith");
        person = new Person();
    }

    @Test
    public void busStopHasName(){
        assertEquals("Leith", busStop.getName());
    }

    @Test
    public void busStopQueueStartsEmpty(){
        assertEquals(0, busStop.getQueueSize());
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addToQueue(person);
        assertEquals(1, busStop.getQueueSize());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busStop.addToQueue(person);
        busStop.removeFromQueue();
        assertEquals(0, busStop.getQueueSize());
    }

}

