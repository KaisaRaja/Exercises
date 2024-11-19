package weekThree.ATM;
// TODO Simple try-catch
//Write a Java program that prompts the user to enter a number and then divides 100 by that number.
// Handle the Exception if the user enters 0 (to avoid division by zero)
//Prompt the user to enter a number.
//Read the input from the user using a Scanner.
//Try to divide 100 by the input number.

import java.util.Scanner;

public class weekTreeDayTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.println("Please enter number and I try divide 100 to it");
        double num = scanner.nextInt();
        double result = 100 / num;
            System.out.println("100 divided by " + num + " is " + result);
        } catch (Exception e) {
            System.out.println("Cannot divide 100 to it");
        }
    }


}