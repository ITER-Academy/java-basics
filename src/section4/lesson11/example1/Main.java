package section4.lesson11.example1;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(100);
        bankAccount.withdraw(30);
        System.out.println("balance: " + bankAccount.getBalance());
    }
}
