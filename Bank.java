public class Bank {
private double amount;
    /* Parameterized constructor to initialize amount with 10000*/
    public Bank() {
        this.amount = 10000;
    }
    /*Method to withdraw amount*/
    public void withdraw(double withdrawalAmount) {
        String message = (amount >= withdrawalAmount) ? "Withdrawal successful " +withdrawalAmount: "Insufficient balance";
        System.out.println(message);
        if (amount>= withdrawalAmount) {
            amount -= withdrawalAmount;
        }
    }
    /* Method to deposit amount*/
    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful:"+depositAmount);
    }
/* Method to display total balance*/
public void displayBalance() {
    System.out.println("Total balance: " + amount);
}
    public static void main(String[] args) {
    Bank myBank= new Bank();
    myBank.withdraw(5000);
    myBank.withdraw(10000);
    myBank.deposit(3000);
//    myBank.deposit(10000);
    myBank.displayBalance();
    }
}
