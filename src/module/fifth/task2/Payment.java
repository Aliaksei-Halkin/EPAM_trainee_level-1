package module.fifth.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать
 * покупку из нескольких товаров.
 */
public class Payment {
    int cash;
    int id;
    List<Order> order=new ArrayList<>();;

    public Payment() {
    }

    public Payment(int cash, int id, List<Order> order) {
        this.cash = cash;
        this.id = id;
        this.order = order;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public class Order {
        double weight;
        double value;

        public Order() {
        }

        public Order(double weight, double value) {
            this.weight = weight;
            this.value = value;
        }
    }

    @Override
    public String toString() {
        return "Payment{" +
                "cash=" + cash +
                ", id=" + id +
                ", order=" + order +
                '}';
    }


}
