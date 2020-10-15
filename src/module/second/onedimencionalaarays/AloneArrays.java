package module.second.onedimencionalaarays;

import java.util.Arrays;

/**
 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 * <p>
 * <p>
 * 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
 * Подсчитать количество замен.
 * <p>
 * 3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и
 * нулевых элементов.
 * <p>
 * 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 * <p>
 * 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 * <p>
 * 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми
 * числами.
 * <p>
 * 7. Даны действительные числа а1 ,а2 ,..., аn. Найти
 * <p>
 * <p>
 * <p>
 * 8. Дана последовательность целых чисел а1 ,а2 ,..., аn. Образовать новую последовательность, выбросив из исходной те
 * члены, которые равны min(а1 ,а2 ,..., аn).
 * <p>
 * 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел
 * несколько, то определить наименьшее из них.
 * <p>
 * 10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
 * (освободившиеся элементы заполнить нулями).
 */
public class AloneArrays {


    public static void main(String[] args) {
        task1_1();
        task1_2();
        task1_3();
        task1_4();

    }


    public static void task1_1() {
        int k = 2;
        int arrayA[] = new int[10];
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = (int) (Math.random() * 1000 - 1000);
            System.out.print(arrayA[i] + "  ");
        }
        System.out.println(" ");
        int arrayB[] = new int[arrayA.length];
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] % k == 0) {
                int b = 0;
                arrayB[b] = arrayA[i];
                System.out.print(arrayB[b] + "  ");
                b++;
            }
        }
        System.out.println(" ");

    }

    public static void task1_2() {

        int z = 2;
        int count = 0;
        Integer[] arr = new Integer[]{8, 9, 0, -15, -18, 2, 25, 18, 5, 25, -35, -100};
        System.out.println("2. Array" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > z) {
                arr[i] = z;
                count++;
            }
        }
        System.out.println("In result array consist of:" + Arrays.toString(arr) + "\nNumber of count: " + count);

    }

    public static void task1_3() {

        int z = 2;
        int countNegativ = 0;
        int countPositiv = 0;
        int countZero = 0;
        Integer[] arr = new Integer[]{8, 9, 0, -15, -18, 2, 25, 0, 5, 25, -35, -100};
        System.out.println("3. Array" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                countNegativ++;
            } else if (arr[i] > 0) {
                countPositiv++;
            } else {
                countZero++;
            }
        }
        System.out.println("Negativе number: " + countNegativ + "  Positivе number: " + countPositiv +
                " Number of Zero: " + countZero);

    }

    public static void task1_4() {

        int positionMaxNumberInArray = 0;
        int positionMinNumberInArray = 0;
        int numberTemp;
        Integer[] arr = new Integer[]{8, 9, 0, -15, -18, 2, 5500, 0, 5, 15, -35, -1000};
        System.out.println("4. Array" + Arrays.toString(arr));
        int numberMax = arr[0];
        int numberMin = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (numberMax < arr[i]) {
                numberMax = arr[i];
                positionMaxNumberInArray = i;
            }
            if (numberMin > arr[i]) {
                numberMin = arr[i];
                positionMinNumberInArray=i;
            }
        }
        numberTemp=numberMax;
        arr[positionMaxNumberInArray]=numberMin;
        arr[positionMinNumberInArray]=numberTemp;

        System.out.println("Result Array:" + Arrays.toString(arr));

    }

}