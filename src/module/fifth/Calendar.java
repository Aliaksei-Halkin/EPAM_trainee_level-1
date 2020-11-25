package module.fifth;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Calendar {

    private Vacation vacation;

    public Calendar(final Vacation vacation) {
        this.vacation = vacation;
    }

    public class Vacation{
        private List<Date> vihodnyedni = new ArrayList<>();
        private List<Date> holidays = new ArrayList<>();

        public boolean isDateIsHoliday(final Date date) {
            for (Date holiday : holidays) {
                if (holiday.equals(date)) {
                    return true;
                }
            }
            return false;
        }

        //является ли эта дата праздничной
        //является ли эта дата выходным
    }

    public boolean checkDateIsHoliday(Date date) {
        return this.vacation.isDateIsHoliday(date);
    }
}
