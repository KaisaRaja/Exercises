public class DayOneIfCondition {   // if condition ja teksti printimine jne
    public static void main(String[] args) {
        // System.out.println("Kaisa");

        // Task 1
        // TODO  - print out "b is bigger than a"
        // TODO  - print out "a is bigger than b" in else if block
        // TODO  - print out "a and b are equal" in else block
        int a = 4;
        int b = 3;
        /*   if (b > a){
          System.out.println("b is bigger than a");
        }  else if (a > b) {
            System.out.println("a is bigger than b");
        }  else {
            System.out.println("a and b are equal");
        } */

        // Task 2
        // use AND &&
        // USE OR ||
        // TODO  - print out "b is bigger than a, and a is positive"
        // TODO  - print out "a is bigger than b and b is positive " in else if block
        // TODO  - print out "a and b are either equal or both are negative" in else if block
        // TODO  - print out "No specific conditions were met" in else  block

        if ((b > a) && a > 0) {
            System.out.println("b is bigger than a, and a is positive");
        } else if ((a > b) && b > 0) {
            System.out.println("a is bigger than b and b is positive ");
        } else if ((a == b) || (a < 0 && b < 0)) {
            System.out.println("a and b are either equal or both are negative");
        } else {
            System.out.println("No specific conditions were met");

        }


    }
}
