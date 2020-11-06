package module.fourth.task5;

public class Main {
    public static void main(String[] args) {
        Counter defaultCounter = new Counter();
        Counter bigCounter = new Counter(0, 0, 100);
        bigCounter.increment();
        bigCounter.increment();
        bigCounter.increment();
        System.out.println(bigCounter.getNumber());
        bigCounter.decrement();
        bigCounter.decrement();
        System.out.println(bigCounter.getNumber());

    }
}
