package module.first;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LinearPrograms {
    public static void main(String[] args) {
//1. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.
        int b = 8;
        int c = 3;
        int a = 5;
        int z = ((a - 3) * b / 2) + c;
        System.out.println("1. Result LinearPrograms task1: " + z);


//2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        c = 3; //переинициализация переменной
        a = b - 5;

        double result2 = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("2. Result LinearPrograms task2: " + result2);

        //округление
        BigDecimal bd = new BigDecimal(Double.toString(result2));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        System.out.println("2. Result LinearPrograms task2 с округлением: " + bd);


        //System.out.println(Math.pow(2,-2));  0.25
        //System.out.println(1/Math.pow(2,2));  0.25

//3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        int x = 8;
        int y = 5;

        double result3 = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println("3. Result LinearPrograms task3: " + result3);


//4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную
// и целую части числа и вывести полученное значение числа.
        double w = 123.456;
        double n = (int) w;
        // double result4 = (z * 1000) % 1000  +(int)z/1000.0;    1000.0 -это про расширение значений когда встречается int  и double
        double result4 = (w * 1000) % 1000 + n / 1000;

        System.out.println("4. Result LinearPrograms task4: " + result4);


//5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
// Вывести данное значение длительности в часах, минутах и секундах в следующей форме:




//6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
// принадлежит закрашенной области, и false — в противном случае:
    }

}
