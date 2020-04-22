import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Map;
import java.util.Random;

public class BabySitter {



    public static int calcNightCharge(String familyName,LocalTime startTime, LocalTime endTime){

        int hourlyRateToBabysitForFamily = 0;

        if ("A".equals(familyName)) {
            for (LocalTime localTime = startTime; localTime.isBefore(endTime); localTime.plusHours(1)) {

                if (localTime.isAfter(LocalTime.parse("23:00"))) {
                    hourlyRateToBabysitForFamily += 20;
                } else {
                    hourlyRateToBabysitForFamily += 15;
                }
            }

            System.out.println(hourlyRateToBabysitForFamily);

            return hourlyRateToBabysitForFamily;
        } else if ("B".equals(familyName)) {
            for (LocalTime localTime = startTime; localTime.isBefore(endTime); localTime.plusHours(1)) {

                if (localTime.isBefore(LocalTime.parse("22:00"))) {
                    hourlyRateToBabysitForFamily += 12;
                } else if (localTime.isAfter(LocalTime.parse("22:00")) && localTime.isBefore(LocalTime.parse("24:00"))) {
                    hourlyRateToBabysitForFamily += 8;
                } else {
                    hourlyRateToBabysitForFamily += 16;
                }
            }

            System.out.println(hourlyRateToBabysitForFamily);
            return hourlyRateToBabysitForFamily;
        } else {
            for (LocalTime localTime = startTime; localTime.isBefore(endTime); localTime.plusHours(1)) {

                if (localTime.isBefore(LocalTime.parse("21:00"))) {
                    hourlyRateToBabysitForFamily += 21;
                } else {
                    hourlyRateToBabysitForFamily += 15;
                }
            }

        }
        System.out.println(hourlyRateToBabysitForFamily);
        return hourlyRateToBabysitForFamily;
    }

    public static String determineWhichFamilyWantsBabysitter(String familyName){

        return familyName;
    }

    public static void familyMiscDetails(){

        int numOfPets = 2;
        int numOfKids = 3;

        Random random = new Random();

        LocalTime bedTime = LocalTime.of(random.nextInt(24), random.nextInt(60));

    }




    public static boolean determineIfAvailableToBabysitForTimeRange(LocalTime babysitTimeStart, LocalTime babysitTimeStop) {

        LocalTime startBabysittingTime = LocalTime.parse( "17:00" );
        LocalTime stopBabysittingTime = LocalTime.parse( "04:00" );

        if (babysitTimeStart.isAfter(startBabysittingTime) && babysitTimeStop.isBefore(stopBabysittingTime)){
            return true;
        }
        else if (babysitTimeStart.isBefore(stopBabysittingTime) && babysitTimeStop.isAfter(startBabysittingTime)){
            return true;
        }

        else if (startBabysittingTime.equals(babysitTimeStart) && stopBabysittingTime.equals(babysitTimeStop) ){
            return true;
        }

        return false;

    }


    public static boolean babysitterTimeSlots(Map<String, LocalTime> map, String familyName, LocalTime time, LocalTime time2) {

        if ( (map.containsKey(familyName) && map.containsValue(time)) && (map.containsKey(familyName) && map.containsValue(time2) ) ){
            return false;
        }
        else{
            map.put(familyName,time);
            map.put(familyName,time2);

        }

        return true;
    }

    public static boolean babysitterDaySlots(Map<String, LocalDate> map, String familyName, LocalTime date) {

        if ( (map.containsKey(familyName) && map.containsValue(date))){
            return false;
        }

        return true;
    }


}
