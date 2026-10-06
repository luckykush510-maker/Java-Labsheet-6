abstract class BankAccount {
    double balance = 1000;

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    void deposit(double amount) {
        balance += amount;
        System.out.println("Savings deposit: " + amount);
    }

    void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Savings withdrawal: " + amount);
        } else {
            System.out.println("Withdrawal not allowed");
        }
    }
}

class CurrentAccount extends BankAccount {
    void deposit(double amount) {
        balance += amount;
        System.out.println("Current deposit: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Current withdrawal: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class Q8BankAccount {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        CurrentAccount c = new CurrentAccount();

        s.deposit(500);
        s.withdraw(300);

        c.deposit(500);
        c.withdraw(1200);
    }
}
