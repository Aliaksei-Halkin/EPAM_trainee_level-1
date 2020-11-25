package module.fifth.task3;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RunMain {


    public static void main(String[] args) {
        MyCalendar calendar20 = new MyCalendar(2020);

        calendar20.setWeekend();

        calendar20.setHolidays("03.08.2020");
        calendar20.setHolidays("23.02.2020");
        calendar20.setHolidays("01.01.2020");
        calendar20.setHolidays("09.05.2020");

//
//        Date date1 = null;
//        try {
//            date1 = new SimpleDateFormat( "dd.MM.yyyy" ).parse( "03.08.2020" );
//            calendar20.checkDateIsHoliday(data1);
//
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
    }
}
