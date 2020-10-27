package module.second.onedimencionalaarays;

import java.util.Arrays;

/**
 * 1.Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
 * натуральных чисел:
 * <p>
 * <p>
 * <p>
 * 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 * <p>
 * 3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
 * <p>
 * 4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из пар точек
 * самое большое расстояние. Указание. Координаты точек занести в массив.
 * <p>
 * 5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, которое
 * меньше максимального элемента массива, но больше всех других элементов).
 * <p>
 * 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 * <p>
 * 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 * <p>
 * 8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * <p>
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с
 * номерами от k до m.
 * <p>
 * 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, если угол
 * между сторонами длиной X и Y— прямой.
 * <p>
 * 10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры
 * числа N.
 * <p>
 * 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 * <p>
 * 12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа,
 * сумма цифр которых равна К и которые не большее N.
 * <p>
 * 13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). Найти и
 * напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения задачи
 * использовать декомпозицию.
 * <p>
 * 14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в
 * степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
 * <p>
 * 15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например,
 * 1234, 5789). Для решения задачи использовать декомпозицию.
 * <p>
 * 16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. Определить также,
 * сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 * <p>
 * 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких действий
 * надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */
public class Methods {


    public static void main(String[] args) {
        int a = 15;
        int b = 100;
        System.out.println("4.1 НОД = " + task4_1Gcd(a, b));
        System.out.println("  НОК = " + task4_1Nod(a, b));
        System.out.println("4.2 НОД = " + task4_2(new int[]{40, 16, 8, 32}));
        System.out.println("4.3 Площадь шестигранника со стороной a = " + a + " равна " + 6 * (int) task4_3(a));
        int[][] arr = new int[][]{
                {-15, 20, 0, 12, 3, -8, 5},
                {5, 12, 8, -15, -7, 0, 1}
        };
        System.out.println("4.4 Наибольшее расстояние меджду точками " + task4_4(arr) + " (но мне не нравиться это решение" +
                ", не могу понять как сравнить абсолютно все точки");
        System.out.println("4.5 решение: ");
        System.out.println("Предмаксимальный элемент равен " + task4_5(Sorting.arraySecondForTask4));

        //4.6
        int numberOneForTask6 = 3;
        int numberTwoForTask6 = 47;
        int numberThreeForTask6 = 79;
        System.out.println("4.6 Compare result: " + compareIfTheySimple(numberOneForTask6, numberThreeForTask6, numberTwoForTask6));
        //4.7
        System.out.println("4.7 Sum factorials of odd numbers befor 9:  " + sumFactorial(9));
        //4.8
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6,};
        System.out.println("4.8 Sum third number triple:  " + sumElementsOfArray(array));
        //4.9
        int numX = 10;
        int numY = 45;
        int numZ = 25;
        int numT = 30;
        System.out.println("4.9 Squere of a quadrangle  " + squareForBraxmagupta(numT, numX, numY, numZ));
        //4.10
        int number = 125892546;
        System.out.println("4.10 Array numbers from number  " + Arrays.toString(fillArrayNumbers(number)));
        //4.11
        int num1 = 125;
        int num2 = 1013;
        System.out.println("4.11 Greater length from Number: " + compareLength(num1, num2));
        //4.12
        int numK = 10;
        int numN = 20;
        System.out.println("4.12 Creating array: " + Arrays.toString(createArray(numK, numN)));
        //4.13
        int n = 20;
        System.out.println("4.13 Numbers: ");
        searchNumbers(n);
        System.out.println();
        //4,14
        int k = 9999;
        System.out.println("4.14 Numbers of Armstrong: ");
        for (int i = 1; i <= k; i++) {
            pereborNumbers(i);
        }
        System.out.println();

