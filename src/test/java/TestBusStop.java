import org.junit.Before;
import org.junit.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

import static org.junit.Assert.assertEquals;

public class TestBusStop {

    private BusStop busStop;


    @Before
    public void before(){
        busStop = new BusStop("Leith");
    }

    @Test
    public void busStopHasName(){
        assertEquals("Leith", busStop.getName());
    }

    @Test
    public void busStopQueueStartsEmpty(){
        assertEquals(0, busStop.getQueueSize());
    }


}

