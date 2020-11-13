package module.fourth.task11;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Word> words = new ArrayList<>();

    public Sentence() {
    }

    public Sentence(final List<Word> words) {
        this.words = words;
    }

    public List<Word> getWords() {
        return words;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Word word : words) {
            builder.append(word);
            builder.append(" ");
        }
        return builder.toString();
    }
}
