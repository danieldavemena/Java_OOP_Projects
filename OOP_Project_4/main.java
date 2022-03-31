import java.util.*;

public class main {

    private static String[] questionnaires = {
        "1.) If x = 10, what is the value of f(x) = x^2." + 
        "\na.) 7" + "\nb.) 1" + "\nc.) 4" + "\nAnswer: ", 
        "2.) Find the slope of points (0, 3) and (4, 0)."+ 
        "\na.) 9" + "\nb.) -3/4" + "\nc.) 1/2" + "\nAnswer: ", 
        "3.) What is the average speed to a that has a displacement of 5m at time 10s from rest?" + 
        "\na.) 5m/s" + "\nb.) 1/2m/s" + "\nc.) 3/7m/s" + "\nAnswer: ", 
        "4.) What is do you call the symbol ∑?" + 
        "\na.) Summation" + "\nb.) Sigma" + "\nc.) Addition" + "\nAnswer: ",
        "5.) If a = b, is b = a?" + 
        "\na.) No" + "\nb.) Yes" + "\nc.) Maybe" + "\nAnswer: ",
        "6.) What is the sentence form equivalent of logical operator V?" + 
        "\na.) Or" + "\nb.) And" + "\nc.) Not" + "\nAnswer: ",
        "7.) What do you call the letters that is used to represent numbers" + 
        "\na.) Replacer" + "\nb.) Variable" + "\nc.) Constant" + "\nAnswer: ",
        "8.) In the even that a car with 50N of force is exerted to a car going in the opposite direction with a 50N of force, what will be the final force of the two cars?" + 
        "\na.) 1N" + "\nb.) 2N" + "\nc.) 0N" + "\nAnswer: ",
        "9.) How much would a $500 jacket cost if if has a 40% discount?" + 
        "\na.) $398" + "\nb.) $234" + "\nc.) $300" + "\nAnswer: ",
        "10.) 5 - 5 % 5 x 5 + 5" + 
        "\na.) 5" + "\nb.) 0" + "\nc.) Undefined" + "\nAnswer: "};
        
    private static String[] userAns = new String[questionnaires.length];
    private static String[] ansContainer = new String[questionnaires.length];
    private static String[] answerKey = {"c", "b", "b", "a", "b", "a", "b", "c", "c", "a"};
    private static int scoreCount;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Math Quiz Bee!");
    
        for(int i=0; i<questionnaires.length; i++) {
            try {
                System.out.print(questionnaires[i]);
                userAns[i] = sc.nextLine();
                ansContainer[i] = userAns[i].toLowerCase();

                if((ansContainer[i].equals("a") || 
                ansContainer[i].equals("b") || 
                ansContainer[i].equals("c")) && 
                ansContainer[i].equals(answerKey[i])) {
                    scoreCount++;
                    System.out.println("Correct!\n");
                } else if ((ansContainer[i].equals("a") || 
                ansContainer[i].equals("b") || 
                ansContainer[i].equals("c")) && ansContainer[i] != answerKey[i]) {
                    System.out.println("Incorrect!\n");
                } else {
                    throw new InputMismatchException();
                }
            } catch(InputMismatchException e) {
                System.out.println("Invalid input!\n");
            }
        } 

        System.out.printf("Your score is %s!\n", scoreCount);
    }  
    
}