package module.fourth.task14;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Client {
    private final String surname;
    private final String name;
    private final String passportId;
    private final String personalId;
    private final int idClient;
    private List<Account> accounts = new ArrayList<>();

    public Client(String surname, String name, String passportId, String personalId, int idClient) {
        this.surname = surname;
        this.name = name;
        this.passportId = passportId;
        this.personalId = personalId;
        this.idClient = idClient;
    }

    public void setAccount(Account account) {
        if (account.getBlock() == false) {
            accounts.add(account);
        }

    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPassportId() {
        return passportId;
    }

    public int getIdClient() {
        return idClient;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void getSumValue() {
        int sumUsd = 0;
        int sumByn = 0;
        int sumEur = 0;
        int sumRur = 0;
        for (Account account : accounts) {
            if (account.getCurrencyAccount() == Currency.USD) {
                sumUsd += account.getAccountValue();
            }
            if (account.getCurrencyAccount() == Currency.BYN) {
                sumByn += account.getAccountValue();
            }
            if (account.getCurrencyAccount() == Currency.RUR) {
                sumRur += account.getAccountValue();
            }
            if (account.getCurrencyAccount() == Currency.EUR) {
                sumEur += account.getAccountValue();
            }
        }
        if (sumByn != 0) {
            System.out.println("Sum Value in BYN " + sumByn);
        }
        if (sumUsd != 0) {
            System.out.println("Sum Value in USD " + sumUsd);
        }
        if (sumEur != 0) {
            System.out.println("Sum Value in EUR " + sumEur);
        }
        if (sumRur != 0) {
            System.out.println("Sum Value in RUR " + sumRur);
        }
    }

    public void getSumValuePositivNegativ() {
        int sumUsd = 0;
        int sumByn = 0;
        int sumEur = 0;
        int sumRur = 0;
        int sumUsdNeg = 0;
        int sumBynNeg = 0;
        int sumEurNeg = 0;
        int sumRurNeg = 0;


        for (Account account : accounts) {
            if (account.getCurrencyAccount() == Currency.USD && account.getAccountValue() > 0) {
                sumUsd += account.getAccountValue();
            }
            if (account.getCurrencyAccount() == Currency.BYN && account.getAccountValue() > 0) {
                sumByn += account.getAccountValue();
            }
            if (account.getCurrencyAccount() == Currency.RUR && account.getAccountValue() > 0) {
                sumRur += account.getAccountValue();
            }
            if (account.getCurrencyAccount() == Currency.EUR && account.getAccountValue() > 0) {
                sumEur += account.getAccountValue();
            }
        }
        if (sumByn != 0) {
            System.out.println("Sum PositiveValue in BYN " + sumByn);
        }
        if (sumUsd != 0) {
            System.out.println("Sum PositiveValue in USD " + sumUsd);
        }
        if (sumEur != 0) {
            System.out.println("Sum PositiveValue in EUR " + sumEur);
        }
        if (sumRur != 0) {
            System.out.println("Sum PositiveValue in RUR " + sumRur);
        }
        for (Account account : accounts) {
            if (account.getCurrencyAccount() == Currency.USD && account.getAccountValue() < 0) {
                sumUsdNeg += account.getAccountValue();
            }
            if (account.getCurrencyAccount() == Currency.BYN && account.getAccountValue() < 0) {
                sumBynNeg += account.getAccountValue();
            }
            if (account.getCurrencyAccount() == Currency.RUR && account.getAccountValue() < 0) {
                sumRurNeg += account.getAccountValue();
            }
            if (account.getCurrencyAccount() == Currency.EUR && account.getAccountValue() < 0) {
                sumEurNeg += account.getAccountValue();
            }
        }
        if (sumBynNeg != 0) {
            System.out.println("Sum NegativeValue in BYN " + sumBynNeg);
        }
        if (sumUsdNeg != 0) {
            System.out.println("Sum NegativeValue in USD " + sumUsdNeg);
        }
        if (sumEurNeg != 0) {
            System.out.println("Sum NegativeValue in EUR " + sumEurNeg);
        }
        if (sumRurNeg != 0) {
            System.out.println("Sum NegativeValue in RUR " + sumRurNeg);
        }

    }


   public void printAccount(){
        for (Account coun:
             accounts) {
            System.out.println(coun.toString());

        }
    }

    public void searchAccount(Currency currency) {
        for (Account account : accounts
        ) {
            if (currency == account.getCurrencyAccount()) {
                System.out.println(account.toString());
            }

        }
    }

    void blockedAccount() {
        for (Account account : accounts) {
            account.setBlock(true);
        }
        System.out.println("Account is blocked");

    }

    void unBlockedAccount() {
        for (Account account : accounts) {
            account.setBlock(false);

        }
        System.out.println("Account is unblocked");

    }

    void sortByValueAccount() {
        accounts.sort(new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                if (o1.getAccountValue() == o2.getAccountValue()) return 0;
                else if (o1.getAccountValue()> o2.getAccountValue()) return 1;
                else return -1;
            }
        });
    }

}
