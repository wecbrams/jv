import java.util.Scanner;

class BankAccount {
    private String customerName;
    private String accountNumber;
    private double balance;

    // Constructor to initialize the bank account
    public BankAccount(String name, String accNum, double initialBalance) {
        this.customerName = name;
        this.accountNumber = accNum;
        this.balance = initialBalance;
    }

    // Method to check account balance
    public void checkBalance() {
        System.out.printf("\nCurrent Balance for %s: $%.2f\n", customerName, balance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Successfully deposited $%.2f. New Balance: $%.2f\n", amount, balance);
        } else {
            System.out.println("Invalid deposit amount. Please try again.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Successfully withdrew $%.2f. New Balance: $%.2f\n", amount, balance);
        } else if (amount > balance) {
            System.out.println("Transaction failed: Insufficient funds.");
        } else {
            System.out.println("Invalid withdrawal amount. Please try again.");
        }
    }
}

public class CodingalBankingServices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to Codingal Banking Services ===");
        
        // Creating a sample user account
        BankAccount userAccount = new BankAccount("Alex Morgan", "CBS100249", 500.00);
        
        int choice;
        do {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    userAccount.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: $");
                    double depositAmt = scanner.nextDouble();
                    userAccount.deposit(depositAmt);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmt = scanner.nextDouble();
                    userAccount.withdraw(withdrawAmt);
                    break;
                case 4:
                    System.out.println("Thank you for using Codingal Banking Services. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid menu item.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
