package module.fifth.task5a;

public class Flower {
    private NameOfFlowers nameOfFlowers;
    private int length;
    private Colors colors;

    public Flower(NameOfFlowers nameOfFlowers, int length, Colors colors) {
        this.nameOfFlowers = nameOfFlowers;
        this.length = length;
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "nameOfFlowers=" + nameOfFlowers +
                ", length=" + length +
                ", colors=" + colors +
                '}';
    }
}
