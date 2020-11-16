package module.fourth.task15;

public class RunMain {


    public static void main(String[] args) {
        Client ivanov = new Client("Ivanov", "Alex", "PP2552155", 800.50);
        TourOperator tezTour = new TourOperator("TEZ Tour");

        tezTour.addTouristVaucherList(new TouristVaucher("Spain", "Barcelona", TourType.CRUISE,
                Transport.SHIP, Food.BREAKFAST, 12, 1099.99));
        tezTour.addTouristVaucherList(new TouristVaucher("Spain", "Salou", TourType.RECREATION,
                Transport.PLANE, Food.ALL_INCLUSIVE, 14, 1699.89));
        tezTour.addTouristVaucherList(new TouristVaucher("Spain", "Madrid", TourType.EXCURSION,
                Transport.BUS, Food.NOT_INCLUSIVE, 5, 400.10));
        tezTour.addTouristVaucherList(new TouristVaucher("Spain", "Malaga", TourType.RECREATION,
                Transport.PLANE, Food.BREAKFAST, 15, 1400.20));
        tezTour.addTouristVaucherList(new TouristVaucher("Spain", "Barcelona", TourType.TREATMENT,
                Transport.BUS, Food.ALL_INCLUSIVE, 8, 500.80));
        tezTour.addTouristVaucherList(new TouristVaucher("Poland", "Krakow", TourType.EXCURSION,
                Transport.BUS, Food.ALL_INCLUSIVE, 10, 800.10));
        tezTour.addTouristVaucherList(new TouristVaucher("Italy", "Rome", TourType.EXCURSION,
                Transport.PLANE, Food.ALL_INCLUSIVE, 10, 950.36));
        tezTour.addTouristVaucherList(new TouristVaucher("Italy", "Venice", TourType.CRUISE,
                Transport.SHIP, Food.BREAKFAST, 20, 1099.91));
        tezTour.addTouristVaucherList(new TouristVaucher("Italy", "Milan", TourType.SHOPPING,
                Transport.PLANE, Food.BREAKFAST, 3, 399.99));
        tezTour.addTouristVaucherList(new TouristVaucher("Italy", "Florence", TourType.TREATMENT,
                Transport.TRAIN, Food.ALL_INCLUSIVE, 13, 1099.11));
        tezTour.addTouristVaucherList(new TouristVaucher("Italy", "Rome", TourType.SHOPPING,
                Transport.CAR, Food.NOT_INCLUSIVE, 5, 599.50));

        tezTour.sortByPrice();
        tezTour.printToStringWithCash(ivanov.getCash());
        tezTour.printCashTransportFoodDays(ivanov.getCash(), Transport.BUS, Food.ALL_INCLUSIVE, 10);


    }

}