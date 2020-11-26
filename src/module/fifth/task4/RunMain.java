package module.fifth.task4;

import java.util.Scanner;

/**
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * • Приложение должно быть объектно-, а не процедурно-ориентированным.
 * • Каждый класс должен иметь отражающее смысл название и информативный состав.
 * • Наследование должно применяться только тогда, когда это имеет смысл.
 * • При кодировании должны быть использованы соглашения об оформлении кода java code convention.
 * • Классы должны быть грамотно разложены по пакетам.
 * • Консольное меню должно быть минимальным.
 * • Для хранения данных можно использовать файлы.
 * Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
 * Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и выбора сокровищ
 * на заданную сумму.
 */
public class RunMain {
    public static void main(String[] args) {
        Cave caveOfDragon = new Cave();
        caveOfDragon.addRiches(new Riches("SmallBox", "diamond", 5, 100));
        caveOfDragon.addRiches(new Riches("SmallBox", "diamond", 7, 100));
        caveOfDragon.addRiches(new Riches("MediumBox", "diamond", 10, 100));
        caveOfDragon.addRiches(new Riches("MediumBox", "diamond", 13, 100));
        caveOfDragon.addRiches(new Riches("BigBox", "diamond", 40, 100));
        caveOfDragon.addRiches(new Riches("SmallBox", "gold", 5, 80));
        caveOfDragon.addRiches(new Riches("SmallBox", "platinum", 7, 120));
        caveOfDragon.addRiches(new Riches("MediumBox", "gold", 10, 80));
        caveOfDragon.addRiches(new Riches("MediumBox", "platinum", 13, 120));
        caveOfDragon.addRiches(new Riches("BigBox", "gold", 40, 80));

        Cave caveOfGnom = new Cave();
        caveOfGnom.addRiches(new Riches("BIGBIGBox", "diamond", 500, 100));

        CaseMenu caseMenu = new CaseMenu(new Scanner(System.in));
        caseMenu.start(caveOfDragon);

    }
}
