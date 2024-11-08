package week1;

import java.util.Arrays;

public class fourTest {
    public static void main(String[] args) {

        // 1 Task: Declare an integer array of size 5 and initialize it with values: {1, 2, 3, 4, 5}.
        //Hint: Use int[] myArray = {1, 2, 3, 4, 5};
         int[] myArray = {1, 2, 3, 4, 5};
        System.out.println("My array is : " + Arrays.toString(myArray));
        // 2 Task: Access and print the third element in the array {10, 20, 30, 40, 50}.
        //Hint: Use array[2] (since arrays are zero-indexed).
        int[] newArray = {10, 20, 30, 40, 50};
        System.out.println("In the third place is: " + newArray[2]);
        // 3 Exercise3 - Modify an Element
        //Task: Given an array {5, 10, 15, 20}, change the second element to 12 and print the entire array to see the change.
        //Hint: Assign a new value to array[1], then print the elements individually.
        int[] newArray2 = {5, 10, 15, 20};
        newArray2[1] = 12;
        System.out.println("Modified array is : " + Arrays.toString(newArray2));
        System.out.println("Also modified array is : " + newArray2[0] + ", " + newArray2[1] + ", " + newArray2[2] + ", " + newArray2[3]);
        // 4 Exercise4 - Array Length Property
        //Task: Create an array {8, 6, 7, 5, 3, 0, 9} and print its length.
        //Hint: Use array.length to get the length of an array.
        int[] myArray3 = {8, 6, 7, 5, 3, 0, 9};
        int length = myArray3.length;
        System.out.println("Length is : " + length);
        System.out.println("Also length is : " + myArray3.length);
        //5 Exercise5 - Sum of Elements (Without Loop)
        //Task: Calculate the sum of elements in an array {4, 2, 8, 1, 6} and store it in a variable.
        //Hint: Manually add each element: int sum = array[0] + array[1] + ... + array[4];
        int[] myArray4 = {4, 2, 8, 1, 6};
        int sum = myArray4[0] + myArray4[1] + myArray4[2] + myArray4[3] + myArray4[4];
        System.out.println("Sum if this array is : " + sum);

        // Lisaks huvitav asi
        //  int number = 1;
        //  number = number + number + 1;
        //  System.out.println("Kui panna number 1 + number + number ja teda lasta kahekordelt välja trükkida : " + number + number);
        // Loops 1
        int[] numbers = {1, 3, 7, 4, 9, 10};
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("First even number is " + number);
                break;
            }
        }
        //2
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i % 5 == 0) {
                continue;
            }
            System.out.println("My odd number is: " + i);
        }
        //3
        for (int i = 3; i <= 30; i++) {
            if (i % 6 == 0) {
                continue;
            }
            if (i % 3 == 0) { System.out.println("This number is: " + i);
                continue;
            }

        }
    }
}


