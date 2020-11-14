package module.fourth.task13;

import java.util.List;

public class Region {
    private String nameOfRegion;
    private City regionalCenter;
    private double area;
    private List<District> districts;

    public Region(String nameOfRegion, City regionalCenter, double area ) {
        this.nameOfRegion = nameOfRegion;
        this.regionalCenter = regionalCenter;
        this.area = area;
    }

    public City getRegionalCenter() {
        return regionalCenter;
    }

    public String getNameOfRegion() {
        return nameOfRegion;
    }


    public double getArea() {
        return area;
    }


}
