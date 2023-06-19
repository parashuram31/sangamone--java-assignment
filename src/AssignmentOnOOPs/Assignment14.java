package AssignmentOnOOPs;

class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * interestRate;
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

public class Assignment14 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 0.05);
        CheckingAccount checkingAccount = new CheckingAccount(2000.0, 500.0);

        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);
        double savingsBalance = savingsAccount.getBalance();
        double savingsInterest = savingsAccount.calculateInterest();

        System.out.println("Savings Account Balance: $" + savingsBalance);
        System.out.println("Savings Account Interest: $" + savingsInterest);

        System.out.println();

        checkingAccount.deposit(1000.0);
        checkingAccount.withdraw(3000.0);
        double checkingBalance = checkingAccount.getBalance();

        System.out.println("Checking Account Balance: $" + checkingBalance);
    }
}
