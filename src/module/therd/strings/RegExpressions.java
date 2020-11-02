package module.therd.strings;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Каждое решение можно оформить отдельным проектом.
 * <p>
 * <p>
 * <p>
 * 1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три
 * различных операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова
 * по длине; отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае
 * равенства – по алфавиту.
 * <p>
 * <p>
 * <p>
 * 2.  Дана строка, содержащая следующий текст (xml-документ):
 * <notes>
 *
 * <note id = "1">
 *
 * <to>Вася</to>
 *
 * <from>Света</from>
 *
 * <heading>Напоминание</heading>
 *
 * <body>Позвони мне завтра!</body>
 *
 * </note>
 *
 * <note id = "2">
 *
 * <to>Петя</to>
 *
 * <from>Маша</from>
 *
 * <heading>Важное напоминание</heading>
 * <p>
 * <body/>
 *
 * </note>
 *
 * </notes>
 * <p>
 * <p>
 * <p>
 * Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
 * <p>
 * <p>
 * Write comment…
 * Result
 */
public class RegExpressions {
    public static void main(String[] args) {


        String text = " Ну что, князь, Генуя и Лукка стали не больше как поместья, поместья фамилии Буонапарте." +
                "Нет, я вам вперед говорю, если вы мне не скажете, что у нас война, если вы позволите себе защищать все " +
                "гадости,   все ужасы этого антихриста (право, я верю, что он антихрист), я вас больше не знаю, вы уже" +
                " не друг мой, вы уже    не мой верный раб, как вы говорите. Ну, здравствуйте, здравствуйте. Я вижу, что" +
                " я вас пугаю, садитесь и рассказывайте.   Так говорила в июле 1805 года известная Анна Павловна Шерер," +
                " фрейлина и приближенная императрицы Марии Федоровны,   встречая важного и чиновного князя Василия," +
                " первым приехавшего на ее вечер. Анна Павловна кашляла несколько дней, у нее был грипп, как она говорила" +
                " , а потому она не дежурила и не выходила из" +
                " дому.    В записочках, разосланных утром с красным лакеем, было написано без различия во всех.    Если у " +
                "вас, граф (или князь), нет в виду ничего лучшего и если перспектива вечера у бедной больной не слишком вас" +
                " пугает, то я буду очень рада видеть вас нынче у себя между 7 и 10 часами.   Аннa Шерер . О, какое жестокое" +
                " нападение! Нисколько не смутясь такой встречей и слабо улыбаясь, вошедший князь с светлым" +
                " выражением хитрого лица, в придворном шитом мундире, чулках, башмаках и звездах.";

        System.out.println("Result paragraf sorting: ");
        sortParagraf(getStringsSentence(text));
        System.out.println("Result, words sorting in sentenses : ");
        sortWordsInSentenses(getStringsSentence(text));
        String sumbol = "а";
        System.out.println("Result leksem sorting in sentenses: ");
        sortLexem(getStringsSentence(text),sumbol);
    }

    static void sortLexem(String[] sentences, String letter) {
        for (int i = 0; i < sentences.length; i++) {
            String[] words = splitSentences(sentences[i]);

            for (int k = words.length - 1; k >= 0; k--) {
                for (int m = 0; m < k; m++) {
                    int countRight = 0;
                    int countLeft = 0;
                    for (int n = 0; n < words[m].length(); n++) {
                        if (String.valueOf(words[m].charAt(n)).compareToIgnoreCase(letter) == 0) {
                            countLeft++;
                        }
                    }
                    for (int n = 0; n < words[m + 1].length(); n++) {
                        if (String.valueOf(words[m + 1].charAt(n)).compareToIgnoreCase(letter) == 0) {
                            countRight++;
                        }
                    }
                    if (countLeft < countRight) {
                        String tmp = words[m];
                        words[m] = words[m + 1];
                        words[m + 1] = tmp;
                    } else if (countLeft == countRight) {
                        String[] forCompare = {words[m], words[m + 1]};
                        Arrays.sort(forCompare);
                        words[m] = forCompare[0];
                        words[m + 1] = forCompare[1];
                    }
                }
            }
            for (String word : words) {
                System.out.print(word + " ");
            }
            System.out.println();

        }


    }

    static void sortWordsInSentenses(String[] sentences) {
        for (int i = 0; i < sentences.length; i++) {
            String[] wordsArray = splitSentences(sentences[i]);

            for (int j = 0; j < wordsArray.length; j++) {
                for (int k = 0; k < wordsArray.length - 1; k++) {
                    if (wordsArray[k].length() > wordsArray[k + 1].length()) {
                        String tmp = wordsArray[k];
                        wordsArray[k] = wordsArray[k + 1];
                        wordsArray[k + 1] = tmp;
                    }
                }
            }
            System.out.println(Arrays.toString(wordsArray).replaceAll("\\[|\\]", ""));

        }
    }

    static void sortParagraf(String[] paragraphs) {
        int[] counterSentences = new int[paragraphs.length];
        int maxLengthParagraph = 0;
        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = splitSentences(paragraphs[i]);
            counterSentences[i] = sentences.length;
            if (maxLengthParagraph < sentences.length) {
                maxLengthParagraph = sentences.length;
            }
        }
        for (int i = 1; i <= maxLengthParagraph; i++) {
            for (int j = 0; j < counterSentences.length; j++) {
                if (i == counterSentences[j]) {
                    System.out.println(paragraphs[j]);
                }
            }
        }
        System.out.println();
    }

    // @org.jetbrains.annotations.NotNull
    static String[] getStringsSentence(String str) {
        String[] paragraphs = str.split("\\s*(\\?|!|\\.)\\s*");
        for (int i = 0; i < paragraphs.length; i++) {
            paragraphs[i] = paragraphs[i].trim();
        }
        return paragraphs;
    }

    private static String[] splitSentences(String sentences) {
        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:|\")\\s*");
        String[] str = pattern.split(sentences);

        return str;
    }


}