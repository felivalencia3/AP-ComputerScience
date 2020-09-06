package valencia.java;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    //Create random number between 1 and 10
    public static int getRandomInt() {
        Random random = new Random();
        return random.nextInt(10) + 1;

    }

    public static void main(String[] args) {
        //Welcome message
        System.out.println("Welcome!" +
                "\nAn integer between 1 and 10 has been chosen at random. \n" +
                "The program will give you three attempts to guess the number\n" +
                "With each guess the program will tell you whether your guess is higher or lower than the number.\n\n\t" +
                "Good Luck!\n");

        //Properties
        Scanner sc = new Scanner(System.in);
        int randomInt = getRandomInt();
        int guessesTaken = 0;
        boolean guessedCorrect=false;

        while (guessesTaken < 3) {
            //Returns first, second or third depending on the guess that the player is on.
            HashMap<Integer, String> ordinalNumbers = new HashMap<>() {{
                put(0, "first");
                put(1, "second");
                put(2, "third (and last)");
            }};
            String guessNumber = ordinalNumbers.get(guessesTaken);

            // Input Prompt
            System.out.println(String.format("Take your %s guess:", guessNumber));
            int guess = sc.nextInt();

            if (guess < randomInt) {
                System.out.println("\tThe number is higher.\n");
            } else if (guess > randomInt) {
                System.out.println("\tThe number is lower.\n");
            } else {
                guessedCorrect=true;
                System.out.println("\n\tYou win!!!");
                break;
            }
            guessesTaken += 1;
        }
        if (!guessedCorrect) {
            System.out.println("\n\tYou Lost.");
        }
    }
}
