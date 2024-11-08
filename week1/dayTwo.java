package week1;

import java.util.Scanner;

public class dayTwo {

    public static final double PI = 3.14;
    public static final String APP_NAME = "MyApp";
    public final int MAX_USERS = 100;
    int number;
    static String name = "John";

    public static void main(String[] args) {
        // Test code later
        String manager = "John";
        String manager2  = "Mary";
        String manager3= "Jane";

        System.out.println(manager);
        System.out.println(manager + " " + manager2 + " " + manager3);
        int lenghtOfManager = manager2.length();
        System.out.println(lenghtOfManager);
        //  System.out.println(MAX_USERS);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n = scanner.nextInt();
        System.out.println(++n);
        System.out.println(n+13);



    }


}