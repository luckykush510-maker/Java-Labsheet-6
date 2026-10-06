class BankAccount {
    double balance = 500;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}

class SavingsAccount extends BankAccount {
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal not allowed");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}

public class Q5BankAccount {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.deposit(200);
        s.withdraw(550);
        System.out.println("Balance = " + s.balance);
    }
}
