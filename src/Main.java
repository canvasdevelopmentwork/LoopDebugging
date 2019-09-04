import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String userInput;
        System.out.println("Please enter a word or enter nothing to quit: ");
        userInput = keyboard.nextLine();

        while (!userInput.equalsIgnoreCase("")) {
            System.out.println("Your word is "+userInput);
            System.out.println("Please enter a new word or enter nothing to quit: ");
            userInput = keyboard.nextLine();
        }

    }
}
