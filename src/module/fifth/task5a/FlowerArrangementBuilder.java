package module.fifth.task5a;

public class FlowerArrangementBuilder implements Builder {

    private FlowerArrangement arrangement = new FlowerArrangement();

    @Override
    public void reset() {
        arrangement = new FlowerArrangement();
    }

    @Override
    public void addFlower(final Flower flower) {
        arrangement.addFlower(flower);
    }

    @Override
    public void addPackaging(final Packaging packaging) {
        arrangement.setPackaging(packaging);
    }

    @Override
    public FlowerArrangement build() {
        return arrangement;
    }
}
