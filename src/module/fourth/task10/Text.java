package module.fourth.task10;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
 * вывести на консоль текст, заголовок текста.
 */
public class Text {
    private List<Sentence> sentences = new ArrayList<>();

    public Text() {
    }

    public Text(final List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void append(Sentence sentence) {
        sentences.add(sentence);
    }

    public String getHeader() {
        return sentences == null ? "" : sentences.get(0).toString();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Sentence sentence : sentences) {
            builder.append(sentence);
            builder.append(". ");
        }
        return builder.toString();
    }
}
