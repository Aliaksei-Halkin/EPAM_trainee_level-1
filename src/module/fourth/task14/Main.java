package module.fourth.task14;

public class Main {

    public static void main(String[] args) {
        Client ivanovP;
        ivanovP = new Client("Ivanov", "Pavel", "MP2564854", "25Df25525DF22544", 1);

        Account account1 = new Account(1, 0, Currency.USD);
        Account account2 = new Account(2, 100, Currency.EUR);
        Account account3 = new Account(3, 10, Currency.EUR);
        Account account4 = new Account(4, -10, Currency.USD);
        Account account5 = new Account(5, 1000, Currency.EUR);
        Account account6 = new Account(6, -5, Currency.USD);


        ivanovP.setAccount(account1);
        account1.addValueAccount(200);

        ivanovP.setAccount(account2);
        account2.addValueAccount(-500);

        ivanovP.setAccount(account3);
        account3.addValueAccount(500);

        ivanovP.setAccount(account4);
        account4.addValueAccount(1000);
        ivanovP.setAccount(account5);
        ivanovP.setAccount(account6);


        ivanovP.getSumValue();
        ivanovP.getSumValuePositivNegativ();
        ivanovP.searchAccount(Currency.USD);

        ivanovP.blockedAccount();
        account2.addValueAccount(-50000000);
        ivanovP.getSumValue();

       ivanovP.printAccount();
       ivanovP.sortByValueAccount();
       ivanovP.printAccount();


    }
}
