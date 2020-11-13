package module.fourth.task10;

import java.util.ArrayList;
import java.util.Arrays;

public class RunMain {
    public static void main(String[] args) {
        Text text = new Text();
        text.append(
                new Sentence(
                        Arrays.asList(
                                new Word("Hello"),
                                new Word("World")
                        )
                )
        );
        System.out.println(text);

    }
}
