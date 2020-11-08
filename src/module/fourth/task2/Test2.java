package module.fourth.task2;

import module.fourth.task1.Test1;

/**
 * Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
 * инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
 * +интересно применить наследование и использовать конструкторы!!!
 */
public class Test2 extends Test1 {
    int numberThree;
    int numberFour;


    public Test2(int numberOne, int numberTwo, int numberThree, int numberFour) {
        super(numberOne, numberTwo);
        this.numberThree = numberThree;
        this.numberFour = numberFour;
    }

    Test2() {
        super();
        numberFour = 4;
        numberThree = 3;
    }

    public void setNumberThree(int numberThree) {
        this.numberThree = numberThree;
    }

    public void setNumberFour(int numberFour) {
        this.numberFour = numberFour;
    }

    public int getNumberThree() {
        return numberThree;
    }

    public int getNumberFour() {
        return numberFour;
    }
   public void printToConsole(){
        super.printToConsole();
       System.out.println(numberThree +"  "+numberFour);
    }
}