        //4.15
        int aN = 10000;
        System.out.println("4.15 Numbers sort: ");
        for (int i = 1; i <= aN; i++) {
            getArrayOfNumber(i);
        }
    }


    public static int task4_1Gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    static int task4_1Nod(int a, int b) {
        return (a * b) / task4_1Gcd(a, b);
    }


    static int task4_2(int[] nums) {
        int gcd = nums[0];
        for (int i = 1; i < nums.length; i++) {
            gcd = task4_1Gcd(gcd, nums[i]);
        }
        return gcd;
    }

    static double task4_3(int nums) {
        return Math.sqrt(3) * Math.pow(nums, 2) / 4;
    }

    private static double task4_4(int[][] array) {
        double maxValue = 0;

        for (int j = 0, i = 0; j < array.length - 1; j++) {
            double vectorLength = Math.hypot(array[i][j] - array[i][j + 1], array[i + 1][j] - array[i + 1][j + 1]);
            if (maxValue < vectorLength) {
                maxValue = vectorLength;
            }
        }

        return maxValue;
    }


    static int task4_5(int[] array) {

        Sorting.task3_3(array);
        int numMax = array[0];
        int bufer = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > numMax) {
                bufer = numMax;
                numMax = array[i];
            }
        }
        return bufer;
    }

    private static int primeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return 0;
            }
            if ((i == number) || (i > Math.sqrt(number))) {
                return 1;
            }
        }
        return 0;
    }

    private static String compareIfTheySimple(int numA, int numB, int numC) {
        if (primeNumber(numA) == 1 &&
                primeNumber(numB) == 1 &&
                primeNumber(numC) == 1) {
            return "Three numbers are simple!";
        } else {
            return "Three numbers aren't simple";
        }
    }

    static int factirialRecursionMethod(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factirialRecursionMethod(num - 1);
    }

    static int sumFactorial(int num) {
        int result = 0;
        for (int i = 1; i <= num; i = i + 2) {
            result += factirialRecursionMethod(i);
        }
        return result;
    }

    private static int sumElementsOfArray(int[] arr) {
        int sumCounter = 0;
        int index = 0;
        for (int i = 1; i < 5; i += 2) {
            sumCounter += arr[i] + arr[i + 1] + arr[i + 2];
            index = i;
        }
        for (int i = index + 1; i < arr.length; i += 3) {
            sumCounter += arr[i] + arr[i + 1] + arr[i + 2];
        }

        return sumCounter;
    }

    static double squareForBraxmagupta(int x, int y, int z, int t) {
        int squere;
        int halfPerimetr = halfPerimetr(x, y, z, t);
        double square = Math.sqrt((halfPerimetr - x) * (halfPerimetr - y) * (halfPerimetr - z) * (halfPerimetr - t));
        return square;
    }

    static int halfPerimetr(int... num) {
        int result = 0;
        for (int i = 0; i < num.length; i++) {
            result += num[i];
        }
        return result / 2;
    }

    static int[] fillArrayNumbers(int num) {
        int[] arr = new int[sizeArray(num)];
        //здесь прикольная штука, число num склонировано в метод и в памяти его изменяю
        for (int i = 0; i < arr.length; i++) {
            if (num != 0) {
                arr[i] = num % 10;
                num /= 10;
            }
        }
        return arr;
    }

    static int sizeArray(int num) {
        return Integer.toString(num).length();
    }

    static String compareLength(int num1, int num2) {
        if (sizeArray(num1) > sizeArray(num2)) {
            return "num1";
        } else {
            return "num2";
        }
    }

    static Integer creatingNumbers(int num1, int num) {
        int bufferNum = (int) (Math.random() * num);
        if (bufferNum < 10) {
            int m = num1 - bufferNum;
            return Integer.parseInt(String.valueOf(m) + String.valueOf(bufferNum));
        } else if (bufferNum > 10 && bufferNum < num) {
            int m2 = bufferNum % 10;
            return Integer.parseInt(String.valueOf(m2) + String.valueOf(num1 - m2));
        } else {
            int m3 = bufferNum / 10;
            int m = num1 - m3;
            return Integer.parseInt(String.valueOf(m) + String.valueOf(m3));
        }
    }


    static Integer[] createArray(int num1, int num) {
        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = creatingNumbers(num1, num);
        }
        return arr;
    }

    static void searchNumbers(int n) {
        int bufer = n;
        for (int i = bufer; i < 2 * n - 2; i++) {
            print(i);
            print(i + 2);
        }
    }

    static void print(int i) {
        System.out.printf("%5d", i);
    }

    static void pereborNumbers(int k) {
        if (k == searchArmstrong(getArray(k))) {
            System.out.printf("%5d", k);
        }
    }

    public static int[] getArray(int num) {
        int[] array = new int[lengthNumber(num)];
        int counter = lengthNumber(num) - 1;
        while (num != 0) {
            array[counter] = num % 10;
            num /= 10;
            counter--;
        }

        return array;
    }

    public static int lengthNumber(int a) {

        int b = 0;
        while (a >= 1) {
            b++;
            a /= 10;
        }
        return b;
    }

    public static int searchArmstrong(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i], arr.length);
        }
        return sum;
    }

    public static void getArrayOfNumber(int num) {
        int[] array = new int[lengthNumber(num)];
        int counter = lengthNumber(num) - 1;
        while (num != 0) {
            array[counter] = num % 10;
            num /= 10;
            counter--;
        }
        searchNumber(array);


    }

    public static void searchNumber(int[] arr) {

        int i = 0;
        switch (arr.length) {
            case 2: {
                if (isaBoolean2(arr, i)) {
                  printArray(arr);

                }
                break;
            }
            case 3: {
                if (isaBoolean3(arr, i)) {
                    printArray(arr);
                }
                break;
            }
            case 4: {
                if (isaBoolean4(arr, i)) {
                    printArray(arr);
                }
                break;
            }

        }

    }

    private static boolean isaBoolean2(int[] arr, int i) {
        return arr[i] + 1 == arr[i + 1];
    }

    private static boolean isaBoolean4(int[] arr, int i) {
        return isaBoolean3(arr, i) && arr[i] + 3 == arr[i + 3];
    }

    private static boolean isaBoolean3(int[] arr, int i) {
        return isaBoolean2(arr, i) && arr[i] + 2 == arr[i + 2];
    }

    static void printArray(int[] arr) {
        int result=0;
        for (int i =arr.length -1 , n = 0; i >= 0; --i, n++) {
            int pos = (int)Math.pow(10, i);
            result += arr[n] * pos;
        }
        System.out.printf("%5d",result);
    }
}



