package Week17;

public class account {
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double balance) {
        if (balance <=0 ) {
            System.out.println("Invalid balance");
        } else {
            this.balance += balance;
        }

    }
    public void withdraw(double balance) {
        if (balance < this.balance) {
            System.out.println("Withdraw will not work");
        }
    }

    public double getBalance() {
        return balance;
    }

    private String accountHolderName;
    private double balance;

    public account () {
        this.balance = 0;
    }
}
