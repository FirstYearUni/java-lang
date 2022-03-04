package Week17;

public class BankActivity2 {
    public static void main(String[] args) {
        //do some testing with the new account types
        YoungSaversAccount ysAcc = new YoungSaversAccount("Amaara", 50.00);
        ysAcc.deposit(30);
        ysAcc.deposit(40);
        StudentAccount stAcc = new StudentAccount("Student", 200);
        stAcc.withdraw(100);
        stAcc.withdraw(50);
        stAcc.withdraw(200);
        stAcc.withdraw(400);
        DepositAccount dpAcc = new DepositAccount("Rabia", 1000);
        dpAcc.payInterest();
        System.out.println(dpAcc.toString());
    }
}
