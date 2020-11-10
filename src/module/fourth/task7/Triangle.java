package module.fourth.task7;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "SideA=" + sideA +
                ", SideB=" + sideB +
                ", SideC=" + sideC +
                '}';
    }
    public double getPerimetr(){
        return sideA+sideB+sideC;
    }
    public double getArea(){
        double halfPerimetr=getPerimetr()/2;
        return Math.sqrt(halfPerimetr*(halfPerimetr-sideA)*(halfPerimetr-sideB)*(halfPerimetr-sideC));
    }
}
