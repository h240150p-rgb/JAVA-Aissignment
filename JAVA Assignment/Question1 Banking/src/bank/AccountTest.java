package bank;



public class AccountTest {
    public static void main(String[] args) {
        // Create account with initial balance
        Account acc = new Account("Tatenda Makura", 1000);

        acc.deposit(688);
        acc.withdraw(200);
        acc.withdraw(3000);
        acc.deposit(-10);
        acc.getBalance();
        
        
        Account acc1 = new Account("Obey Kuyangamara", 100);

        acc1.deposit(600);
        acc1.withdraw(200);
        acc1.withdraw(5000);
        acc1.deposit(-100);
        acc1.getBalance();
    }
}
