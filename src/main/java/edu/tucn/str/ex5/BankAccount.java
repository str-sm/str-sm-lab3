package edu.tucn.str.ex5;

/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

public class BankAccount {
    private /*volatile*/ int balance;

    // TODO: implement mutual exclusion for deposit method
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " -> balance: " + balance);
    }

    // TODO: implement mutual exclusion for withdraw method
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " -> balance: " + balance);
        } else {
            System.err.println("Insufficient funds");
        }
    }

    public int getBalance() {
        return balance;
    }
}
