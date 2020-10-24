package module.second.onedimencionalaarays;

import java.util.Arrays;

/**
 * 1.Заданы два одномерных массива с различным количеством элементов и натуральное число k.
 * Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
 * при этом не используя дополнительный массив.
 * <p>
 * 2. Реализуйте сортировку выбором.
 * <p>
 * 3. Реализуйте сортировку обменами.
 * <p>
 * 4. Реализуйте сортировку вставками.
 * <p>
 * 5. Реализуйте сортировку Шелла.
 */
public class Sorting {
    static int[] arraySecondForTask4 = new int[]{8,15,-4,0,16,-20};
    public static void main(String[] args) {
        int[] arrayFirst = new int[10];

        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] = (int) (Math.random() * 100);
        }
        int[] arraySort1 = Arrays.copyOf(arrayFirst, arrayFirst.length);
        int[] arraySort2 = arrayFirst.clone();
        int[] arraySort3 = arrayFirst.clone();

        for (int num : arrayFirst) {
            System.out.print(num + "  ");
        }
        int[] arraySecond = new int[]{11, 22, 33, 44, 55};
        task3_1(arrayFirst, arraySecond);
        task3_2(arrayFirst);
        task3_3(arraySort1);
        task3_4(arraySort2);
        task3_5(arraySort3);
        System.out.println("5. ИСходный массив " + Arrays.toString(arraySort3));
        System.out.println("Результат сортировки Шелла " +Arrays.toString(task3_5(arraySort3)));

    }

    private static void task3_1(int[] arrayFirst, int[] arraySecond) {
        int[] arrayResult = new int[arrayFirst.length + arraySecond.length];
        int k = 5;
        int counter = 0;
        for (int i = 0; i < arrayResult.length; i++) {
            if (i < k) {
                arrayResult[i] = arrayFirst[i];
            } else if (i >= k && i < k + arraySecond.length) {
                arrayResult[i] = arraySecond[counter];
                counter++;
            } else {
                arrayResult[i] = arrayFirst[i - arraySecond.length];
            }
        }
        System.out.println("\n" + Arrays.toString(arrayResult));
    }

    private static void task3_2(int[] anyArray) {
        System.out.println("2. ИСходный массив " + Arrays.toString(anyArray));
        for (int i = 0; i < anyArray.length; i++) {
            int minNumber = anyArray[i];
            int indexMinNumber = i;
            for (int j = i + 1; j < anyArray.length; j++) {
                if (anyArray[j] < minNumber) {
                    minNumber = anyArray[j];
                    indexMinNumber = j;
                }
            }
            if (i != indexMinNumber) {
                int tempNumber = anyArray[i];
                anyArray[i] = anyArray[indexMinNumber];
                anyArray[indexMinNumber] = tempNumber;
            }
        }
        System.out.println("Результат сортировки выбором " + Arrays.toString(anyArray));

    }

   protected static void task3_3(int[] anyArray) {
        System.out.println("3. ИСходный массив " + Arrays.toString(anyArray));
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < anyArray.length - 1; i++) {
                if (anyArray[i] > anyArray[i + 1]) {
                    int temp = anyArray[i];
                    anyArray[i] = anyArray[i + 1];
                    anyArray[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println("Результат сортировки обмена(пузырьковая) " + Arrays.toString(anyArray));
    }

    static void task3_4(int[] array) {
        System.out.println("4. ИСходный массив " + Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;

        }
        System.out.println("Результат сортировки вставками " + Arrays.toString(array));

    }

    static int[] task3_5(int[] array) {/*IDEA вместо void вставила Int[] таким образом позволило распечать,
        это что значит?*/
        int h = 1;
        while (h < array.length) h = 3 * h + 1;
        while (h > 0) {
            h = h / 3;
            for (int k = 0; k < h; k++) {
                for (int i = h + k; i < array.length; i += h) {
                    int key = array[i];
                    int j = i - h;
                    while (j >= 0 && array[j] > key) {
                        array[j + h] = array[j];
                        j -= h;
                    }
                    array[j + h] = key;
                }
            }
        }
        return array;
    }



}
