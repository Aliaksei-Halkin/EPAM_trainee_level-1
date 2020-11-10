package module.fourth.task7;

/**
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади,
 * периметра и точки пересечения медиан.
 */
public class RunMain {
    public static void main(String[] args) {
        Point pointA = new Point(0, 0);
        Point pointB = new Point(4, 0);
        Point pointC = new Point(0, 3);
        Triangle triangle = new Triangle(getSideA(pointA, pointB), getSideA(pointB, pointC), getSideA(pointC, pointA));
        System.out.println( triangle.toString());
        System.out.println("Perimetr " + triangle.getPerimetr());
        System.out.println("Area "+triangle.getArea());
        double pointMedianaX = Point.getPoinMedianX(pointA, pointB, pointC);
        double pointMedianaY = Point.getPoinMedianY(pointA, pointB, pointC);

        Point pointMidiana = new Point(pointMedianaX, pointMedianaY);
        System.out.println("Mediana " + pointMidiana.toString());

    }

    static double getSideA(Point point1, Point point2) {
        return Math.hypot(point2.getX() - point1.getX(), point2.getY() - point1.getY());
    }


}
