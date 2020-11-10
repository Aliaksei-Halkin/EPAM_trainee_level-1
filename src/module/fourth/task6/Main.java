package module.fourth.task6;


public class Main {
    public static void main(String[] args) {
        Time time=new Time(2,25,45);
        System.out.println(time.toString());
        time.setHours(25);
        System.out.println(time.toString());
        time.changeSeconds(43200);
        System.out.println(time.toString());

    }
}
