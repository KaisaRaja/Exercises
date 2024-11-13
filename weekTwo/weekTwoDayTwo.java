package weekTwo;

public class weekTwoDayTwo {
    public static void main(String[] args) {

        int number = 7;
        String result = (number & 2) == 0 ? "Even" : "Odd";

        System.out.println("The number " + number + " is " + result);
        System.out.println("Ternary operator");

        // And excersice for Ternary operator
        // max of two numbers
        int num1 = 10;
        int num2 = 20;
        int maxResult = num1 > num2 ? num1 : num2;
        System.out.println("The maximum number is " + maxResult);

        int age = 16;
        String result2 = (age <=18) ? "Not eliglible to vote" : "Eligible to vote" ;
        System.out.println(result2);
                /* if (age >= voteAge) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eliglible to vote");
        } */



    }
}
