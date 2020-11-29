package module.fifth.task5a;


public class Flower {
    private FlowerName name;
    private int length;
    private Color color;

    public Flower(FlowerName name, int length, Color color) {
        this.name = name;
        this.length = checkLength(length);
        this.color = color;
    }

    private int checkLength(final int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Lenght must be > 0");
        }
        return length;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "nameOfFlowers=" + name +
                ", length=" + length +
                ", colors=" + color +
                '}';
    }
}
