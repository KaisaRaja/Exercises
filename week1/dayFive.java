package week1;

import java.util.ArrayList;
import java.util.List;

public class dayFive {
    public static void main(String[] args) {

        toFirstNegativeNumber();
        higherThan50();
        listArraylist();

    }
    private static void listArraylist() {
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Alex");
        listOfNames.add("Bob");
        listOfNames.add("Charlie");

        System.out.println(listOfNames);
        for (String name : listOfNames) {
            System.out.println(name);
        }

        System.out.println(" ");
        System.out.println("Print out name: " +listOfNames.get(0));
        System.out.println("Print out name: " +listOfNames.get(1));
        System.out.println("Print out name: " +listOfNames.get(2));

        listOfNames.set(1, "John");
        System.out.println("Names after modification:" + listOfNames);

        listOfNames.remove("Charlie");
        System.out.println("Names after removing:" + listOfNames);

    }

    private static void toFirstNegativeNumber() {
        int[] numbers = {5, 12, 3, 7, -4, 8, 2};
        int sum = 0;
        for (int number : numbers) {
            if (number < 0) {
                break;
            } sum += number;

        } System.out.println("The sum is: " + sum);
    }
    private static void higherThan50() {
        int[] numbers = {23, 45, 39, 51, 48, 60};
        for(int number : numbers) {
            if (number <=50) {
                continue;
            }
            System.out.println("The first higher than 50 number is: " + number);
            break;
        }
    }
}
