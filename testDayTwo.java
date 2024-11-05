import java.util.Scanner;

public class testDayTwo {public static void main(String[] args) {

    System.out.println("Hello, World");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first number: ");
    double a = scanner.nextDouble();
    System.out.println("Enter second number: ");
    double b = scanner.nextDouble();
    System.out.println("Sum is " + (a + b));
    System.out.println("Sub is " + (a - b));
    System.out.println("Multipl is  " + (a * b));
    System.out.println("Div on " + (a / b));

    System.out.println("Enter a number: ");
    int c = scanner.nextInt();
    if (c / 2 == 0) {
        System.out.println("The number is even ");
    } else {
        System.out.println("The number is odd");
    }

    System.out.println("Enter first number: ");
    int d = scanner.nextInt();
    System.out.println("Enter second number: ");
    int e = scanner.nextInt();
    System.out.println("Enter third number: ");
    int f = scanner.nextInt();
    if (e < f && d < f) {
        System.out.println("The greatest number is " + f);
    } else if (d < e && f < e) {
        System.out.println("The greatest number is " + e);
    } else {
        System.out.println("The greatest number is " + d);

    }
}


}
