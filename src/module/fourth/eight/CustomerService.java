package module.fourth.eight;

import java.util.Arrays;

public class CustomerService {
    public Customer[] sortAlpabetically(Customer[] customers) {
        Customer[] sortedCustomers = Arrays.copyOf(customers, customers.length);
        Arrays.sort(sortedCustomers);
        return sortedCustomers;
    }

    public Customer[] findCardInInterval(Customer[] customers, int from, int to) {
        //создаем новый массив и пихаем в него только тех кастомеров из изначального массива, у которых номер карточки подпает

    }

    private boolean cardInInterval(Customer customer, int from, int to) {
        int cardNumber = customer.getCardNumber();
        return cardNumber >= from && cardNumber <= to;
    }
}
