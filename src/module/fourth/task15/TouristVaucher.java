package module.fourth.task15;

/**
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
 * (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта,
 * питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public class TouristVaucher {
    private  String country;
    private  String city;
    private  Food food;
    private Transport transport;
    private TourType tourType;
    private  double cost;
    private int numberOfDays;

    public TouristVaucher(String country, String city, TourType tourType,Transport transport,  Food food,
                          int numberOfDays, double cost) {
        this.country = country;
        this.city = city;
        this.food = food;
        this.transport = transport;
        this.tourType = tourType;
        this.cost = cost;
        this.numberOfDays = numberOfDays;
    }

    @Override
    public String toString() {
        return "TouristVaucher{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", food=" + food +
                ", transport=" + transport +
                ", tourType=" + tourType +
                ", cost=" + cost +
                ", numberOfDays=" + numberOfDays +
                '}';
    }

    public double getCost() {
        return cost;
    }

    public Food getFood() {
        return food;
    }

    public Transport getTransport() {
        return transport;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }
}
