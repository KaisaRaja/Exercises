import java.util.Scanner;

public class testDayTwo {public static void main(String[] args) {

    // 5 (1)
    String hello = "hello, world";
    System.out.println(hello.toUpperCase());

    // 6 (2)
    String hello2 = "HELLO,WORLD";
    System.out.println(hello2.toLowerCase());

    // 7 (3)
    String hello3 = "Hllo,world";
    String substring = "world";
    if (hello3.contains(substring)) {
        System.out.println(hello3);
    } else {
    System.out.println("Vastust ei leitud");
    }

    // 8 (4)
    String hello4 = "Hello";
    System.out.println(hello4.charAt(0));

    // 9 (5)
    String hello5 = "Hello, world!";
    System.out.println(hello5.replace('o', 'a'));

    // 10 (6)
    String hello6 = "Hello world";
    System.out.println(hello6.startsWith("Hello") && hello6.endsWith("world"));

    // 11 (7)
    String hello7 = "Hello world!";
    System.out.println(hello7.substring(7, 12));

    //12 (8)
    String name = "Abracadabra";
    char K = 'k'
    System.out.println();





















    System.out.println("Siit alates eelmised ülesanded");

    System.out.println("Hello, World");    // 1

    Scanner scanner = new Scanner(System.in);   // 2
    System.out.println("Enter first number: ");
    double a = scanner.nextDouble();
    System.out.println("Enter second number: ");
    double b = scanner.nextDouble();
    System.out.println("Sum is " + (a + b));
    System.out.println("Sub is " + (a - b));
    System.out.println("Multipl is  " + (a * b));
    System.out.println("Div on " + (a / b));

    System.out.println("Enter a number: ");    // 3
    int c = scanner.nextInt();
    if (c / 2 == 0) {
        System.out.println("The number is even ");
    } else {
        System.out.println("The number is odd");
    }

    System.out.println("Enter first number: ");    // 4
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
