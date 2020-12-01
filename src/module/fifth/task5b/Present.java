package module.fifth.task5b;

import java.util.ArrayList;
import java.util.List;

public class Present {
    private Packaging packaging;
    private List<TypesOfCandy> types = new ArrayList<>();

    private double weight;

    public Present() {
    }

    public Present(Packaging packaging, double weight) {
        this.packaging = packaging;
        this.weight = weight;

    }

    void setPackaging(Packaging packaging) {
        this.packaging = packaging;
    }

    void addCandy(TypesOfCandy typesOfCandy) {
        types.add(typesOfCandy);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Present{" +
                "packaging=" + packaging +
                ", types=" + types +
                ", weight=" + weight +
                '}';
    }
}
