package module.fifth.task4;


public class Riches {

    public static final int PRICE_PER_KILO = 100;

    private final String titleOfRiches;
    private final String content;
    private double weight;

    public Riches(String titleOfRiches, String content, double weight) {
        this.titleOfRiches = titleOfRiches;
        this.content = content;
        this.weight = weight;
    }

    public double getTotalValue() {
        return weight * PRICE_PER_KILO;
    }

    public String getTitleOfRiches() {
        return titleOfRiches;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return titleOfRiches + '\'' +
                ", content='" + content + '\'' +
                ", weight=" + weight +
                ", totalValue=" + getTotalValue();
    }
}
