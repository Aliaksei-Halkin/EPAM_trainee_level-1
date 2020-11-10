package module.fourth.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Train[] trains = new Train[5];
        trains[0] = new Train("Kiev", 2545,  "14:10");
        trains[1] = new Train("Brest", 25482,  "17:40");
        trains[2] = new Train("Moskow", 245,  "07:10");
        trains[3] = new Train("Mogilev", 6772,  "07:10");
        trains[4] = new Train("Kiev", 7721,  "00:10");
        Arrays.sort(trains, new Train.ByNumberComparator());


        getTrainNumber(trains);
        sortDistination(trains);

    }

    private static void getTrainNumber(Train[] trains) {
        System.out.println("Введите номер поезда: ");
        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();

        for (Train train : trains) {
            if (choise == train.getNumberOfTrain())
                System.out.println(train.getNumberOfTrain() + "  " + train.getDestination() + " " + train.getTimeDeparture());
        }
    }

    static void sortDistination(Train[] trains) {
        Arrays.sort(trains, new Train.ByDestinationAndTimeComparator());
        for (Train train : trains) {
            System.out.println(train.getNumberOfTrain() + "  " + train.getDestination() + " " + train.getTimeDeparture());
        }
    }


}
