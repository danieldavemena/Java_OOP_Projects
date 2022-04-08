import java.util.*;
import java.io.*;
import java.lang.reflect.InaccessibleObjectException;

public class Game {
    /*
     * NOTE: I used forward slashes in
     * words variable because I am using
     * Linux. And its filepath starts
     * with forward slashes.
     */
    File words = new File("/home/daniel/Documents/03_programming_projects/Java_OOP_Projects/OOP_Project_5/words.txt");
    private Scanner sc = new Scanner(System.in);
    private String[] wordlist = new String[23];
    private int numOfGuesses = 1;
    private String bar = "--------------------";
    public boolean ready = true;

    void startGame() {
        numOfGuesses = 1;
        int previousCounter = 0;
        int scoreCounter = 0;
        int lives = 5;
        int count = 0;

        try {
            // Scanner for text file
            Scanner file = new Scanner(words);

            // Assigning text to string array
            while (file.hasNextLine()) {
                wordlist[count] = file.next();
                count++;
            }

            // Choosing word randomly
            String chosenWord = wordlist[(int) Math.floor(Math.random() * 23)];
            char[] toCharWord = chosenWord.toCharArray();
            char[] toCharWordDummy = chosenWord.toCharArray();
            char[] wordHolder = new char[chosenWord.length()];

            // Censoring characters Randomly
            System.out.print("Word: ");

            for (int k = 0; k < chosenWord.length(); k++) {
                int randomizer = (int) Math.floor(Math.random() * 2);

                if (randomizer == 1) {
                    toCharWordDummy[k] = '?';
                }

                wordHolder[k] = toCharWordDummy[k];
                System.out.print(wordHolder[k]);
            }

            System.out.println("\n" + bar);

            // Game Start
            while (lives > 0) {

                // Lives counter
                System.out.print("Lives: ");
                for (int l = 0; l < lives; l++) {
                    System.out.print("♥");
                }

                // Guesses
                System.out.print("\nEnter a Letter: ");
                char guess = sc.next().charAt(0);

                for (int i = 0; i < chosenWord.length(); i++) {
                    if (guess == toCharWord[i]) {
                        wordHolder[i] = guess;
                        scoreCounter++;
                    }
                }

                // Guess counter
                if (previousCounter != scoreCounter) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Not in the word! Try Again!");
                    lives--;
                    numOfGuesses++;
                }

                scoreCounter = previousCounter;

                // Display progress
                System.out.println(bar);
                for (int j = 0; j < chosenWord.length(); j++) {
                    System.out.print(wordHolder[j]);

                }
                System.out.println("\n" + bar);

                // Game win checker
                String chosen = new String(toCharWord);
                String userAns = new String(wordHolder);

                if (userAns.equals(chosen)) {
                    throw new InaccessibleObjectException();
                }
            }

            // If game lost
            throw new IncompatibleClassChangeError();

        } catch (FileNotFoundException e) {
        }
    }

    void endgame() {
        System.out.println("Your guess it in " + numOfGuesses + " tries.");
        System.out.print("Would you like to play again? (y/n): ");
        String choice = sc.next();

        if (choice.equals("y")) {
            ready = true;
        } else {
            ready = false;
        }
        System.out.println(bar);
    }

    void endgameTwo() {
        System.out.println("Sorry, you guessed wrong.");
        System.out.print("Would you like to play again? (y/n): ");
        String choice = sc.next();

        if (choice.equals("y")) {
            ready = true;
        } else {
            ready = false;
        }
        System.out.println(bar);
    }
}
