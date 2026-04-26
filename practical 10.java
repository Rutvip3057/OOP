class BankAccount {
    String account_holder_name;
    double balance;
    static double interest_rate;

    BankAccount(String name, double balance) {
        this.account_holder_name = name;
        this.balance = balance;
    }

    double calculateInterest() {
        return balance * interest_rate / 100;
    }

    void displayInterest() {
        System.out.println("Name: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
    }

    static void updateInterestRate(double rate) {
        interest_rate = rate;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount.updateInterestRate(6);

        BankAccount a1 = new BankAccount("Rahul", 15000);
        BankAccount a2 = new BankAccount("Neha", 25000);

        a1.displayInterest();
        System.out.println();
        a2.displayInterest();

        BankAccount.updateInterestRate(8);

        System.out.println("\nAfter updating interest rate:\n");

        a1.displayInterest();
        System.out.println();
        a2.displayInterest();
    }
}