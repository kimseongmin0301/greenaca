package Exam;

public class Exam0714 {
    public static void main(String[] args) {
        Account ac = new Account();

        ac.setBalance(100);
        System.out.println(ac.getBalance());
        ac.setBalance(-100);
        System.out.println(ac.getBalance());
    }
}
class Account{
    private int balance = 10000;
    final private int MIN_BALANCE = 0;
    final private int MAX_BALANCE = 1000000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance >= MIN_BALANCE && balance <= MAX_BALANCE)
            this.balance = balance;
    }
}