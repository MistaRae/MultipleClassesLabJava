import org.junit.Before;
import org.junit.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

import static org.junit.Assert.assertEquals;

public class TestBus {

    private Bus bus;

    @Before
    public void before(){
        bus = new Bus("Haymarket");
    }

    @Test
    public void busHasDestination(){
        assertEquals("Haymarket", bus.getDestination());
    }

}
