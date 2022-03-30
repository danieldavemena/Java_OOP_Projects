// Daniel Dave B. Meña
// BSCPE202
// Object Oriented Programming

public class exceptionHandling {
    public static void main(String args[]) {
        randomNumberGame game = new randomNumberGame(); // Initializing Object randomNumberGame()

        // Exception handling loop
        do {
            try {
                System.out.print("Guess a number from 1 to 50: "); // Game start
                game.getrandomNumberGame();
            } catch (Exception e) {
                System.out.println("Invalid Input."); // Error message
            }
        } while(game.num != game.rand); // End loop

        System.out.printf("You got it in %s attempt(s)\n", game.numOfTries); // Attempts
    }
}