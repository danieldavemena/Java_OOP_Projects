import java.io.*;
import java.util.*;

public class accounts {

    // GREETING VARIABLES
    public String bar = "--------------------------------------------------";
    public String greeting = "Hello user! Would you like to register or login?";
    public String optionOne = "(1) Register";
    public String optionTwo = "(2) Login";

    // PLACEHOLDER VARIABLES
    private String username;
    private String password;
    private String passwordmatcher;
    private String newUser;
    private boolean exist = false;

    // NEW USER REGISTRATION
    void registerUser() {
        Scanner sc = new Scanner(System.in);

        // GREETING AND PROMPT
        System.out.println(bar);
        System.out.println("REGISTRATION PAGE\n");
        System.out.print("Username: ");
        username = sc.nextLine();
        System.out.print("Password: ");
        password = sc.nextLine();
        System.out.print("Re-enter password: ");
        passwordmatcher = sc.nextLine();

        newUser = "\n" + username + " " + password;

        // CHECKS IF USER EXISTS
        try {
            FileReader records = new FileReader(
                    "/home/daniel/Documents/03_programming_projects/Java_OOP_Projects/OOP_Project_6/records.txt");

            BufferedReader read = new BufferedReader(records);

            String userChecker;

            while ((userChecker = read.readLine()) != null) {
                String[] sep = userChecker.split(" ");
                if (username.equals(sep[0])) {
                    exist = true;
                }
            }

            read.close();

        } catch (Exception e) {

        }

        // CHECKS IF CONDITIONS ARE MET
        if (password.equals(passwordmatcher) && password.length() >= 8 && exist == false
                && password.matches("^[a-zA-Z0-9]+$") && username.matches("^[a-zA-Z0-9._]+$")) {
            try {
                FileWriter records = new FileWriter(
                        "/home/daniel/Documents/03_programming_projects/Java_OOP_Projects/OOP_Project_6/records.txt",
                        true);
                BufferedWriter write = new BufferedWriter(records);

                write.append(newUser);
                write.flush();

                System.out.println("\nUser registered successfully");
                write.close();

            } catch (Exception e) {

            }

        } else if (exist == true) {
            System.out.println("\nUsername is not available");
        } else if (!username.equals("^[a-zA-Z0-9._]+$")) {
            System.out.println("\nUsername cannot contain spaces");
        } else if (!password.equals(passwordmatcher)) {
            System.out.println("\nSorry, the password you entered does not match");
        } else if (password.length() < 8) {
            System.out.println("\nPassword must be 8 or more characters");
        } else if (!password.matches("^[a-zA-Z0-9]+$")) {
            System.out.println("\nPassword cannot contain symbols");
        }
        sc.close();
        System.out.println(bar);
    }

    // USER LOGIN
    void loginUser() {
        Scanner sc = new Scanner(System.in);

        // GREETING AND PROMPT
        System.out.println(bar);
        System.out.println("LOGIN PAGE\n");
        System.out.print("Username: ");
        username = sc.nextLine();
        System.out.print("Password: ");
        password = sc.nextLine();

        // CHECKS IF ENTERED CREDENTIALS ARE CORRECT
        try {
            FileReader records = new FileReader(
                    "/home/daniel/Documents/03_programming_projects/Java_OOP_Projects/OOP_Project_6/records.txt");

            BufferedReader read = new BufferedReader(records);

            String holder;

            while ((holder = read.readLine()) != null) {
                String[] sep = holder.split(" ");

                if (sep[0].equals(username) && sep[1].equals(password)) {
                    System.out.println("\nLogged in successfully");
                }

            }

            read.close();

        } catch (Exception ex) {

        }
        sc.close();
        System.out.println(bar);
    }
}
