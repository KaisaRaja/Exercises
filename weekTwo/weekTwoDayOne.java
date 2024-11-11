package weekTwo;

import java.util.*;

public class weekTwoDayOne {
    //   BooleanTrueOfFalse();
    //   firstTry();
    //   SecondTryScanner();
    //   alfabetRemoveVowels();
    //   numbersOneToFifty();
    //   mapOne();

    public static void main(String[] args) {

        double A = 5;
        double P = 5;
        double R = 0.05;
        int n = 2;
        int t = 1;

        // int rn = (R/n);





        studentGrade();
        jobMap();
        salariesRemoveMap();

    }

    private static void salariesRemoveMap() {
        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("Mary", 2000);
        salaries.put("John", 5000);
        salaries.put("Jane", 3000);
        System.out.println("Original salaries: " + salaries);

        String employeeToRemove = "Mary";
        salaries.remove(employeeToRemove);
        System.out.println("Updated salaries: " + salaries);

       //  for (Map.Entry<String, Integer> entry : salaries.entrySet()) {
        //  System.out.println(entry.getKey() + ": " + entry.getValue());
       // salaries.remove("John");
        //System.out.println("After removing John: " + salaries);
    }

    private static void jobMap() {
        Map<String, String> empoyees = new LinkedHashMap<>();
        empoyees.put("James", "x-ray");
        empoyees.put("John", "CT");
        for (String nameKey : empoyees.keySet()) {
            System.out.println(nameKey + " is " + empoyees.get(nameKey) + " worker");



        }
    }

    private static void studentGrade() {
        Map<String, Integer> students = new LinkedHashMap<>();
        students.put("James", 4);
        students.put("John", 5);
        students.put("Mary", 2);
        for (String nameKey2 : students.keySet()) {
            System.out.println( "In the " + students.get(nameKey2) + "th grade" + " is " + nameKey2);
        }
    }


    private static void mapOne() {
        Map<String, Integer> ages = new LinkedHashMap<>();
        ages.put("Mati", 25);
        ages.put("Kati", 30);
        ages.put("Tõnu", 35);
        for (String nameKey : ages.keySet()) {
            System.out.println(nameKey + " is " + ages.get(nameKey) + " years old");
        }
    }

    private static void numbersOneToFifty() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 1-50");
        int number = sc.nextInt();
        int correctNumber = 12;
        int maxAttempts = 2;
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            if (number != correctNumber && attempt != maxAttempts) {
                System.out.println("Try again!");
                number = sc.nextInt();
            } else if (number == correctNumber) {
                System.out.println("Correct guess!");
                break;
            } else {
                System.out.println("Game over, you did not guess the correct guess!");
                break;


            }
        }
    }

    private static void BooleanTrueOfFalse() {
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(5 != 15);
        //System.out.println(isTrue && !isFalse);
        //  == võrdub;
        // != ei võrdu;
    }


    private static void alfabetRemoveVowels() {
        Set<Character> letters = new HashSet<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            letters.add(ch);
        }
        System.out.println("Alfabet is: " + letters);

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        letters.removeAll(vowels);

        System.out.println("Alfabet set without vovels : " + letters);
    }

    private static void firstTry() {
        String sentence = "Hello, my little world!";
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static void SecondTryScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split("\\s+");
        Set<String> uniqueWords = new HashSet<>();   // oli puudu
        for (String word : words) {
            uniqueWords.add(word);
        }
        System.out.println("Unique words: " + uniqueWords);
    }
}


