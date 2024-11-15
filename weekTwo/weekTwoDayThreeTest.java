package weekTwo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class weekTwoDayThreeTest {
    public static void main(String[] args) {

        int number = 3;
        switch (number) {
            case 1, 2, 12:
                System.out.println("It is winter");
                break;
            case 3, 4, 5:
                System.out.println("It is spring");
                break;
            case 6, 7, 8:
                System.out.println("It is a summer");
            case 9, 10, 11:
                System.out.println("It is a autumn");
                break;
            default:
                System.out.println("Invalid input");
        }


        monthDays();
        gradesAToF();
        Calculator();
        weekDays();
    }

    private static void monthDays() {
        int number = 5;
        switch (number) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            case 4, 6, 9, 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("Invalid input");
                break;


        }
    }

    private static void gradesAToF() {
        char Char = 'A';
        switch (Char) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Unknown");
                break;

        }
    }

    private static void Calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter an operator (+, -, *, /");
        char operator = scanner.next().charAt(0);

        int result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("The sum is " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The subtraction is " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The multiplication is " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("The division is " + result);
                break;
            default:
                System.out.println("Invalid symbol, please try again");
                break;
        }
    }

    private static void weekDays() {
        int num = 8;

        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
    }


}

