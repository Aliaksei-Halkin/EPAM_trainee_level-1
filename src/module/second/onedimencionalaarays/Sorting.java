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
    public static void main(String[] args) {
        int[] arrayFirst = new int[10];
        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] = (int) (Math.random() * 100);
        }
        for (int num : arrayFirst) {
            System.out.print(num + "  ");
        }
        int[] arraySecond = new int[]{11, 22, 33, 44, 55};
        task3_1(arrayFirst, arraySecond);
    }

    private static void task3_1(int[] arrayFirst, int[] arraySecond) {
        int[] arrayResult = new int[arrayFirst.length + arraySecond.length];
        int k = 5;
        int counter=0;
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


}
