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
}
