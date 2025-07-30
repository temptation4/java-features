package java9.privateMethod;

public interface Bank {

    double getBalance();

    void deposit(int amount);

    void withdraw(int amount);

    default void executeTransaction(String type,int amount) {
        if(type.equals("DEPOSIT") && validateSufficentFunds(amount)) {
            deposit(amount);
            logTransaction(type,amount);
        } else if(type.equals("WITHDRAW") && validateSufficentFunds(amount)) {
            withdraw(amount);
            logTransaction(type,amount);
        } else {
            System.out.println("Transaction failed insufficent funds ");
        }
    }

    private void logTransaction(String type,int amount) {
        System.out.println("TransactionType "+type);
        System.out.println("Amount "+amount);
        System.out.println("Current balance "+getBalance());
    }

    private boolean validateSufficentFunds(double amount) {
      return getBalance()>=amount;
    }
}
