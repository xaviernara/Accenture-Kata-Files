
import org.junit.Before;
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
    public void babySitterWorksANightForAFamilyItReturnsPaymentRequired(){
        assertEquals(120,bs.calcNightCharge("B",LocalTime.parse("20:00"),LocalTime.parse("04:00") ));
        assertEquals(141,bs.calcNightCharge("C",LocalTime.parse("20:00"),LocalTime.parse("04:00") ));
        assertEquals(145,bs.calcNightCharge("A",LocalTime.parse("20:00"),LocalTime.parse("04:00") ));

    }

    @Test
    public void determineWhichHoursBabysitterCanWorkTimeRangeReturnBooleanIfAvailable(){
        //assertEquals(true, bs.determineIfAvailableToBabysitForTimeRange(time, time2) );
        //assertEquals(false, bs.determineIfAvailableToBabysitForTimeRange(time, time2) );

        assertEquals(true, bs.determineIfAvailableToBabysitForTimeRange(LocalTime.parse( "17:00" ), LocalTime.parse( "04:00" )) );
        assertEquals(false, bs.determineIfAvailableToBabysitForTimeRange(LocalTime.parse( "18:34" ), LocalTime.parse( "06:45" )) );
    }

    @Test
    public void FamilyIsRequestingBabysitterReturnsHourlyRate(){

    }




}
