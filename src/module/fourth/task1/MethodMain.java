package module.fourth.task1;

public class MethodMain {

    public static void main(String[] args) {
        Test1 test = new Test1(10, 20);
        test.printToConsole();
        System.out.println(test.sumOfNumber());
        System.out.println(test.maxNumber());

        Test1 test2 = new Test1();
        test2.printToConsole();
        System.out.println(test2.sumOfNumber());
        System.out.println(test2.maxNumber());

        Test1 test3 = new Test1();
        test3.setNumberOne(100);
        test3.setNumberTwo(200);
        test3.printToConsole();
        System.out.println(test3.sumOfNumber());
        System.out.println(test3.maxNumber());




    }
}
