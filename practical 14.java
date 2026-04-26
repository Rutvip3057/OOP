class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(String accNo, String name, double initialBalance) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    double interestRate = 4;

    double calculateInterest() {
        return balance * interestRate / 100;
    }
}

class FixedDepositAccount extends BankAccount {
    double interestRate = 6;
    int years;

    void setTerm(int years) {
        this.years = years;
    }

    double maturityAmount() {
        return balance * Math.pow(1 + interestRate / 100, years);
    }
}

public class Main {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.openAccount("SA101", "Ravi", 10000);
        sa.deposit(2000);
        sa.withdraw(1500);
        sa.checkBalance();
        System.out.println("Interest (Saving): " + sa.calculateInterest());

        System.out.println();

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount("FD201", "Neha", 20000);
        fd.setTerm(3);
        fd.checkBalance();
        System.out.println("Maturity Amount (FD): " + fd.maturityAmount());
    }
}