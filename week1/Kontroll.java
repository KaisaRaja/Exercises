package week1;

public class Kontroll {

    public static void main(String[] args) {
        // lessonOne ();
        //  lessonTwo ();
        dayTwo ();
    }
    /* // Task 1
    // TODO  - print out "b is bigger than a"
    // TODO  - print out "a is bigger than b" in else if block
    // TODO  - print out "a and b are equal" in else block
    public static void lessonOne() {

        int a = 2;
        int b = 2;
        if (a < b) {
            System.out.println("b is bigger than a");
        } else if (a > b) {
            System.out.println("a is bigger than b");
        } else {
            System.out.println("a and b are equal");
        }
    }

    // TODO  - print out "b is bigger than a, and a is positive"
    // TODO  - print out "a is bigger than b and b is positive " in else if block
    // TODO  - print out "a and b are either equal or both are negative" in else if block
    // TODO  - print out "No specific conditions were met" in else  block

    public static void lessonTwo () {
        int a = 3;
        int b = 2;
        if ((a < b) && (a > 0)) {
            System.out.println("b is bigger than a, and a is positive");
        } else if ((a > b) &&  b > 0) {
            System.out.println("a is bigger than b and b is positive");
        } else if ((a==b) || a<0 && b<0) {
            System.out.println("a and b are equal or both are negative");
        } else {
            System.out.println("No specific conditions were met");
        }
    } */

    public static void dayTwo () {
       /* System.out.println("TEISE PÄEVA KOODIDE VASTUSED!");
        // 1
        System.out.println("Hello, world!");

        //2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number!");
        double a = scanner.nextDouble();
        System.out.println("Enter second number!");
        double b = scanner.nextDouble();
        System.out.println("Sum is " + (a+b));
        System.out.println("Difference is " + (a-b));
        System.out.println("Product is " + (a*b));
        System.out.println("Division is " + (a/b));

        // 3

        System.out.println("Please enter first number!");
        int c = scanner.nextInt();
        System.out.println("Please enter second number!");
        int d = scanner.nextInt();
        System.out.println("Please enter third number!");
        int e = scanner.nextInt();
        if (c<d && d<e) {
            System.out.println("The greatest number is "  + e);
        } else if (c>d && c>e) {
            System.out.println("The greatest number is " + c);
        } else {
            System.out.println("The greatest number is " + d);
            } */

        // 1
        String hel = "hello world";
        System.out.println(hel.toUpperCase());
        // String original = "hello world";
        // String uppercased = original.toUpperCase();
       //  System.out.println("Uppercase: " uppercased);
        // 2
        String HEL = "HELLO  WORLD";
        System.out.println(HEL.toLowerCase());
        //3
        String hello1 = "Hello, world!";
        String world = "world";
        if (hello1.contains(world)) {  // BOOLEAN!!!
            System.out.println("It contains!");
        } else {
            System.out.println("It doesn't contain!");
        }

        // 4
        String hello = "Hello";
        System.out.println(hello.charAt(0));
        System.out.println(hello.charAt(1));

        //5
        String hello2 = "Hello, world!";
        System.out.println(hello2.replace('o', 'a'));

        // 5 PAREN
        String original = "Hello, world!";
        String modified = original.replace('o', 'a');
        System.out.println("Modified string " + modified);

        // 6
        String string1 = "Hello, ";
        String string2 = "world!";
        System.out.println(hello2.startsWith(string1) && hello2.endsWith(string2));

        // 6 parem
        String start = "Hello";
        String end = "world!";
        boolean startsWith = original.startsWith(start);
        boolean endsWith = original.endsWith(end);
        boolean result = startsWith && endsWith;
        System.out.println("Starts with " + start + " " + startsWith);
        System.out.println("Ends with " + end + " " + endsWith);
        System.out.println("Both conditions are met : " + result);
        //7
        System.out.println(hello2.substring(0, 12));

        // 7 parem
        int startIndex = 7;
        int endIndex = 12; // jäi pooleli
        // 8
        String ab = "abracadabra";
        char char1 = 'b';
        System.out.println("The first character is in the " + ab.indexOf(char1)   + " place" +
                " and the last character is in the " + ab.lastIndexOf(char1)  + " place. ");
        // 8 parem // Kasutasin string ab
        char searchChar = 'b';

        int firstPosition = original.indexOf(searchChar);
        int lastPosition = original.lastIndexOf(searchChar);

        System.out.println("First position of '" + searchChar + "' is " + firstPosition);
        System.out.println("Last position of '" + searchChar + "' is " + lastPosition);

        // 9
        String sentence = "Java is fun and fun!";
        String f = "fun";   // target
        String a = "awesome";   // replacement
        System.out.println(sentence.replace(f,a));
        // String upDatedSentemce = sentence.replace (target, replacement) ;
        System.out.println(sentence.replaceFirst(f, a));

        }

}
