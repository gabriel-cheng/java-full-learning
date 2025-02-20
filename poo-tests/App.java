interface Account {
    void depositMoney(double value);
    void withdrawMoney(double value);
}

class AccountBank implements Account {
    private double balance;

    public void depositMoney(double value) {
        this.balance += value;

        System.out.printf("New added value: %s \n\n", value);
    }

    public void withdrawMoney(double value) {
        if(value > this.balance) {
            System.out.println("You can't withdraw this amount due to lack of funds. \n");

            return;
        } else {
            this.balance -= value;

            System.out.printf("Withdrawn: %s \nRemaining: %s", value, balance);
        }
    }

    public double getBalance() {
        return this.balance;
    }
}

class InternationalBankAccount extends AccountBank {
    public void showMessage() {
        System.out.println("Hello, worlds!");
    }
}

public class App {
    public static void main(String[] args) {
        InternationalBankAccount account = new InternationalBankAccount();

        account.depositMoney(1000);
        account.withdrawMoney(200);
    }
}