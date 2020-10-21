package module.second.onedimencionalaarays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 * <p>
 * 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 * <p>
 * 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 * <p>
 * 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * <p>
 * 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * <p>
 * 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * <p>
 * 7. Сформировать квадратную матрицу порядка N по правилу:
 * <p>
 * и подсчитать количество положительных элементов в ней.
 * <p>
 * 8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на
 * соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит пользователь
 * с клавиатуры.
 * <p>
 * 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец
 * содержит максимальную сумму.
 * <p>
 * 10. Найти положительные элементы главной диагонали квадратной матрицы.
 * <p>
 * 11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в которых
 * число 5 встречается три и более раз.
 * <p>
 * 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 * <p>
 * 13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 * <p>
 * 14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно
 * номеру столбца.
 * <p>
 * 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 * <p>
 * 16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ...,
 * так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой.
 * Построить такой квадрат.
 */

public class ArraysOfArrays {
    public static void main(String[] args) {
        Integer[][] arr = new Integer[][]{
                {77, 1, 4, 12},
                {3, 4, 5, 25},
                {6, 7, 8, 14},
                {74, 2, 99, 2}
        };
        System.out.println("Исходный массив:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
        task2_1(arr);
        task2_2(arr);
        int k = 2, p = 3;
        task2_3(arr, k, p);
        task2_4();
        task2_5();
        task2_6();
        task2_7();
        // task2_8();
        task2_9(arr);
        task2_10();
        task2_11();
        task2_12(arr);
        task2_13(arr);
        task2_14();
        task2_15(arr);

    }


    public static void task2_1(Integer[][] array) {
        System.out.println("результат task2_1");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j += 2) {

                if (array[0][j] > array[array.length - 1][j]) {
                    System.out.print(array[i][j] + "\t");
                }
            }
        }
        System.out.println("");
    }

    public static void task2_2(Integer[][] array) {
        System.out.println("результат task2_2");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j += 1) {
                if (i == j) {
                    System.out.print(array[i][j] + "\t");

                }
            }
        }
        System.out.println("");
    }

    public static void task2_3(Integer[][] array, int k, int p) {
        System.out.println("результат task2_3");

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[k][j] + "\t");
        }
        System.out.println();
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j][p] + "\t");
        }
        System.out.println();
    }

    public static void task2_4() {
        int n = 6;
        int[][] arr = new int[n][n];

        System.out.println("результат task2_4:");
        for (int i = 0; i < arr.length; i += 2) {
            for (int j = 1; j < arr.length; j++) {
                arr[i][j] = arr[i][j - 1] + 1;
            }
        }
        for (int i = 1; i < arr.length; i += 2) {
            arr[i][0] = n;
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] = arr[i][j - 1] - j;
            }
            arr[i][n - 1] = 1;
        }
        System.out.println();
        System.out.println(Arrays.deepToString(arr));
    }

    public static void task2_5() {
        int n = 6;
        int counter = n;
        int[][] arr = new int[n][n];

        System.out.println("результат task2_5:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < counter; j++) {
                arr[i][j] = 1;
            }
            System.out.println(Arrays.toString(arr[i]));
            counter--;
            break;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < counter; j++) {
                arr[i][j] = arr[i - 1][j] + 1;
            }
            System.out.println(Arrays.toString(arr[i]));
            counter--;
        }


    }

    private static void task2_6() {
        int n = 6;

        System.out.println("результат task2_6:");
        int[][] arr = new int[n][n];

        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - i; j++) {
                result[i][j] = 1;
                result[n - i - 1][j] = 1;
            }
            System.out.println(Arrays.toString(result[i]));
        }
    }

    private static void task2_7() {
        int n = 3;
        double counterSum = 0;
        System.out.println("результат task2_7:");
        double[][] arr = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if (arr[i][j] > 0) {
                    counterSum += arr[i][j];
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("Cумма равна " + counterSum);
    }

    private static void task2_8() {
        System.out.println("Введите номера столбцов, которые следует поменять:");
        Scanner scannerFirst = new Scanner(System.in);
        Scanner scannerSecond = new Scanner(System.in);
        int column1 = scannerFirst.nextInt();
        int column2 = scannerSecond.nextInt();
        int sizeMatrix = Math.max(column1, column2);
        int number = 0;
        int[][] arr = new int[sizeMatrix][sizeMatrix];
        System.out.println("Исходный массив: ");
        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                arr[i][j] = number + 1;
                number++;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i = 0; i < arr.length; i++) {

            int tempNumber = arr[i][column1 - 1];
            arr[i][column1 - 1] = arr[i][column2 - 1];
            arr[i][column2 - 1] = tempNumber;

            System.out.println(Arrays.toString(arr[i]));
        }
    }


    private static void task2_9(Integer[][] array) {
        int maxSum = 0;
        int indexColumn = -1;
        int[] sumArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sumArray[j] += array[i][j];
            }
        }
        System.out.println("10. Суммы элементов по столбцам: " + Arrays.toString(sumArray));
        for (int i = 0; i < sumArray.length; i++) {
            if (sumArray[i] > maxSum) {
                maxSum = sumArray[i];
                indexColumn = i;
            }
        }
        System.out.println("Максимальное значение суммы " + maxSum + " находится в столбце № " + indexColumn + 1);
    }

    private static void task2_10() {
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 100 - 50);
            }
        }

        System.out.println("11. Дана матрица" + Arrays.deepToString(array) +
                "\nположительные элементы главной диагонали:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j && array[i][j] > 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    private static void task2_11() {
        int[][] array = new int[10][20];
        int[] counterFive = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                if (array[i][j] == 5) {
                    counterFive[i] += 1;
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }
        for (int i = 0; i < counterFive.length; i++) {
            if (counterFive[i] >= 3) {
                System.out.println("Число пять встречается в строках " + i);
            }
        }

    }


    public static void task2_12(Integer array[][]) {
        System.out.println("cортировка строк по возрастанию");
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
            System.out.println(Arrays.toString(array[i]));
        }
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i], Collections.reverseOrder());
            System.out.println(Arrays.toString(array[i]));
        }

    }

    public static void task2_13(Integer array[][]) {
        System.out.println("11 cортировка стобцов массива");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        for (int sizeArray = 0; sizeArray < array.length; sizeArray++) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i < array[i].length - 1 && array[i][j] < array[i + 1][j]) {
                        int tempNumber = array[i][j];
                        array[i][j] = array[i + 1][j];
                        array[i + 1][j] = tempNumber;
                    }
                }
            }
        }
        System.out.println("результат сортировки по уьыванию: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        for (int sizeArray = 0; sizeArray < array.length; sizeArray++) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {

                    if (i < array[i].length - 1 && array[i][j] > array[i + 1][j]) {
                        int tempNumber = array[i][j];
                        array[i][j] = array[i + 1][j];
                        array[i + 1][j] = tempNumber;
                    }
                }
            }
        }
        System.out.println("результат сортировки по возрастанию: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
//Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно
// * номеру столбца.

    static void task2_14() {
        int sizeM = (int) (Math.random() * 10);
        int counter = sizeM - 1;
        int[][] array = new int[sizeM][sizeM];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j >= counter) {
                    array[i][j] = 1;
                }
            }
            counter--;
        }
        System.out.println("заполнение нулями и единицами:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    //Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
    static void task2_15(Integer[][]array) {
        int maxNumber=array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]>maxNumber){
                    maxNumber=array[i][j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]%2!=0){
                    array[i][j]=maxNumber;
                }
            }
        }
        System.out.println("15. результат замены нечетных на максимальное значение: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

}
