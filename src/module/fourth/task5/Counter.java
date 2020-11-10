package module.fourth.task5;

/**
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в
 * заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
 * Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
 * Написать код, демонстрирующий все возможности класса.
 */
public class Counter {
    private int number;
    private int minNumber;
    private int maxNumber;

    public Counter(final int number, final int minNumber, final int maxNumber) {
        this.number = number;
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }

    public Counter() {
        this.number = 0;
        this.minNumber = 0;
        this.maxNumber = 10;
    }

    public void increment() {
        if (number + 1 <= maxNumber) {
            ++number;
        }
    }

    public void decrement() {
        if (number - 1 >= minNumber) {
            --number;
        }
    }

    public int getNumber() {
        return number;
    }
}
