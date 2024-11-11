package week1;

import java.util.ArrayList;
import java.util.List;

public class proov {

    public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();

    numbers.add(10);
    numbers.add(20);
    numbers.add(30);

    for (int i = 0; i< numbers.size(); i++) {
        System.out.println("Element at index " + i + ": " + (numbers.get(i) != null ? numbers.get(i) : " "));
    }
}
}
