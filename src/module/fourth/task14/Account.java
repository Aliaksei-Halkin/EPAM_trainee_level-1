package module.fourth.task14;

/**
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
 * имеющим положительный и отрицательный балансы отдельно.
 */
public class Account {
    private int accountId;
    private double accountValue;
    private Enum currencyAccount;
    private boolean block;

    {
        block = false;
    }

    public Account(int accountId, double accountValue, Enum currencyAccount) {
        this.accountId = accountId;
        this.accountValue = accountValue;
        this.currencyAccount = currencyAccount;
    }

    public void addValueAccount(double value) {
        if (block == false) {
            accountValue += value;
        } else {
            System.out.println("Account is blocked");
        }
    }

    public int getAccountId() {
        return accountId;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    public boolean getBlock() {
        return block;
    }

    public double getAccountValue() {
        return accountValue;
    }

    public Enum getCurrencyAccount() {
        return currencyAccount;
    }


    public void getValueAccount(double value) {
        if (block == false) {
            accountValue -= value;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountValue=" + accountValue +
                ", currencyAccount=" + currencyAccount
                ;
    }

}
