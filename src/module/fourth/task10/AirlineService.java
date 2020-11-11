package module.fourth.task10;


import java.util.Date;

public class AirlineService {
    public void printDistination(Airline[] airlines, String distination) {
        System.out.println("Planes by distination: " + distination);
        for (Airline plane : airlines) {
            if (plane.getDestination().equalsIgnoreCase(distination)) {
                System.out.println(plane.toString());
            }
        }
    }

    public void printDestinationForDay(Airline[] airlines, Days day) {
        System.out.println("Planes by day: " + day);
        for (Airline plane : airlines) {
            if (plane.getDay().equals(day)) {
                System.out.println(plane.toString());
            }
        }
    }

    public void printDestinationForDayAndTime(Airline[] airlines, Days day, Date timeOfDeparture) {
        System.out.println("Planes in day: "+day+" after time: " + timeOfDeparture);
        for (Airline plane : airlines) {
            if (plane.getDay().equals(day)) {
                if (timeOfDeparture.before(plane.getTimeOfDeparture())) {
                    System.out.println(plane.toString());


                }

            }
        }
    }
}



