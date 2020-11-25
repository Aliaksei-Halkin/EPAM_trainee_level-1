package module.fifth.task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MyCalendar {

    private Vacation vacation;
    private int year;

    public MyCalendar(int year) {
        this.year = year;

    }

    public MyCalendar(final Vacation vacation) {
        this.vacation = vacation;
    }



    public void setWeekend() {
        Calendar calendar = new GregorianCalendar(year, Calendar.JANUARY, 1);
        for (int i = 1; i < 13; i++) {
            for (int j = 0; j < calendar.getActualMaximum(Calendar.DAY_OF_MONTH); j++) {
                calendar.roll(Calendar.DATE, 1);
                if (calendar.get(GregorianCalendar.DAY_OF_WEEK)==1 ||calendar.get(GregorianCalendar.DAY_OF_WEEK)==7 ) {
                    Date date = calendar.getTime();
                   vacation.weekend.add(date);
                }
            }
            calendar.roll(Calendar.MONTH, 1);
        }
    }
    public void setHolidays(String str) {
        Date date = null;
        try {
            date = new SimpleDateFormat( "dd.MM.yyyy" ).parse( str );
            vacation.holidays.add(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    class Vacation {
        private List<Date> weekend = new ArrayList<>();
        private List<Date> holidays = new ArrayList<>();


        public boolean isDateIsHoliday(final Date date) {
            for (Date holiday : holidays) {
                if (holiday.equals(date)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isDateIsWeekend(final Date date) {
            for (Date holiday : holidays) {
                if (holiday.equals(date)) {
                    return true;
                }
            }
            return false;
        }

        // является ли эта дата праздничной
        // является ли эта дата выходным
    }

    public boolean checkDateIsHoliday(Date date) {
        return this.vacation.isDateIsHoliday(date);
    }

    public boolean checkDateIsWeekend(Date date) {
        return this.vacation.isDateIsWeekend(date);
    }

}
