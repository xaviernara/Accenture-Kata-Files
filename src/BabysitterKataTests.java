
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BabysitterKataTests {

    BabySitter bs;
    Random random;
    LocalTime time, time2 = LocalTime.of(random.nextInt(24), random.nextInt(60));;
    LocalDate date;
    Map<String,LocalDate> dateMap;


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


    @Before
    public String generateRandomFamily(){
        String familyNames = "ABCABCABCABCABCABCABCABCABC";

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < 17; i++) {
            int randIndex=random.nextInt(familyNames.length());
            res.append(familyNames.charAt(randIndex));
        }
        return res.toString();

    }

    @Before
    public void randomDates(){

        dateMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            date = LocalDate.of(random.nextInt(2019),random.nextInt(12),random.nextInt(31));
            dateMap.put(generateRandomFamily(),date);
            //System.out.println(localDateTime);
        }
    }

    @Before
    public Map<String,LocalDate> generateMapWithRandomFamilyAndTime(){


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
    public void FamilyIsRequestingBabysitterDayReturnsBooleanIfAvailable(){
        assertEquals(true, bs.babysitterTimeSlots(dateMap,));
    }




}
