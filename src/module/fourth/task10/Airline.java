package module.fourth.task10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод  toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 *
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 *
 * Найти и вывести:
 *
 * a) список рейсов для заданного пункта назначения;
 *
 * b) список рейсов для заданного дня недели;
 *
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class Airline {
    private String destination;
    private Integer flightNumber;
    private String typePlane;
    private Date timeOfDeparture;
    private Days day;
    static SimpleDateFormat ft = new SimpleDateFormat("HH:mm");//ЭТОТ паттерн почему-то работает не только на время

    public Airline(String destination, Integer flightNumber, String typePlane, String timeOfDeparture, Days day) throws ParseException {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.typePlane = typePlane;
        this.timeOfDeparture = ft.parse(timeOfDeparture );
        this.day = day;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getTypePlane() {
        return typePlane;
    }

    public void setTypePlane(String typePlane) {
        this.typePlane = typePlane;
    }

    public Date getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(Date timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public Days getDay() {
        return day;
    }

    public void setDay(Days day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", typePlane='" + typePlane + '\'' +
                ", timeOfDeparture=" + timeOfDeparture +
                ", day=" + day +
                '}';
    }
}
