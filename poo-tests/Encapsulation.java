class AccountBank {
    private String holder;
    private double balance;

    public AccountBank(String holder) {
        this.holder = holder;
        this.balance = 0.0;
    }

    public void depositMoney(double value) {
        if(value > 0) {
            balance += value;
            System.out.printf("New added value: %s\n", value);
        } else {
            System.out.println("You need to enter a value greater than 0\n");
        }
    }

    public void withdrawMoney(double value) {
        if(value > 0 && value >= value) {
            this.balance -= value;
            System.out.printf("\nWithdrawn: %s\nNew balance: %s\n", value, this.balance);
        }
    }

    public double getBalance() {
        return this.balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        AccountBank account = new AccountBank("Gabriel");

        System.out.printf("Current balance: %s\n", account.getBalance());
        account.depositMoney(1200);
        System.out.printf("Current balance: %s\n", account.getBalance());
        account.withdrawMoney(300);
    }
}