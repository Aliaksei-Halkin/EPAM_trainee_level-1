package module.fourth.task12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля.
 */
public class Car {
    private List<Wheel> wheels;
    Engine engine;
    private int fuel;
    private String modelCar;

    public Car(List<Wheel> wheels, Engine engine, int fuel, String modelCar) {
        this.wheels = wheels;
        this.engine = engine;
        this.fuel = fuel;
        this.modelCar = modelCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public Car(String modelCar) {
        this.modelCar = modelCar;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(Wheel w1, Wheel w2, Wheel w3, Wheel w4) {
        this.wheels = new ArrayList<>(Arrays.asList(w1, w2, w3, w4));
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void go() {
        if (checkWheels() && checkEngine() && fuel != 0) {
            System.out.println("The car ready to start");
        } else System.out.println("The car don't ready to start");

    }

    private boolean checkEngine() {
        if (getEngine() != null) {
            return true;
        } else {
            System.out.println("The car don't have engine!");
        }
        return false;
    }

    private boolean checkWheels() {
        int counterWheels = 0;

        for (Wheel wheel : wheels) {
            if (wheel != null) {
                counterWheels++;
            }
        }

        if (counterWheels != 4) {
            System.out.println("The car don't have some wheels");
        }
        boolean equalsTypeOfWhells = true;

        for (int i = 0; i < wheels.size() - 1; i++) {

//проверяю чтобы все колеса были одинаковые, иквелс не работает:
            if (wheels.get(i).equals(wheels.get(i + 1))) {
                equalsTypeOfWhells = false;
            }

            if (!equalsTypeOfWhells) {
                System.out.println("The car has different wheels ");
            }
        }
        return counterWheels == 4 && equalsTypeOfWhells;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels.size() +
                ", engine=" + engine +
                ", fuel=" + fuel +
                '}';
    }

    public void fuelling(int fuel) {
        int maxVolume = 66;
        if (this.fuel + fuel > maxVolume) {
            System.out.printf("the car is filled with %d  liters", (maxVolume - this.fuel));
            this.fuel = maxVolume;
        } else {
            System.out.printf("the car is filled with %d liters", (fuel));
        }
    }

    public void changeTheWheel( int numberOfWheels) {
        if (numberOfWheels != 0 && numberOfWheels <= wheels.size()) {
            this.wheels.set(numberOfWheels, new Wheel("R18", 185, 65, "winter"));
        }
    }
}