package module.fourth.task5;

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
