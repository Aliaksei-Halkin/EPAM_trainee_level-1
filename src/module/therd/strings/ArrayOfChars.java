package module.therd.strings;

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
        //1.1
        String[] camelCase = new String[]{"HelloWorld", "SeeALotOfCamel", "CamelAnywhereAndAnything", "CoodbuyCamel"};

        System.out.println(Arrays.toString(camelCase));
        System.out.println(Arrays.toString(runTask1_1(camelCase)));
        //1.2
        String str = "word  camelword  camel word  camelwordword  camel  ";
        String str2 = str.replaceAll("word", "letter");
        System.out.println(str2);
        //1.3
        String stringForTask3 = "1234f5f6f78f9fds0vb1e2asf3sf4sf5sf6sc7sf8xdsg9c0";
        System.out.println("1.3 The Result, quantity of numbers is " + runTask1_3(stringForTask3));
        //1.4
        System.out.println("1.4 The Result, quantity of numbers is " + runTask1_4(stringForTask3));
        //1.15
        String str5 = "  Hello world      Hello    world    Hello   world  Hello  world  Hello world ";
        str5 = str5.strip();
        System.out.println(str5);
        System.out.println("1.5 The Result string " + runTask1_5(str5));

    }

    static String[] runTask1_1(String[] array) {
        for (int i = 0; i < array.length; i++) {
            StringBuilder strBuilder = new StringBuilder();
            for (int j = 0; j < array[i].length(); j++) {
                char letter = array[i].toCharArray()[j];
                if (Character.isLowerCase(letter)) {
                    strBuilder.append(letter);
                } else {
                    if (j != 0) {
                        strBuilder.append("_");
                    }
                    strBuilder.append(Character.toLowerCase(letter));
                }
            }
            array[i] = strBuilder.toString();
        }

        return array;
    }

    static int runTask1_3(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            char num = str.charAt(i);
            if (Character.isDigit(num)) {
                counter++;
            }
        }
        return counter;
    }

    static int runTask1_4(String str) {
        int counter = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            char num = str.charAt(i);
            char num2 = str.charAt(i + 1);

            if (Character.isDigit(num) && !Character.isDigit(num2)) {
                counter++;
            }
        }
        return counter;
    }

    static String runTask1_5(String str) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            char letter = str.charAt(i);
            char letter2 = str.charAt(i + 1);
            if (letter != ' ') {
                strBuilder.append(letter);
            } else if (letter2 != ' ') {
                strBuilder.append(letter);
            }
        }
        return strBuilder.toString();
    }

}
