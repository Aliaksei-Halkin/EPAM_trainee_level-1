package module.first;

public class Branching {
    public static void main(String[] args) {
//    1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
//    то будет ли он прямоугольным.
        int angle1 = 60;
        int angle2 = 30;
        final int SUM_ANGLES = 180;//сумма углов треугольника всегда равна 180 гр
        int angle3 = SUM_ANGLES - angle1 - angle2;

        if (angle1 + angle2 < 180) {
            System.out.print("1. Result Branching task1: треугольник существует");
            if (angle1 == 90 | angle2 == 90 | angle3 == 90) {  //лучше | или || ?
                System.out.println(", треуголник прямоугольный"); // так корректно выводить?
            }
        } else {
            System.out.println("1. Result Branching task1: треугольник не существует");
        }

//            2. Найти max{min(a, b), min(c, d)}.


//            3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

//4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.

//5. Вычислить значение функции:
    }
}