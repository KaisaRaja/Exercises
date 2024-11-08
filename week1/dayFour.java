package week1;

import java.util.Arrays;

public class dayFour {
    public static void main(String[] args) {
        int [] firstArray = new int [5];
        System.out.println("Initial array values: " + Arrays.toString(firstArray));
        firstArray[0] ++;
        System.out.println(firstArray[3]);
        System.out.println("Array values after: " + Arrays.toString(firstArray));
 //
        int a = 5;
        int b = 3;
        while (a<b) {
            System.out.println("A is smaller than B, it is: " + a);
        }
        System.out.println(" B is smaller than A, it is: " + b);

        //

        int count = 1;
        while (count <= 5) {
            System.out.println("Count is : " + count);
            count++;   // ühe  kaupa  kontrollimine
            System.out.println("Count is after count++: " + count);
        }
        do {
            System.out.println("Second count is: " + count);
            count++;
        } while (count <= 5);

        //

        for (int count2 = 1; count2 <= 5; count2++) {
            System.out.println("Third count is : " + count);
        }


        String [] fruits = {"Apple", "Banana", "Orange", "Strawberry"};
        for (String fruit : fruits) {
        System.out.println("Fruit: " + fruit);
    }
        for (int coun = 1; coun <=5; coun++) { // ei saanud count kasutada, st coun
            if (coun ==3) {
                break;
            }
            System.out.println("Well done");
            System.out.println("Count is : " + coun);
        }



        }
}
