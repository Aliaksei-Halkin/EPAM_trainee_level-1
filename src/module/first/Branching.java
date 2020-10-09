package module.first;

import java.sql.PreparedStatement;

public class Branching {
    public static void main(String[] args) {
//    .
        task1_1();
        task2_2();

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
        int minAB = compareForMin(a,b);
        int minCD = compareForMin(c,d);
        int result = Math.max(minAB,minCD);
        System.out.println("2. Result module1 task2_2  MAX is: "+result);


    }

    public static int compareForMin(int value1, int value2) {
        if (value1<value2){
            return  value1;
        }else
            return value2;

     //   return value1;
    }

//            3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

//4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.

//5. Вычислить значение функции:


}