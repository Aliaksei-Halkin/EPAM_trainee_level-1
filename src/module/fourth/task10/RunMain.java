package module.fourth.task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class RunMain {
    public static void main(String[] args) {

        Word word=new Word("hello");
        Sentences sentences = new Sentences(word);
        Text text=new Text(sentences);
        ArrayList <String> text1 = new ArrayList<String>();
        text1.add(sentences.toString());
        for (String tex: text1) {
            System.out.println(tex);
        }
    }
}
