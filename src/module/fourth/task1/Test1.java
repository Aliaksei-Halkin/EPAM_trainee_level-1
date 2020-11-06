package module.fourth.task1;

public class Test1 {
    private int numberOne;
    private int numberTwo;

    {
        numberOne = 1;
        numberTwo = 2;
    }

    Test1() {
        this.numberTwo = 3;
        this.numberOne = 4;
    }

    Test1(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }
}

