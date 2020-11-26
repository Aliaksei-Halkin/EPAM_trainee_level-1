package module.fifth.task4;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Cave {
    private List<Riches> riches = new ArrayList<>();

    public Cave() {

    }

    protected void addRiches(Riches riches) {
        this.riches.add(riches);
    }

    public List<Riches> getRiches() {
        return riches;
    }

    public void viewRiches() {
        if (!riches.isEmpty()) {
            for (Riches riche : riches) {
                System.out.println(riche);
            }
        } else {
            System.out.println("Пещера пуста");
        }

    }

    public void expensiveBox() {
        if (!riches.isEmpty()) {
            sortOnTotalValue();
            System.out.println(riches.get(riches.size() - 1));

        }

    }

    private void sortOnTotalValue() {
        riches.sort(new Comparator<Riches>() {
            @Override
            public int compare(Riches o1, Riches o2) {
                if (o1.getTotalValue() == o2.getTotalValue()) return 0;
                else if (o1.getTotalValue() > o2.getTotalValue()) return 1;
                else return -1;
            }
        });
    }

    public void choiseOnTheAmount(double amount) {
        if (!riches.isEmpty()) {
            if (amount < sumTotalValue()) {
                double[][] allRiches = new double[][]{sumGold(),sumDiamond(), sumPlatinum(), };
                System.out.println("итого вес-стоимость-цена за кг"+Arrays.deepToString(allRiches));

                if (amount < allRiches[0][1]) {
                    System.out.println("Получика ты " + amount / allRiches[0][2] + " килограмм золота");

                }else if(amount <allRiches[0][1]+allRiches[1][1]){
                    System.out.print("Получика ты " +  allRiches[0][2] + " килограмм золота");
                    System.out.println(" и "+(amount%allRiches[0][2])/allRiches[1][2]+" килограмм бриллиантов");
                }else {
                    System.out.print("Получика ты " +  allRiches[0][2] + " килограмм золота");
                    System.out.println(" и "+(amount%allRiches[0][2])/allRiches[1][2]+" килограмм бриллиантов");
                    System.out.println(" и "+(amount%allRiches[0][3])/allRiches[1][2]+" килограмм платины");


                }


            } else {
                System.out.println("Столько нет сокровищ");
            }
        }
    }

    public double sumTotalValue() {
        double counter = 0;
        for (Riches rh : riches) {
            counter += rh.getTotalValue();
        }
        return counter;
    }

    public double[] sumGold() {
        double weight = 0;
        double totalValue = 0;
        double valueOfKg = 0;
        double[] items = new double[3];
        for (Riches rh : riches) {
            if (rh.getContent().equalsIgnoreCase("gold")) {
                weight += rh.getWeight();
                totalValue += rh.getTotalValue();
                valueOfKg = rh.getValue();
            }
        }
        items[0] = weight;
        items[1] = totalValue;
        items[2] = valueOfKg;

        return items;
    }

    public double[] sumPlatinum() {
        double weight = 0;
        double totalValue = 0;
        double valueOfKg = 0;
        double[] items = new double[3];
        for (Riches rh : riches) {
            if (rh.getContent().equalsIgnoreCase("platinum")) {
                weight += rh.getWeight();
                totalValue += rh.getTotalValue();
                valueOfKg = rh.getValue();
            }
        }
        items[0] = weight;
        items[1] = totalValue;
        items[2] = valueOfKg;

        return items;
    }

    public double[] sumDiamond() {
        double weight = 0;
        double totalValue = 0;
        double valueOfKg = 0;
        double[] items = new double[3];
        for (Riches rh : riches) {
            if (rh.getContent().equalsIgnoreCase("diamond")) {
                weight += rh.getWeight();
                totalValue += rh.getTotalValue();
                valueOfKg = rh.getValue();
            }
        }
        items[0] = weight;
        items[1] = totalValue;
        items[2] = valueOfKg;

        return items;
    }


}
