package module.fifth.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Сave {
    private List<Riches> riches = new ArrayList<>();

    public Сave() {

    }

    protected void addRiches(Riches riches) {
        this.riches.add(riches);
    }

    public List<Riches> getRiches() {
        return riches;
    }

    public void viewRiches() {
        for (Riches riche : riches) {
            System.out.println(riche);
        }
    }


}
