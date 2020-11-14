package module.fourth.task13;


/**
 * Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */
public class State {
    private Region[] regions;
    private City capital;


    public State(City capital, Region[] regions) {
        this.regions = regions;
        this.capital = capital;
    }

    public Region[] getRegions() {
        return regions;
    }

    public City getCapital() {
        return capital;
    }

    public double areaCountry(Region[] regions) {
        double counter = 0;
        for (Region reg : regions
        ) {
            counter += reg.getArea();
        }
        return counter;
    }
    public void regionCapital() {
        for (Region reg : regions
        ) {
            System.out.println("In region "+reg.getNameOfRegion()+" central City is "+reg.getRegionalCenter());
        }
    }

}
