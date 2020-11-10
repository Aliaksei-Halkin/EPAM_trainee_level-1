package module.fourth.task6;

/**
 * Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения его
 * отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений
 * полей поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут
 * и секунд.
 */
public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {
            System.out.println("Ошибка в задании часов");
            this.hours = 0;
        }
    }


    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }

    public int changeHours(int hours) {
        int bufer = this.hours + hours;
        if (bufer >= 0 && bufer < 24) {
            return this.hours = bufer;
        } else return this.hours = Math.abs(bufer % 24);
    }

    public int changeMinutes(int minutes) {
        int bufer = this.minutes + minutes;
        if (bufer >= 0 && bufer < 60) {
            this.hours = bufer;
        } else {
            this.changeHours(bufer / 60);
            this.minutes = Math.abs(bufer % 60);
        }
        return this.minutes;
    }

    public int changeSeconds(int seconds) {
        int bufer = this.seconds + seconds;
        if (bufer >= 0 && bufer < 60) {
            this.seconds = bufer;
        } else {
            this.changeMinutes(bufer / 60);
            this.seconds = Math.abs(bufer % 60);
        }
        return this.seconds;
    }
}