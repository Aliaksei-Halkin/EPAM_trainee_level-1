package module.fourth.task4;


import java.util.Comparator;


/**
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
 * по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения
 * должны быть упорядочены по времени отправления.
 */
public class Train {

    private String destination;
    private int numberOfTrain;
    private String timeDeparture;
    //static SimpleDateFormat formater = new SimpleDateFormat("HH:mm");

    public Train(String destination, int numberOfTrain, String timeDeparture) {
        this.destination = destination;
        this.numberOfTrain = numberOfTrain;
        this.timeDeparture = timeDeparture;
    }


    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", numberOfTrain=" + numberOfTrain +
                ", timeDeparture=" + timeDeparture +
                '}';
    }

    public int getNumberOfTrain() {
        return numberOfTrain;
    }

    public String getDestination() {
        return destination;
    }

    public String getTimeDeparture() {
        return timeDeparture;
    }

    public static class ByNumberComparator implements Comparator<Train> {

        public int compare(Train left, Train right) {
            return left.numberOfTrain - right.numberOfTrain;
        }
    }
    public static class ByDestinationAndTimeComparator implements Comparator < Train > {
        @Override
        public int compare(Train left, Train right) {
            if (left.destination == right.destination)
                return left.timeDeparture.compareTo(right.timeDeparture);
            return left.destination.compareTo(right.destination);
        }
    }


}