package module.fifth.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать
 * покупку из нескольких товаров.
 */
public class Payment {
    private final PaymentManager manager;
    private List<Item> order=new ArrayList<>();


    public Payment() {
        this.manager = new PaymentManager();
    }

    public List<Item> getOrder() {
        return order;
    }

    public void setOrder(List<Item> order) {
        this.order = order;
    }

    public void checkout(int cash) {
        this.manager.checkout(cash);
    }

    public class PaymentManager {

        public void addItem(Item item) {
            order.add(item);
        }

        public void checkout(int cash) {
            //принимать деньги от юзера
            //выводить список покупок
            //выводить общую стоимость, сколько дали денег, и сколько было сдачи
        }
    }


}
