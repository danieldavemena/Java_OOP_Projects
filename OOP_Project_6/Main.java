/*
Daniel Dave B. Meña
BSCPE202
Object Oriented Programming
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        accounts acc = new accounts();
        Scanner userIn = new Scanner(System.in);

        // USER GREETINGS AND OPTION
        System.out.println(acc.bar);
        System.out.println(acc.greeting);
        System.out.println(acc.bar);
        System.out.println(acc.optionOne);
        System.out.println(acc.optionTwo);
        System.out.println(acc.bar);

        // USER OPTIONS' EXCEPTION HANDLER
        try {
            System.out.print("Enter option: ");
            int userOpt = userIn.nextInt();

            if (userOpt == 1) {
                acc.registerUser();
            } else if (userOpt == 2) {
                acc.loginUser();
            } else {
                userIn.close();
                throw new InputMismatchException();
            }

        } catch (InputMismatchException ex) {
            System.out.println(acc.bar);
            System.out.println("Not an Option");
        }

        userIn.close();
    }
}