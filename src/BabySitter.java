import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

public class BabySitter {

    public static int calcHourlyRate(String familyName){

        int hourlyRateToBabysitForFamily = 0;

        if (familyName == "A"){
            return 30;
        }
        return hourlyRateToBabysitForFamily;
    }

    public static String determineWhichFamilyWantsBabysitter(String familyName){

        return familyName;
    }

    public static void familyAMiscDetails(){

        int numOfPets = 2;
        int numOfKids = 3;

        Random random = new Random();

        LocalTime bedTime = LocalTime.of(random.nextInt(24), random.nextInt(60));

    }




    public boolean determineIfAvailableToBabysitForTimeRange(LocalTime babysitTimeStart, LocalTime babysitTimeStop) {

        LocalTime startBabysittingTime = LocalTime.parse( "17:00" );
        LocalTime stopBabysittingTime = LocalTime.parse( "04:00" );

        if (babysitTimeStart.isAfter(startBabysittingTime) && babysitTimeStop.isAfter(stopBabysittingTime)){
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
}
