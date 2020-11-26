package module.fifth.task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MyCalendar {

    private static final int NUMBER_OF_MONTH = 12;
    private final Vacation vacation;

    public MyCalendar(final Vacation vacation) {
        this.vacation = vacation;
    }

    public void addHoliday(String date) throws ParseException {
        this.vacation.addHoliday(date);
    }

    public static class Vacation {
        private List<Date> weekends = new ArrayList<>();
        private List<Date> holidays = new ArrayList<>();

        public Vacation(final List<String> holidays, int year) throws ParseException {
            addHolidays(holidays);
            setWeekends(year);
        }

        private void addHolidays(final List<String> holidays) throws ParseException {
            for (String holiday : holidays) {
                addHoliday(holiday);
            }
        }

        public Vacation(final List<Date> weekends, final List<Date> holidays) {
            this.weekends = weekends;
            this.holidays = holidays;
        }

        public boolean isDateIsHoliday(final Date date) {
            return holidays.contains(date);
        }

        public boolean isDateIsWeekend(final Date date) {
            return weekends.contains(date);
        }

        private void setWeekends(int year) {
            Calendar calendar = new GregorianCalendar(year, Calendar.JANUARY, 1);
            for (int month = 0; month < NUMBER_OF_MONTH; month++) {
                for (int day = 0; day < calendar.getActualMaximum(Calendar.DAY_OF_MONTH); day++) {
                    calendar.roll(Calendar.DATE, 1);
                    if (isWeekend(calendar)) {
                        Date date = calendar.getTime();
                        weekends.add(date);
                    }
                }
                calendar.roll(Calendar.MONTH, 1);
            }
        }

        private boolean isWeekend(final Calendar calendar) {
            int dayOfWeek = calendar.get(GregorianCalendar.DAY_OF_WEEK);
            return dayOfWeek == Calendar.SUNDAY || dayOfWeek == Calendar.SATURDAY;
        }

        public void addHoliday(String str) throws ParseException {
            Date date = new SimpleDateFormat( "dd.MM.yyyy" ).parse(str);
            holidays.add(date);
        }
    }

    public boolean checkDateIsHoliday(Date date) {
        return this.vacation.isDateIsHoliday(date);
    }

    public boolean checkDateIsWeekend(Date date) {
        return this.vacation.isDateIsWeekend(date);
    }

}
