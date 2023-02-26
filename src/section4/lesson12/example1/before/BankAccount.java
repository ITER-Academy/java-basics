package section4.lesson12.example1.before;

public class BankAccount {

    private int balance;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void printStatement() {
        System.out.println("Balance: " + balance);
    }
}
