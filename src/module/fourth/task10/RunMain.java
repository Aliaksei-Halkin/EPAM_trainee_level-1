package module.fourth.task10;

import java.text.ParseException;

public class RunMain {
    public static void main(String[] args) throws ParseException {
        Airline[] airlines={new Airline("Kiev",25511,"Boing","12:15",Days.MONDAY),
                new Airline("Kiev",25211,"Airbus","00:21",Days.THURSDAY),
                new Airline("Kiev",25501,"Airbus", "02:50",Days.THURSDAY),
                new Airline("Moskow",25531,"Boing","04:28",Days.SATURDAY),
                new Airline("Moskow",25531,"Jet","06:10",Days.THURSDAY),
        };
        AirlineService airlineService=new AirlineService();
        airlineService.printDistination(airlines,"Kiev");
        airlineService.printDestinationForDay(airlines,Days.THURSDAY);
        airlineService.printDestinationForDayAndTime(airlines,Days.THURSDAY,Airline.ft.parse("02:00"));
    }
}
