// Daniel Dave B. Meña
// BSCPE202
// Object Oriented Progamming

import java.lang.reflect.InaccessibleObjectException;

public class main {
    public static void main(String[] args) {
        Game g = new Game();

        while (g.ready != false) {
            try {
                // Game Start
                System.out.println("Welcome to Guessing Game!");
                System.out.println("Directions: Guess in uppercase");
                System.out.println("--------------------");
                g.startGame();
            } catch (InaccessibleObjectException e) {
                g.endgame(); // Called if you win
            } catch (IncompatibleClassChangeError e) {
                g.endgameTwo(); // Called if you lost
            }
        }
    }
}