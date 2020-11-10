package module.fourth.task8;

import java.util.Arrays;

public class CustomerService {
    public Customer[] sortAlpabetically(Customer[] customers) {
        Customer[] sortedCustomers = Arrays.copyOf(customers, customers.length);
        Arrays.sort(sortedCustomers);
        return sortedCustomers;
    }

    public Customer[] findCardInInterval(Customer[] customers, int from, int to) {
        //создаем новый массив и пихаем в него только тех кастомеров из изначального массива, у которых номер карточки подпает
        // Customer[] sortedCustomers2 = Arrays.copyOf(customers, customers.length);
        int lengthOfArr=countlengthOfArray(customers,from,to) ;
        Customer[] sortedCustomers2 = new Customer[lengthOfArr];
        int counter = 0;
        for (int i = 0; i < customers.length; i++) {
            if (cardInInterval(customers[i], from, to) == true) {
                sortedCustomers2[counter] = customers[i];
                counter++;
            }
        }

        return sortedCustomers2;
    }

    private boolean cardInInterval(Customer customer, int from, int to) {
        int cardNumber = customer.getCardNumber();
        return cardNumber >= from && cardNumber <= to;
    }

    public int countlengthOfArray(Customer[] customer, int from, int to) {
        int counter = 0;
        for (int i = 0; i < customer.length; i++) {
            int cardNumber = customer[i].getCardNumber();
            if (cardNumber >= from && cardNumber <= to) {
                counter++;
            }
        }
       return counter;

    }

}
