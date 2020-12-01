package module.fifth.task5b;

public interface Builder {
    void  reset();
    void addCandy(TypesOfCandy typesOfCandy);
    void addPackaging(Packaging packaging);
    void setWeight(double weight);
    Present build();
}
