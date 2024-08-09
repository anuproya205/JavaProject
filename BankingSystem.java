// Task 1: Create a custom exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
// Task 2: Implement the BankAccount class
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    // Method to perform transactions
    public void performTransaction(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            balance += -amount;
            System.out.println("Deposited: " + (-amount));
        } else {
            if (amount > balance) {
                throw new InsufficientFundsException("Insufficient funds. Current balance: " + balance);
            } else {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            }
        }
        System.out.println("Current balance: " + balance);
    }
    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}
//Task 3: Demonstrate the usage of the program
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Initial balance: 1000

        try {
            // Performing some transactions
            account.performTransaction(-200);
            account.performTransaction(500);
            account.performTransaction(600);
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
        // Show final balance
        System.out.println("Final balance: " + account.getBalance());
    }
}
