package module.fourth.task7;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public static double getPoinMedianX(Point pointA,Point pointB,Point pointC){
        return (pointA.getX()+pointB.getX()+pointC.getX())/3;

    }
    public static double getPoinMedianY(Point pointA,Point pointB,Point pointC){
        return (pointA.getY()+pointB.getY()+pointC.getY())/3;

    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
