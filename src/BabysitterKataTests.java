
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BabysitterKataTests {

    BabySitter bs;
    LocalTime time, time2;
    Random random;

    @Before
    public void setUp(){
        bs = new BabySitter();
    }

    @Before
    public void randomTime(){


        time = LocalTime.of(random.nextInt(24), random.nextInt(60));
        time2 = LocalTime.of(random.nextInt(24), random.nextInt(60));


        //DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern(" hh:mm ");

        //String formattedDate = time.format(myFormatObj);
        //System.out.println("After formatting: " + formattedDate);
    }



    @Test
    public void babySitterWorksOneHourForAFamilyItReturnsHourlyRate(){
        assertEquals(30,bs.calcHourlyRate("A"));
    }

    @Test
    public void determineWhichHoursBabysitterCanWorkReturnBooleanIfAvailable(){
        assertEquals(true, bs.determineIfAvailableToBabysitForTimeRange(time, time2) );
        assertEquals(false, bs.determineIfAvailableToBabysitForTimeRange(time, time2) );

        //assertEquals(false, bs.determineIfAvailableToBabysitForTimeRange(time, time2) );
        //assertEquals(false, bs.determineIfAvailableToBabysitForTimeRange(time, time2) );
    }

    @Test
    public void FamilyIsRequestingBabysitterReturnsHourlyRate(){

    }




}
