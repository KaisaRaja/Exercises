package week1;

public class diceGame {
    public static void main(String[] args) {

        int diceRoll = rollDice();

        System.out.println("You rolled a number: " + diceRoll);

    }
    private static int rollDice() {
        return (int) (Math.random() * 6) + 1;

    }
}
