package bank;



class Account extends Bank {
    public Account(String accountName, double balance) {
        super(accountName, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited : " + amount);
            recordTransaction(accountName + " deposited " + amount + ". New balance : " + balance);
        } else {
            System.out.println("Deposit amount must be greater than 0");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdrawal amount exceeded account balance");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrew : " + amount);
            recordTransaction(accountName + " withdrew " + amount + ". New balance : " + balance);
        } else {
            System.out.println("Withdrawal amount must be greater than 0");
        }
    }

    @Override
    public double getBalance() {
        System.out.println("Current Balance : " + balance);
        recordTransaction(accountName + " checked balance. Balance : " + balance);
        return balance;
    }
}
