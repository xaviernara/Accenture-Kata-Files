
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BabysitterKataTests {

    BabySitter bs;

    @BeforeEach
    public void setUp(){
        bs = new BabySitter();
    }

    @Test
    public void babySitterWorksOneHourForAFamilyItReturnsHourlyRate(){
        assertEquals(30,bs.calcHourlyRate("A"));
    }




}
