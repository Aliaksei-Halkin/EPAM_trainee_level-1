package module.fifth.task5a;

public interface Builder {
    void reset();
    void addFlower(Flower flower);
    void addPackaging(Packaging packaging);
    FlowerArrangement build();
}
