package module.fifth;

import java.io.*;

public class TextFile {
    private Directory dir;
    private File1 text;

    public TextFile() {
    }

    public TextFile(Directory dir, File1 text) {

        this.dir = dir;
        this.text = text;
    }


    public Directory getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = new Directory(dir);
    }

    public File1 getText() {
        return text;
    }



    public void createFile() {
        File file = new File(getDir().directory);
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(getText().text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void rename(String name) {

        File file = new File(getDir().directory);
        File secondFile = new File(name);
        file.renameTo(secondFile);
        setDir(name);
    }

    public void printToConsole() {
        try (FileReader reader = new FileReader(getDir().directory);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            bufferedReader.lines().forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void addTextToFile(String addText) {
        try (FileWriter writer = new FileWriter(getDir().directory, true)) {
            writer.write(addText);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void fileDelete() {
            File file = new File(getDir().directory);
            file.delete();
    }
}
