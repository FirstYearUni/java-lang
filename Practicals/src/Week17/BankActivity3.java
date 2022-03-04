package Week17;

import java.util.ArrayList;

public class BankActivity3 {
    // you do not need to make changes to the arraylist or add other arraylists
    private ArrayList<BankAccount> accounts;

    public BankActivity3() {
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account){
        //add code to allow adding of accounts to the array list here
        accounts.add(account);
    }

    public void printAccounts(){
        //add code to print all accounts here
        for (BankAccount account: accounts) {
            System.out.println(account.toString()+ "\n");
        }

    }

    public double getAccountsTotal(){
        double total = 0;
        //add code to calculate total here

        return total;
    }

    public static void main(String[] args) {
        BankActivity3 bank = new BankActivity3();
        //add test code here

        YoungSaversAccount youngSaversAccount = new YoungSaversAccount("alain", 30);
        DepositAccount depositAccount = new DepositAccount("Christian", 5000);
        StudentAccount studentAccount = new StudentAccount("Mugisha", 3000);

        bank.addAccount(youngSaversAccount);
        bank.addAccount(depositAccount);
        bank.addAccount(studentAccount);

        bank.printAccounts();
    }
}
