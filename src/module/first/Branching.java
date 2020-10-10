package module.first;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class Branching {
    public static void main(String[] args) {
//    .
        task1_1();
        task2_2();
        task2_3();
        task2_4();
    }

    /*
    1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
      то будет ли он прямоугольным
     **/
    private static void task1_1() {
        int angle1 = 60;
        int angle2 = 30;
        final int SUM_ANGLES = 180;//сумма углов треугольника всегда равна 180 гр
        int angle3 = SUM_ANGLES - angle1 - angle2;

        if (angle1 + angle2 < 180) {
            System.out.print("1.Result module1 task2_1: треугольник существует");
            if (angle1 == 90 | angle2 == 90 | angle3 == 90) {  //лучше | или || ?
                System.out.println(", треуголник прямоугольный"); // так корректно выводить?
            }
        } else {
            System.out.println("1.Result module1 task2_1: треугольник не существует");
        }
    }

    /**
     * Найти max{min(a, b), min(c, d)}.
     */
    private static void task2_2() {
        int a = 15;
        int b = 20;
        int c = -15;
        int d = 44;
        int minAB = compareForMin(a, b);
        int minCD = compareForMin(c, d);
        int result = Math.max(minAB, minCD); //тренировался через класс Match
        System.out.println("2.Result module1 task2_2, MAX value is: " + result);
    }

    //тренировался, создал метод
    public static int compareForMin(int value1, int value2) {
        if (value1 < value2) {
            return value1;
        } else
            return value2;
    }


    /*3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

Есть математическое выражение (x1 - x2) * (y1 - y3) == (x1 - x3) * (y1 - y2) если true---значит это линейная функция
и три точки лежат на прямой

Как реализовать? Можно класс с конструктором  и точками (x,y)...или массивы иксов, игриков.. но тут вынесено  внутри
 метода
Прописал значения для true

         **/
    public static void task2_3() {
        int x1 = -4;
        int x2 = 1;
        int x3 = 6;
        int y1 = -2;
        int y2 = 1;
        int y3 = 4;

        boolean compare = (x1 - x2) * (y1 - y3) == (x1 - x3) * (y1 - y2);
        String result = compare == true ? " Точки расположены на одной прямой" : " Точки не расположены на одной прямой";

        System.out.println("3.Result module1 task2_3: " + result);


    }

    /**
     * 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
     * <p>
     * отверстие.
     */
    public static void task2_4() {
        int a = 122;
        int b = 90;
        int x = 120;
        int y = 250;
        int z = 88;
        int minSizeBrick1 = Math.min(x, y);
        int minSizeBrick2 = Math.min(y, z);

        if ((minSizeBrick1 < a || minSizeBrick1 < a) && (minSizeBrick2 < b || minSizeBrick2 < b)) {

            System.out.println("4.Result module1 task2_3: кирпич проходит в отверстие");
        } else {
            System.out.println("4.Result module1 task2_3: кирпич не проходит в отверстие");
        }
    }
}


//5. Вычислить значение функции:


