package module.fourth.task8;


/**
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * <p>
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * <p>
 * Найти и вывести:
 * <p>
 * a) список покупателей в алфавитном порядке;
 * <p>
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class Main {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        Customer[] customers = {
                new Customer(1, "Vasya", "Sokolov", "Neavisimosti,17", 1234, 567825),
                new Customer(6, "Nick", "Pettrov", "Neavisimosti,18", 34324, 534234),
                new Customer(3, "Sveta", "Sidorov", "Neavisimosti,19", 82324, 434234),
                new Customer(4, "Julia", "Sidorov", "Neavisimosti,11", 54324, 334234),
                new Customer(5, "Vasya", "Volkov", "Neavisimosti,7", 34394, 234234),
                new Customer(2, "Alex", "Volkov", "Neavisimosti,1", 14329, 134234),
                new Customer(7, "Lev", "Volkov", "Neavisimosti,10", 24324, 934234),
                new Customer(8, "Kiluia", "Volkov", "Neavisimosti,27", 94357, 84234),
                new Customer(9, "Nadia", "Volkov", "Neavisimosti,177", 34377, 234234)
        };
        System.out.println("Сортировка по имени:");
        print(service.sortAlpabetically(customers));
        System.out.println("Сортировка по номерам карт:");
        print(service.findCardInInterval(customers, 14329, 60000));
    }

    static void print(Customer[] customers) {
       try {
           for (Customer customer : customers) {
               System.out.println(customer.toString());
           }

       }catch (NullPointerException e){
           e.printStackTrace();
       }
    }
}
