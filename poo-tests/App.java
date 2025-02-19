interface Account {
    void depositMoney(double value);
    void withdrawMoney(double value);
}

class AccountBank implements Account {
    private double balance;

    public void depositMoney(double value) {
        this.balance += value;
    }

    public void withdrawMoney(double value) {
        if(value > this.balance) {
            System.out.println("You can't withdraw this amount due to lack of funds.");

            return;
        } else {
            this.balance -= value;
        }
    }

    public double getBalance() {
        return this.balance;
    }
}

public class App {
    public static void main(String[] args) {
        AccountBank account = new AccountBank();

        account.depositMoney(100);
        account.withdrawMoney(20);
        
        System.out.printf("Current balance bank: %s", account.getBalance());
    }
}