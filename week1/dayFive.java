package week1;

public class dayFive {
    public static void main(String[] args) {

        toFirstNegativeNumber();
        higherThan50();
        test();





    }
    private static void test() {

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