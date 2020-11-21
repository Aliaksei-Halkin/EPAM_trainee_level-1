package module.fourth.task12;

import java.util.Arrays;

public class RunMain {
    public static void main(String[] args) {
        Car citroenC5 = new Car("citroenC5");
        System.out.println("We created car " + citroenC5.getModelCar());

        citroenC5.setWheels(
                new Wheel("R18", 185, 65, "winter"),
                new Wheel("R18", 185, 65, "winter"),
                new Wheel("R18", 185, 65, "winter"),
                new Wheel("R18", 185, 65, "winter")
        );
        citroenC5.setEngine(Engine.PETROLEUM);
        citroenC5.setFuel(10);

        System.out.println("Go on the car " + citroenC5.getModelCar());
        citroenC5.go();

        System.out.println("The car will be fill 100 liters");
        citroenC5.fuelling(100);

        citroenC5.changeTheWheel(5);
        System.out.println(citroenC5);
    }

}
