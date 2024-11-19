package weekThree.ATM;

import java.util.Scanner;

public class ATM {
    private static double balance= 1000.00;
    private static final int PIN = 1234;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean correctPin = false;
        while (!correctPin) {
            if (!validatePIN(scanner)) {
                System.out.println("Invalid PIN, please try again");
            } else {
                correctPin = true;
            }
        }
        menu();
        scanner.close();
    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("ATM menu:");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Change PIN");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    withdrawMoney(scanner);
                    break;
                case 4:
                    changePin(scanner);
                    break;
                case 5: {
                    System.out.println("Thank you using the ATM, goodbye!");
                    exit = true;
                }
                default:
                    System.out.println("Invalid option. Please try again");
            }
        }
    }


    private static boolean validatePIN(Scanner scanner) {
        System.out.println("Enter PIN");
        int enteredPin = scanner.nextInt();
        return enteredPin == PIN;

    }

    private static void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    private static void depositMoney(Scanner scanner) {
        System.out.println("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.printf("$%.2f deposited successfully. New balance: $%.2f%n", amount, balance);
            menu();
        } else  {
            System.out.println("Invalid amount, please try again");
            depositMoney(scanner);
        }
    }

    private static void withdrawMoney(Scanner scanner) {
        System.out.println("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance+0.00001) {
            balance -= amount;
            System.out.printf("$%.2f withdrawn successfully. New balance: $%.2f%n ", amount, balance);
            menu();

        } else if (amount > balance) {
            System.out.println("Insufficient balance, please try again");
            withdrawMoney(scanner);
        } else {
            System.out.println("Invalid amount. Withdrawal must be greater than 0");
            withdrawMoney(scanner);
        }

    }

   private static void changePin(Scanner scanner) {
       System.out.println("Enter new PIN");
        int enteredPin = scanner.nextInt();
        if (enteredPin == PIN) {
            System.out.println("PIN already exists, please try again");
           enteredPin = scanner.nextInt(); //MAX ATTEMPTS
            if (enteredPin == PIN) {
                System.out.println("PIN already exists, please try again");
            }
        }
        else {
            System.out.println("Pin changed successfully");
            menu();
        }

    }

}
