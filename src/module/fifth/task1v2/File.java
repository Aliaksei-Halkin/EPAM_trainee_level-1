package module.fifth.task1v2;

public class File {
    private String text;

    public File() {
    }

    public File(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void addText(String words) {
        StringBuilder stringBuilder = new StringBuilder(this.text);
        stringBuilder.append(" ");
        stringBuilder.append(words);
        text = stringBuilder.toString();
    }

    @Override
    public String toString() {
        return " " + text + '\'';
    }
}
