package module.fifth.task1v2;


import java.io.FileWriter;
import java.io.IOException;

public class TextFile {
    private File file;
    private Directory directory;

    public TextFile() {
    }

    public TextFile(File file, Directory directory) {
        this.file = file;
        this.directory = directory;
    }


    public void addTextToFile(String text) {
        this.file.addText(text);
    }

    @Override
    public String toString() {
        return " " + file;
    }

    public void printToConsole() {
        System.out.println(toString());
    }

    public void deleteText() {
        file.setText("");
    }

    public void rename(String nameNew) {
        String[] words = directory.getDirectory().split("/");
        words[words.length - 1] = nameNew;
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : words) {
            stringBuilder.append(str+"/");
        }
        directory.setDirectory(stringBuilder.toString());
    }
    public void createFisicalFile(){

           File file1 = new  File(directory.getDirectory());
            try (FileWriter writer = new FileWriter(directory.getDirectory(),true)) {
                writer.write(file.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
