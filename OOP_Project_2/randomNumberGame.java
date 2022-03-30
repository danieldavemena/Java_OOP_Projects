// Daniel Dave B. Meña
// BSCPE202
// Object Oriented Programming

import java.util.*;

public class randomNumberGame {

    // Initializing of necessary variables
    public int numOfTries;
    public double num;
    public double rand;

    // randomNumberGame() getter
    public void getrandomNumberGame() {
        Scanner sc = new Scanner(System.in); // Initializing scanner
        rand = Math.floor((Math.random() * 50) + 1); // Random number generator

        // Start loop
        while(true) { 
            num = sc.nextDouble(); // User input

            // User input and random number comparator
            if (num < rand && num > 0) {
                System.out.println("Too low. Try Again.");
                numOfTries++;
                continue;
            } else if (num > rand && num < 51) {
                System.out.println("Too high. Try Again.");
                numOfTries++;
                continue;
            } else if (num > 50 || num <= 0) {
                System.out.println("Out of Range.");
                continue;
            } else if (num == rand) {
                System.out.println("Correct");
                break;
            }
        } // End loop
    }
}