package module.fourth.task1;

public class Action {

    void printToConsole(int num1, int num2) {
        System.out.printf("Number one: %3d Number two: %3d\n", num1, num2);
    }

    void replaceNumbers(int num1, int num2) {
        int tempNumber = num1;
        num1 = num2;
        num2 = tempNumber;
        printToConsole(num1, num2);
    }

    void sumOfNumber(int num1, int num2) {
        System.out.println("Result sum of numbers: " + num1 + num2);
    }

    void maxNumber(int num1, int num2) {
        int maxNum = num1 > num2 ? num1 : num2;
        System.out.println("Max number is "+maxNum);
    }

}

