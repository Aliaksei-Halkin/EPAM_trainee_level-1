package module.fourth.task15;

public class Client {
    private final String surname;
    private final String name;
    private final String passportId;
    private double cash;

    public Client(String surname, String name, String passportId, double cash) {
        this.surname = surname;
        this.name = name;
        this.passportId = passportId;
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }
}
