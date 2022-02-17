package Week17;

public class StudentAccount extends account{
    @Override
    public void withdraw(double balance) {
        if (super.getBalance() < -500.00) {
            super.withdraw(balance);
        }
    }
}
