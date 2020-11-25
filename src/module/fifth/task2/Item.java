package module.fifth.task2;

public class Item {

    private String name;
    private double weight;
    private double value;

    public Item(final String name, double weight, double value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return  name + "\t"+
                " weight= " +"\t"+ weight +
                " value= " +"\t"+ value ;

    }
}
