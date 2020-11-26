package module.fifth.task3;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class RunMain {


    public static void main(String[] args) throws ParseException {

        MyCalendar.Vacation vacation = new MyCalendar.Vacation(Arrays.asList("03.08.2020", "23.02.2020", "01.01.2020", "09.05.2020"), 2020);
        MyCalendar calendar20 = new MyCalendar(vacation);
        Date date1 = new SimpleDateFormat( "dd.MM.yyyy" ).parse( "03.08.2020" );
        System.out.println(calendar20.checkDateIsHoliday(date1));

    }
}
