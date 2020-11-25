package module.fifth.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать
 * покупку из нескольких товаров.
 */
public class Payment {
    private final PaymentManager manager;
    private List<Item> order = new ArrayList<>();


    public Payment() {
        this.manager = new PaymentManager();
    }

    public List<Item> getOrder() {
        return order;
    }

    public void setOrder(Item product) {
        this.manager.addItem(product);
    }

    public void checkout(int cash) {
        this.manager.checkout(cash);
    }

    public class PaymentManager {

        public void addItem(Item item) {
            order.add(item);
        }

        public void checkout(int cash) {
            double sumValue = 0;
            int counter = 0;
            double sumWeight = 0;

            System.out.println("Your ORDER:");
            for (Item item : order) {
                System.out.println(item);
                sumValue += item.getValue();
                sumWeight += item.getWeight();
                counter++;
            }
//            ListIterator<Item> listIterator = order.listIterator();
//            while ((listIterator.hasNext())) {
//                System.out.println(listIterator.next());
//                counter++;
//            }
//            while ((listIterator.hasNext())) {
//                sumValue += listIterator.next().getValue();//не работает
//            }
//            while ((listIterator.hasNext())) {
//                sumWeight += listIterator.next().getWeight();
//            }
            System.out.println("Total item " +"\t"+ counter + "  Total sum " +"\t"+ sumValue + " ");
            if (cash - sumValue >= 0) {
                System.out.println("Your cash "+"\t" + cash + "\nYour change " + (cash - sumValue));
            } else {
                System.out.println("Exception: not enough money");


                //принимать деньги от юзера
                //выводить список покупок
                //выводить общую стоимость, сколько дали денег, и сколько было сдачи
            }
        }


    }
}