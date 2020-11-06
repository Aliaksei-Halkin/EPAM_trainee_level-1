package module.fourth.eight;

public class Main {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        Customer[] customers = {
            new Customer(1, "Vasya", "Petya", "Vova", 1234, 5678),
            new Customer(2, "Vasya", "Petya", "Vova", 34324, 234234)
        };
        System.out.println(service.sortAlpabetically(customers));

    }
}
