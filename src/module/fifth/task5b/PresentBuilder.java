package module.fifth.task5b;

public class PresentBuilder implements Builder {
    Present present = new Present();

    @Override
    public void reset() {
        present = new Present();
    }
    @Override
    public void addCandy(TypesOfCandy typesOfCandy) {
        present.addCandy(typesOfCandy);
    }

    @Override
    public void addPackaging(final Packaging packaging) {
        present.setPackaging(packaging);
    }

    @Override
    public void setWeight(double weight) {
        present.setWeight(weight);
    }

    @Override
    public Present build() {
        return present;
    }

    @Override
    public String toString() {
        return "PresentBuilder{" +
                "present=" + present +
                '}';
    }
}
