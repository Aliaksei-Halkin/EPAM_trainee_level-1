package module.fourth.task1;

public class Test1 {
    private int numberOne;
    private int numberTwo;

    public Test1() {
        this.numberTwo = 3;
        this.numberOne = 4;
    }

    public Test1(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public void printToConsole() {
        System.out.printf("Number one: %3d Number two: %3d\n", numberOne, numberTwo);
    }

    public int sumOfNumber() {
        return numberOne + numberTwo;
    }

    public int maxNumber() {
        return Math.max(numberOne, numberTwo);
    }
}

