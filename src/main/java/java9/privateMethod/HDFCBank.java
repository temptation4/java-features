package java9.privateMethod;

public class HDFCBank implements Bank {

    private double balance;

    public HDFCBank(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(int amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public static void main(String[] args) {
        Bank bank = new HDFCBank(1000);
        bank.executeTransaction("DEPOSIT", 500);
        bank.executeTransaction("WITHDRAW", 200);
        bank.executeTransaction("WITHDRAW", 2000);
    }
}
