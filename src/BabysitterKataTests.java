
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.AssertEquals.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BabysitterKataTests {

    @Test
    public void babySitterWorksOneHourForFamilyAItReturnsHourlyRate{
        BabySitter bs = new BabySitter();
        assertEquals(30,bs.calcHourlyRate());
    }


}
