package module.fifth.task1;

/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */
public class RunMain {
    public static void main(String[] args) {
        TextFile textFile = new TextFile(new Directory("data/info1.txt"), new File1("Java"));
        textFile.createFile();

        String nameFile = "data/text.txt";
        textFile.rename(nameFile);
        textFile.printToConsole();
        textFile.addTextToFile("Создать объект класса Текстовый файл, используя классы Файл, Директория.\n" +
                " * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.\n" +
                " */");
        textFile.printToConsole();
       textFile.fileDelete();


    }
}
