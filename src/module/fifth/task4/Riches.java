package module.fifth.task4;


public class Riches {
    private final String titleOfRiches;
    private final String content;
    private double weight;
    private double totalValue;


    public Riches(String titleOfRiches, String content, double weight) {
        this.titleOfRiches = titleOfRiches;
        this.content = content;
        this.weight = weight;
        this.totalValue = weight * 100;
    }

    public double getTotalValue() {
        return totalValue;
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
                ", totalValue=" + totalValue;
    }
}
