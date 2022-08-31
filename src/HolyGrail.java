import java.util.Scanner;
/**
 * Class HolyGrail prints a conversation the computer has with a user.
 * @version 9/17/2022
 * @author 24mebane
 */

public class HolyGrail {
    /**
     * Main method for class HolyGrail
     * @param args Command-line arguments, if needed.
     */
    public static void main(String[] args) {

        /*
        Displays initial text
         */

        System.out.println("* A chat with the bridge keeper * " );
        System.out.println("Who would cross the Bridge of Death must answer me these\n" +
                "questions three, ere the other side he see.");

        Scanner in = new Scanner(System.in);            // Assigns new memory address for Scanner

        /*
        Asks main questions and records your answers
         */

        System.out.println("Question 1: What is your name? ");
        String name = in.nextLine();
        System.out.println("Question 2: What is your quest? ");
        String quest = in.nextLine();
        System.out.println("Question 3: What is your favorite color? ");
        String color = in.nextLine();

        /*
        Says King Author's line
         */

        System.out.println("King Arthur says, \"You have to know these things when you're a\n" + "king, you know.\"");

        /*
        Restates information to user
         */

        System.out.println("Your name is: " + name);
        System.out.println("Your quest is: " + quest);
        System.out.println("Your favorite color is: " + color);

        /*
        Displays end text
         */

        System.out.println("* end of program * ");

    }
}
