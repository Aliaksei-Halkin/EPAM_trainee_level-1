package module.fifth.task5a;

public class FlowerArrangement {
    private Flower flower;
    private Packaging packaging;
    private int quantity;

    public FlowerArrangement(Flower flower, Packaging packaging,int quantity) {
        this.flower = flower;
        this.packaging = packaging;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "FlowerArrangement{" +
                "flower=" + flower +
                ", packaging=" + packaging +
                ", quantity=" + quantity +
                '}';
    }
}
