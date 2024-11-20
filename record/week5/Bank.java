import java.util.Scanner;

abstract class Account {
    String customerName;
    int accountNumber;
    double balance;
    String accountType;

    Account(String customerName, int accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    void display() {
        System.out.println("Balance: " + balance);
    }

    abstract void interest();

    abstract void withdraw(double amount);
}

class SavAcct extends Account {
    double interestRate = 0.05;

    SavAcct(String customerName, int accountNumber, double balance) {
        super(customerName, accountNumber, "Savings", balance);
    }

    @Override
    void interest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added. New balance: " + balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class CurAcct extends Account {
    double minbalance = 1000.00;
    double scharge = 50.00;
    double[] chequetransactions = new double[100];
    int chequeid = 0;

    CurAcct(String customerName, int accountNumber, double balance) {
        super(customerName, accountNumber, "Current", balance);
    }

    @Override
    void interest() {
        System.out.println("Interest cannot be calculated for current account.");
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            if (balance < minbalance) {
                balance -= scharge;
                System.out.println("Penalty of " + scharge + " has been deducted. The new balance is: " + balance);
            } else {
                System.out.println("The updated balance is: " + balance);
            }
            chequetransactions[chequeid++] = amount; // Log the transaction
        } else {
            System.out.println("Insufficient balance. The withdrawal amount is greater than balance.");
        }
    }

    void displayTransaction() {
        for (int i = 0; i < chequeid; i++) {
            System.out.println("Transaction " + (i + 1) + ": " + chequetransactions[i]);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Abhishek patil \nUSN:1BM23CS048");
        System.out.println("Enter account type (1 for Savings, 2 for Current): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.println("Enter account number: ");
        int accNum = scanner.nextInt();

        System.out.println("Enter initial balance: ");
        double balance = scanner.nextDouble();

        Account account = null;
        if (choice == 1) {
            account = new SavAcct(name, accNum, balance);
        } else if (choice == 2) {
            account = new CurAcct(name, accNum, balance);
        } else {
            System.out.println("Invalid account type selected.");
            return; // Exit if invalid account type
        }

        int exit = 0;

        do {
            System.out.println("Enter the function to be done:");
            System.out
                    .println("1. Deposit\n2. Display Balance\n3. Compute and deposit interest\n4. Withdrawal\n5. Exit");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter deposit amount:");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    account.display();
                    if (choice == 2) {
                        ((CurAcct) account).displayTransaction();
                    }
                    break;
                case 3:
                    account.interest();
                    break;
                case 4:
                    System.out.println("Enter withdrawal amount:");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    exit = 1; // Change exit flag
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (exit == 0); // Loop until exit flag is set

        scanner.close();
    }
}