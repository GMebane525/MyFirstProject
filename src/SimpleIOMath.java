import java.util.Scanner;
/**
 *
 * @version 10.03.22
 * @author 24mebane
 */
public class SimpleIOMath {
    private String name;
    private int age;
    private int favNumber;

    /**
     * A method of class SimpleIOMath
     * Gathers information from user and store it under a new data address
     */
    public void promptUser(){
        System.out.println("* Sit yourself down, take a seat *\n" +
                "* All you gotta do is repeat after me *");
        Scanner in = new Scanner(System.in);
        System.out.print("Question 1: What is your name? ");
        name = in.nextLine();
        System.out.print("Question 2: How old are you? ");
        age = in.nextInt();
        System.out.print("Question 3: What is your favorite number? ");
        favNumber = in.nextInt();
    }

    /**
     * A method of class SimpleIOMath
     * Prints information
     */
    public void printInfo(){
        System.out.println("I'm gonna teach you how to sing it out\n" +
                "Come on, come on, come on\n" +
                "Let me tell you what it's all about\n" +
                "Reading, writing, arithmetic\n" +
                "Are the branches of the learning tree");
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("At your next birthday, you will turn " + (age+1) + ".");
        System.out.println("The first prime factor of " + (age+1) + " is: " + smallestPrimeFactor(age+1));
        System.out.println("Your favorite number is: " + favNumber);
        System.out.println("Your favorite number squared is: " + (favNumber * favNumber));
        System.out.print("* end of program *");
    }

    private boolean isPrime(int num) {              //true of false statement
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0)
                    return false;
        }
        return true;
    }

    private int smallestPrimeFactor(int num) {
        for(int i = 2; i < Math.sqrt(num)+1; i++) {
            if(isPrime(i)) {
                if(num % i == 0)
                    return i;
            }
        }
        return num;
    }

    /**
     * Main method of class SimpleIOMath
     * @param args Command-line arguments, if needed.
     */
    public static void main(String[] args){
        SimpleIOMath app = new SimpleIOMath();
        app.promptUser();
        app.printInfo();
    }
}
