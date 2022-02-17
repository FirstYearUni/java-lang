package Week17;

public class YoungSaversAccount extends account{
    @Override
    public void deposit(double balance) {
        if(super.getBalance()+balance > 100) {
            System.out.println("Reached maximum balance");
        } else {
            super.deposit(balance);
        }
    }
}
