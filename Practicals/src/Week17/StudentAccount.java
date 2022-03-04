package Week17;

public class StudentAccount extends BankAccount{
    private double overdraftLimit;

    public StudentAccount(String accountHolderName, double balance) {
        super(accountHolderName, balance);
        this.overdraftLimit = 500;
    }

    @Override
    public void withdraw(double withdrawAmount) {
        //perform the check specific to StudentAccount
        if((super.getBalance() - withdrawAmount) + overdraftLimit >= 0){
            //do overdraft withdraw
            super.withdraw(withdrawAmount);
        }else{
            System.out.println("You cannot go overdrawn more than £500");
        }
    }

    @Override
    public String toString() {
        return "StudentAccount{" +
                "accountHolderName='" + super.getAccountHolderName() + '\'' +
                ", balance=" + super.getBalance() +
                '}';
    }

    public static void main(String[] args) {
        StudentAccount stAcc = new StudentAccount("Student", 200);
        stAcc.withdraw(100);
        stAcc.withdraw(50);
        stAcc.withdraw(200);
        stAcc.withdraw(400);
    }
}
