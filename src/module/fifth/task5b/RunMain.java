package module.fifth.task5b;

import static module.fifth.task5b.Packaging.*;

/**
 * Задача 5.
 * <p>
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * <p>
 * Корректно спроектируйте и реализуйте предметную область задачи.
 * Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
 * Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
 * для проверки корректности переданных данных можно применить регулярные выражения.
 * Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
 * Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
 * Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой подарок).
 * Составляющими целого подарка являются сладости и упаковка.
 */
public class RunMain {
    public static void main(String[] args) {
        Confectioner confectioner = new Confectioner();
        Present vip=confectioner.vipPresent(new PresentBuilder());
        Present managerPresent=confectioner.presentForManagers(new PresentBuilder());

        PresentBuilder basicPresent=new PresentBuilder();
        basicPresent.reset();
        basicPresent.addPackaging(SMALL_PAPER_BOX);
        for (int i=0;i<30;i++){
            basicPresent.addCandy(TypesOfCandy.CHOCOLATE);
            basicPresent.addCandy(TypesOfCandy.CARAMEL);
            basicPresent.addCandy(TypesOfCandy.JELLY);
            basicPresent.addCandy(TypesOfCandy.WAFFLE);
        }
        basicPresent.setWeight(1);
        basicPresent.build();

        System.out.println(vip);
        System.out.println(basicPresent);
    }
}
