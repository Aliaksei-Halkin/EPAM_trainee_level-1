package module.fifth.task1v2;

/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */
public class RunMain {
    public static void main(String[] args) {
        Directory directory = new Directory("root");
        TextFile textFile = new TextFile("first", "Сегодня 108-й день протестов. Ночью забастовавшего рабочего «Беларуськалия» Александра Клезовича " +
                "вывезла с территории шахты машина скорой помощи. Утром Александр Лукашенко принял верительные грамоты" +
                " от новых послов иностранных государств. В течение дня ожидаются суды над демонстрантами, которых" +
                " задержали в выходные. Тем временем журналисты TUT.BY Катерина Борисевич и Александра Квиткевич" +
                " продолжают оставаться за решеткой.");
        directory.addChild(textFile);
        directory.addChild(new Directory("inner directory"));

        textFile.addText("Средняя зарплата в октябре в целом по стране составила 1285 рублей, сообщает Белстат.");
        textFile.rename("text1v2");

        textFile.printContentsToConsole();
        directory.printContentsToConsole();
    }
}
