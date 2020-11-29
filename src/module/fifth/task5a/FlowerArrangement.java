package module.fifth.task5a;

import java.util.ArrayList;
import java.util.List;

public class FlowerArrangement {
    private List<Flower> flowers;
    private Packaging packaging;

    public FlowerArrangement() {
        flowers = new ArrayList<>();
    }

    public FlowerArrangement(List<Flower> flowers, Packaging packaging) {
        this.flowers = flowers;
        this.packaging = packaging;
    }

    @Override
    public String toString() {
        return "FlowerArrangement{" +
                "flowers=" + flowers +
                ", packaging=" + packaging +
                '}';
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void setPackaging(final Packaging packaging) {
        this.packaging = packaging;
    }
}
