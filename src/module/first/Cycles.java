package module.first;

import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        task2_1();

    }

    /*
    1. Напишите программу, где пользователь вводит любое целое положительное число.
    А программа суммирует все числа от 1 до введенного пользователем числа.

     */
    public static void task2_1() {
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

3. Найти сумму квадратов первых ста чисел.

4. Составить программу нахождения произведения квадратов первых двухсот чисел.

5. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

6. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.

7. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
     */
}
