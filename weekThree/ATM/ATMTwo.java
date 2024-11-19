package weekThree.ATM;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATMTwo {
    private static double balance= 1000.00;
    private static final int PIN = 1234;
    private static Map<Integer, User> users = new HashMap<>(); // Map PIN to User

    public static void main(String[] args) {
        Account account1 = new Account(1000.00);
        Account account2 = new Account(5756.00);
        Account account3 = new Account(1200.00);

        User user1 = new User("Jack", 1234, account1);
        User user2 = new User("John", 5678, account2);
        User user3 = new User("Charlie", 9012, account3);
        users.put(user1.getPIN(), user1);
        users.put(user2.getPIN(), user2);
        users.put(user3.getPIN(), user3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to ATM, please enter your PIN!");
        int enteredPin = scanner.nextInt();
        User currentUser = currentUser(enteredPin);
        if (currentUser == null) {
            System.out.println("Invalid PIN.  Try again");
            return;
        }
        System.out.printf("Welcome, %s!%n", currentUser.getName());

       // boolean enteredPin = false;
       /*  while (!enteredPin) {
            if (!validatePIN(scanner)) {
                System.out.println("Invalid PIN, please try again");
            } else {
                enteredPin = true;
                System.out.printf("Welcome, %s!%n", currentUser.getName());
            }
        } */
        menu();
        scanner.close();
    }

    private static User currentUser(int enteredPin) {
        User currentUser = users.get(enteredPin);
        return currentUser;
    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");
           String currentUser;

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                  //  checkBalance(user);
                    break;
                case 2:
                //    depositMoney(scanner, currentUser);
                    break;
                case 3:
                    withdrawMoney(scanner);
                    break;
                case 4:
               //     changePin(scanner, currentUser);
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
  /*   private static boolean validatePIN(Scanner scanner) {
        System.out.println("Enter PIN");
        int Pin = get();
        return Pin == PIN;

    } */

    private static void checkBalance(User user) {
        System.out.printf("Your current balance is: $%.2f%n", user.getAccount().getBalance());
    }

    private static void depositMoney(Scanner scanner, String user) {
        System.out.println("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.printf("$%.2f deposited successfully. New balance: $%.2f%n", amount, balance);
            menu();
        } else  {
            System.out.println("Invalid amount, please try again");
            depositMoney(scanner, user);
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
        int Pin = scanner.nextInt();
        if (Pin == PIN) {
            System.out.println("PIN already exists, please try again");
           Pin = scanner.nextInt(); //MAX ATTEMPTS
            if (Pin == PIN) {
                System.out.println("PIN already exists, please try again");
            }
        }
        else {
            System.out.println("Pin changed successfully");
            menu();
        }

    }

}
