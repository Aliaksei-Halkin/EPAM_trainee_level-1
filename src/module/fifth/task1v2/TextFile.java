package module.fifth.task1v2;


import java.io.FileWriter;
import java.io.IOException;

public class TextFile extends File{

    private static final String TYPE = "txt";
    private String text;

    public TextFile(String name) {
        super(name, TYPE);
    }

    public TextFile(final String name, final String text) {
        super(name, TYPE);
        this.text = text;
    }

    public void addText(String text) {
        this.text += " " + text;
    }

    @Override
    public String toString() {
        return " " + text;
    }

    public void printContentsToConsole() {
        System.out.println(this);
    }

    public void deleteText() {
        this.text = "";
    }

}
