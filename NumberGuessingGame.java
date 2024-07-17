import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        boolean playAgain = true;
        
        while (playAgain) {
            int generatedNumber = random.nextInt(100) + 1;
            int guess;
            int attempts = 0;
            
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have generated a number between 1 and 100. Try to guess it!");

            do {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess < generatedNumber) {
                    System.out.println("Too low. Try again.");
                } else if (guess > generatedNumber) {
                    System.out.println("Too high. Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number " + generatedNumber + " correctly in " + attempts + " attempts.");
                }
            } while (guess != generatedNumber);

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next();

            if (!playAgainInput.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}