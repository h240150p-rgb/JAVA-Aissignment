package bank;


import java.io.FileWriter;
import java.io.IOException;

abstract class Bank {
    protected String accountName;
    protected double balance;

    public Bank(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    // Method to write transactions to Bank.txt
    protected void recordTransaction(String message) {
        try (FileWriter writer = new FileWriter("Bank.txt", true)) {
            writer.write(message + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}
