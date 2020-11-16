package module.fourth.task15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TourOperator {
    private String name;
    private List<TouristVaucher> touristVaucherList = new ArrayList<>();

    public TourOperator(String name) {
        this.name = name;
    }

    void addTouristVaucherList(TouristVaucher tour) {
        touristVaucherList.add(tour);
    }


    public void printToStringWithCash(double cash) {
        System.out.println("TourOperator" +
                " '" + name + '\'');
        for (TouristVaucher tour : touristVaucherList
        ) {
            if (tour.getCost() < cash) {
                System.out.println(tour.toString());
            }
        }
        System.out.println("");
    }
    public void printCashTransportFoodDays(double cash,Transport transport,Food food,int days) {
        System.out.println("TourOperator" +
                " '" + name + '\'');
        for (TouristVaucher tour : touristVaucherList
        ) {
            if (tour.getCost() < cash&&tour.getTransport()==transport&&tour.getFood()==food&&tour.getNumberOfDays()<=days) {
                System.out.println(tour.toString());
            }
        }
        System.out.println("");
    }
    public void sortByPrice(){
        touristVaucherList.sort(new Comparator<TouristVaucher>() {
            @Override
            public int compare(TouristVaucher o1, TouristVaucher o2) {
                if (o1.getCost()==o2.getCost())
                    return 0;
                else if (o1.getCost()>o2.getCost())
                    return 1;
                else return -1;
            }
        });


    }

}
/* accounts.sort(new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                if (o1.getAccountValue() == o2.getAccountValue()) return 0;
                else if (o1.getAccountValue()> o2.getAccountValue()) return 1;
                else return -1;
            }
        });*/