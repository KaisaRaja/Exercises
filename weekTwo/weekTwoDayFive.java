package weekTwo;

public class weekTwoDayFive {
    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person();

        String name = person.getName();
        name = "test";
        System.out.println(name);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());




        int b = 3;
        int a = 6;
        doSomething2(a, b);
        int c = 5;
        int d = 4;

        System.out.println("Hello World");
        int number = 5;
        System.out.println(number);
        int numberTwo = 13;
        System.out.println(numberTwo);
        int result = number + numberTwo;
        System.out.println(result);
        System.out.println("Ja nüüd katsetame tagastust, voidiga, return");
        doSomething();
        multiplyAndPrint();
        multiplyAndReturn(a, b);
    }
    private static void doSomething() {
        int c = 5;
        int d = 6;
        System.out.println(c);
        System.out.println(d);
        System.out.println(c* d);

    }
    private static void doSomething2(int a, int b) {
        System.out.println(a*b);

    }
    private static void multiplyAndPrint() {
        int e = 3;
        int f = 5;
        int result = e * f;
        System.out.println("Result (void method);" + result);
    }
    private static int multiplyAndReturn(int a, int b) {
        int result = a * b;
        return result;
    }
}

// "Prindi juurde mingi tekst, siis saab veel paremini aru !

