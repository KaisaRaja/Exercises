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
        Map<String, Integer> month = new HashMap<String, Integer>();
        int number = 5;
        switch (number) {
            case 1:
                System.out.println("January" + " " + 31 + " days in a month");
                break;
            case 2:
                System.out.println("Febuary" + " " + 28 + " days in a month");
                break;
            case 3:
                System.out.println("March" + " " + 31 + " days in a month");
                break;
            case 4:
                System.out.println("April" + " " + 30 + " days in a month");
                break;
            case 5:
                System.out.println("May" + " " + 31 + " days in a month");
                break;
            case 6:
                System.out.println("June" + " " + 30 + " days in a month");
                break;
            case 7:
                System.out.println("July" + " " + 31 + " days in a month");
                break;
            case 8:
                System.out.println("August" + " " + 31 + " days in a month");
                break;
            case 9:
                System.out.println("September" + " " + 30 + " days in a month");
                break;
            case 10:
                System.out.println("October" + " " + 31 + " days in a month");
                break;
            case 11:
                System.out.println("November" + " " + 30 + " days in a month");
                break;
            case 12:
                System.out.println("December" + " " + 31 + " days in a month");
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

