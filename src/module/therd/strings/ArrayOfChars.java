package module.therd.strings;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 * <p>
 * 2. Замените в строке все вхождения 'word' на 'letter'.
 * <p>
 * 3. В строке найти количество цифр.
 * <p>
 * 4. В строке найти количество чисел.
 * <p>
 * 5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
 * Крайние пробелы в строке удалить.
 */
public class ArrayOfChars {

    public static void main(String[] args) {
        //1.11
        String[] camelCase = new String[]{"HelloWorld", "SeeALotOfCamel", "CamelAnywhereAndAnything", "CoodbuyCamel"};

        System.out.println(Arrays.toString(camelCase));
        System.out.println(Arrays.toString(runTask1_1(camelCase)));


    }

    static String[] runTask1_1(String[] array) {
        for (int i = 0; i < array.length; i++) {
            StringBuilder strBuilder = new StringBuilder();
            for (int j = 0; j < array[i].length(); j++) {
                char letter = array[i].toCharArray()[j];
                if (Character.isLowerCase(letter)) {
                    strBuilder.append(letter);
                } else {
                    if (j == 0) {
                        strBuilder.append(Character.toLowerCase(letter));
                    } else {
                        strBuilder.append("_");
                        strBuilder.append(Character.toLowerCase(letter));
                    }
                }
            }
            array[i] = strBuilder.toString();
        }

        return array;
    }
}
