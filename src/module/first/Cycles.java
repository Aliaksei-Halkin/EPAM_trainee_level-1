package module.first;

import java.math.BigInteger;
import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        task3_1();
        task3_2();
        task3_3();
        task3_4();
        task3_5();
        task3_6();
        task3_7();
    }

    /*
    1. Напишите программу, где пользователь вводит любое целое положительное число.
    А программа суммирует все числа от 1 до введенного пользователем числа.

     */
    public static void task3_1() {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Введите любое положительное число:");
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Кто ж так вводит, так нельзя!");
            } else {
                System.out.println("Отлично! То что надо!");
            }
        } while (num <= 0);
        int sumNum = 0;
        for (int i = 1; i < num; i++) {
            sumNum += i;
        }
        System.out.println("1.Cумма чисел от 0 до " + num + " равна: " + sumNum);
    }

    /*
2. Вычислить значения функции на отрезке [а,b] c шагом h:
http://comp-science.narod.ru/executants/images/vich/vca1.jpg
**/
    public static void task3_2() {
        int x = 2;
        int y = 0;
        int a = 0;
        int b = 100;
        int h = 2;
        for (; a < b; a = a + h) {
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
        }
        System.out.println(y + " не понимаю условия, поэтому не знаю как посчитать");
    }

    /*
3. Найти сумму квадратов первых ста чисел.
*/
    public static void task3_3() {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println("3.Cумма квадратов первых ста чисел:" + sum);
    }

    /*
4. Составить программу нахождения произведения квадратов первых двухсот чисел.
*/
    public static void task3_4() {
        long multiply = 1;
        // BigInteger a = BigInteger.valueOf(1);
        // BigInteger b = null;
        for (int i = 1; i < 200; i++) {
            multiply *= Math.pow(i, 2);
            //     b =a.multiply(BigInteger.valueOf((int)Math.pow(i,2)));
        }
        System.out.println("4.Произведение квадратов первых двухста чисел(c long) " + multiply + " Но тут возможно" +
                "ошибка, переполнение  памяти *лонга* и надо использовать BigInteger");


    }

    /*
    5. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
    */
    public static void task3_5() {
        System.out.println("Задиние5:");
        for (int i = 50; i <= 55; i++) {
            char ch = (char) i;
            System.out.println("символ " + ch + " соответствует числу " + i);
        }

    }


    /*
6. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 m и n вводятся с клавиатуры.
**/
    public static void task3_6() {
        int m = 0;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую границу промежутка(натуральное число)");
        m = sc.nextInt();
        System.out.println("Введите вторую границу промежутка(натуральное число)");
        n = sc.nextInt();

        for (; m <= n; m++) {//сдесь переьираем числа из промежутка

            for (int j = 2; j <= 10; j++) {// проверяем на какие числа делятся от 2 до 10
                if (m % j == 0) {
                    if (m == j) {//исключение деления на самого себя
                    } else {
                        System.out.println("Число " + m + " делится на " + j);
                    }
                }
            }
        }
    }

    /*
7. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
     */
    public static void task3_7() {
        int a = 1254877;
        int b = 133276674;
        int[] arr = new int[10];
        while (a != 0) {
            arr[a % 10]++;
            a /= 10;
        }
        while (b != 0) {
            if (arr[b % 10] != 0)
                System.out.print(b % 10 + " ");
            b /= 10;
        }
    }
}



