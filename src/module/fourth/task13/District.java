package module.fourth.task13;

import java.util.ArrayList;
import java.util.List;

public class District {
    private String nameOfDistricte;
    private double area;
    private List<City> cities=new ArrayList<>();

    public List<module.fourth.task13.City> getCities() {
        return cities;
    }

    public void addlist(City city) {
        cities.add(city);
    }

    public void setCities(List<module.fourth.task13.City> cities) {
        this.cities = cities;
    }

    public List<module.fourth.task13.City> getCity() {
        return City;
    }

    public void setCity(List<module.fourth.task13.City> city) {
        City = city;
    }

    private List<City> City;

    public District(String nameOfDistricte, double area) {
        this.nameOfDistricte = nameOfDistricte;
        this.area = area;
    }

    public String getNameOfDistricte() {
        return nameOfDistricte;
    }

    public void setNameOfDistricte(String nameOfDistricte) {
        this.nameOfDistricte = nameOfDistricte;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
