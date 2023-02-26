package section4.lesson12.example1;

import section4.lesson12.example1.after.BankAccount;
import section4.lesson12.example1.after.StatementPrinter;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(100);
        bankAccount.withdraw(40);
        int balance = bankAccount.getBalance();
        StatementPrinter statementPrinter = new StatementPrinter();
        statementPrinter.printStatement(balance);
    }
}
