package module.fifth.task4;

import java.util.List;

public class Riches {
    private String titleOfRiches;
    private String content;
    private double weight;
    private double value;
    private double totalValue;


    public Riches(String titleOfRiches, String content, double weight, double value) {
        this.titleOfRiches = titleOfRiches;
        this.content = content;
        this.weight = weight;
        this.value = value;
        this.totalValue = weight * value;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public String getTitleOfRiches() {
        return titleOfRiches;
    }

    public String getContent() {
        return content;
    }

    public double getWeight() {
        return weight;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "titleOfRiches='" + titleOfRiches + '\'' +
                ", content='" + content + '\'' +
                ", weight=" + weight +
                ", value=" + value +
                ", totalValue=" + totalValue;
    }
}
