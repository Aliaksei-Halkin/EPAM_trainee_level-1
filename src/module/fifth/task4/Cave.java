package module.fifth.task4;

import java.util.ArrayList;
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
            List<Riches> sortedRiches = sortOnTotalValue(this.riches);
            System.out.println(sortedRiches.get(sortedRiches.size() - 1));
        }
    }

    private List<Riches> sortOnTotalValue(final List<Riches> riches) {
        List<Riches> sortedRiches = new ArrayList<>(riches);
        sortedRiches.sort(new Comparator<Riches>() {
            @Override
            public int compare(Riches o1, Riches o2) {
                return Double.compare(o1.getTotalValue(), o2.getTotalValue());
            }
        });
        return sortedRiches;
    }

    public void choiceOnTheAmount(double amount) {
        if (!riches.isEmpty()) {
            List<Riches> sortedRiches = sortOnTotalValue(this.riches);
            if (amount < sumTotalValue()) {
                int counterOfBoxes = 0;
                System.out.println("Получи: " + amount / Riches.PRICE_PER_KILO + "килограмм золота: ");
                for (Riches rh : sortedRiches) {
                    if (amount > rh.getTotalValue()) {
                        amount -= rh.getTotalValue();
                        System.out.println(rh.toString());
                        counterOfBoxes++;
                    } else if (amount != 0 && amount < rh.getTotalValue()) {
                        System.out.println(" и еще  часть из артефакта " + rh.getTitleOfRiches() + " на остаток денег ");
                        rh.setWeight(rh.getWeight() - (amount / Riches.PRICE_PER_KILO));
                        amount = 0;
                    }
                }
                removeRiches(counterOfBoxes);
            } else {
                System.out.println("Столько нет сокровищ");
            }
        } else {
            System.out.println("Нет сокровищ");
        }
    }

    private void removeRiches(int num) {
        if (num > 0) {
            riches.subList(0, num + 1).clear();
        }
    }

    public double sumTotalValue() {
        double totalValue = 0;
        for (Riches rh : riches) {
            totalValue += rh.getTotalValue();
        }
        return totalValue;
    }


}
