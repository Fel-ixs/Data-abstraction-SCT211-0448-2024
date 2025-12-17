abstract class BankAccount {
    String owner;
    double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // abstract method (no implementation)
    abstract void deposit(double amount);

    // concrete method
    void displayBalance() {
        System.out.println("Your balance is " + balance);
    }
}
class SavingsAccount extends BankAccount {

    SavingsAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount acc = new SavingsAccount("Felix", 5000);

        acc.deposit(1000);
        acc.displayBalance();
    }
}
