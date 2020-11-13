package module.fourth.task12;

public enum Engine {
    PETROLEUM(1.8,120, 80, "petroleum"),
    GAS(2.5,100, 88, "gas"),
    DISEL(2.2,70, 75, "diesel");

    private double volume;
    private int power;
    private int efficiently;
    private String fuelType;

    Engine(double volume, int power, int efficiently, String fuelType) {
        this.volume = volume;
        this.power = power;
        this.efficiently = efficiently;
        this.fuelType = fuelType;
    }
}
