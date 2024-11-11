package week1;

import java.util.ArrayList;
import java.util.List;

public class testingDayFive {
    public static void main(String[] args) {
        deBug1();


        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
            // System.out.println(numbers.get(i-1));
        }
        for (int i = numbers.size(); i > 0; i--) {
            if (numbers.get(i-1) % 2 == 0) {
                numbers.remove(i-1);
            }
        }

        System.out.println("List after removing even numbers: " + numbers);
    }

    private static void deBug1() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);


        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element at index " + i + ": " + numbers.get(i));

        }
    }

}
