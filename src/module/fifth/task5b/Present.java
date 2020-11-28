package module.fifth.task5b;

import java.util.Arrays;

public class Present {
    private Packaging packaging;
    private TypesOfCandy[] types;
    private double weight;

    public Present(Packaging packaging, double weight) {
        this.packaging = packaging;
        this.weight = weight;
        types = TypesOfCandy.values();
    }

    @Override
    public String toString() {
        return "Present{" +
                "packaging=" + packaging +
                ", types=" + Arrays.toString(types) +
                ", weight=" + weight +
                '}';
    }
}
