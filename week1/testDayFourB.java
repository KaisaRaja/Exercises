package week1;

public class testDayFourB {

    public static void main(String[] args) {
        /* multiplication();
        evenNumbers();
        printOneToTen();
        cars();
        oneToHundred(); */
        breakAndContinue();

        int sum = 0;
        int i = 1;
        while (sum<=100) {
            sum += i;
            i++;
        }
        System.out.println("Sum first 100 pos integers is: " + sum);

    }

    private static void breakAndContinue() {
        /* 1
        int[] numbers = {1,3,7,4,9,10};
        for (i; ) {
            if (numbers % 2 == 0) {
                System.out.println("First even number is: " + numbers);
                break;
            }

        // 2 */
        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0) {
                continue;
            }
         if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd numbers are: " + i);

        }
        // 3

        }

        private static void oneToHundred () {
            int sum = 0;
            int i = 1;
            while (i <= 100) {
                sum += i;
                i++;
            }
            System.out.println("Sum first 100 pos integers is: " + sum);
        }

        private static void cars () {
            String[] cars = {"Ford", "Honda", "Audi"};
            for (String car : cars) {
                System.out.println(car);
            }
        }

        private static void printOneToTen () {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Number: " + i);
            }
        }

        private static void evenNumbers () {
            for (int ij = 1; ij <= 20; ij += 2) {
                System.out.println(ij + " ");
            }
        }

        private static void multiplication () {
            int seven = 7;
            for (int mult = 1; mult <= 10; mult++) {
                System.out.println(seven + "*" + mult + " = " + seven * mult);
            }





        }

}