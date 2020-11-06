package module.fourth.eight;

public class Customer implements Comparable<Customer>{
    private int id;
    private String name;
    private String surname;
    private String address;
    private int cardNumber;
    private int depositNumber;

    public Customer(final int id, final String name, final String surname, final String address, final int cardNumber, final int depositNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.cardNumber = cardNumber;
        this.depositNumber = depositNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(final int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(final int depositNumber) {
        this.depositNumber = depositNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber=" + cardNumber +
                ", depositNumber=" + depositNumber +
                '}';
    }

    @Override
    public int compareTo(final Customer anotherCustomer) {
        return getName().compareTo(anotherCustomer.getName());
    }
}
