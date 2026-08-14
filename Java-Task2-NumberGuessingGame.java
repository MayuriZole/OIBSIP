package inershiop_package;
import java.util.Random;
import java.util.Scanner;
 
/**
 * OIBSIP - Java Development Track
 * Task 2: Number Guessing Game
 *
 * The system generates a random number and the user tries to guess it,
 * receiving Too High / Too Low / Correct hints until they succeed or
 * run out of attempts. Supports multiple rounds and difficulty levels.
 */
public class NumberGuessingGame {
 
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
 
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("      WELCOME TO THE NUMBER GUESSING GAME       ");
        System.out.println("=================================================");
 
        int round = 1;
        boolean playAgain = true;
 
        while (playAgain) {
            System.out.println("\n----- Round " + round + " -----");
            playRound(round);
            round++;
 
            System.out.print("\nDo you want to play again? (yes/no): ");
            String answer = scanner.nextLine().trim().toLowerCase();
            playAgain = answer.equals("yes") || answer.equals("y");
        }
 
        System.out.println("\nThanks for playing! Goodbye.");
        scanner.close();
    }
 
    /**
     * Runs a single round of the game: picks a difficulty, generates the
     * number, and loops until the user guesses correctly or runs out of
     * attempts.
     */
    private static void playRound(int roundNumber) {
        int[] rangeAndAttempts = chooseDifficulty();
        int lowerBound = 1;
        int upperBound = rangeAndAttempts[0];
        int maxAttempts = rangeAndAttempts[1];
 
        int target = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;
        boolean guessedCorrectly = false;
 
        System.out.println("I'm thinking of a number between " + lowerBound
                + " and " + upperBound + ". You have " + maxAttempts + " attempts.");
 
        while (attempts < maxAttempts) {
            System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + " - Enter your guess: ");
            String input = scanner.nextLine().trim();
 
            int guess;
            try {
                guess = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("That's not a valid number. Please try again.");
                continue; // Doesn't consume an attempt
            }
 
            attempts++;
 
            if (guess < lowerBound || guess > upperBound) {
                System.out.println("Please guess a number within the given range.");
            } else if (guess < target) {
                System.out.println("Too Low!");
            } else if (guess > target) {
                System.out.println("Too High!");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                guessedCorrectly = true;
                break;
            }
        }
 
        if (!guessedCorrectly) {
            System.out.println("You Lost! The number was: " + target);
        }
 
        System.out.println("Round " + roundNumber + " summary — "
                + (guessedCorrectly ? "guessed in " + attempts + " attempts" : "not guessed (out of attempts)"));
    }
 
    /**
     * Lets the user pick a difficulty level and returns the corresponding
     * {upperBound, maxAttempts} pair.
     */
    private static int[] chooseDifficulty() {
        System.out.println("\nChoose a difficulty level:");
        System.out.println("1. Easy   (1-50, 10 attempts)");
        System.out.println("2. Medium (1-100, 7 attempts)");
        System.out.println("3. Hard   (1-200, 5 attempts)");
 
        while (true) {
            System.out.print("Enter choice (1/2/3): ");
            String choice = scanner.nextLine().trim();
 
            switch (choice) {
                case "1":
                    return new int[]{50, 10};
                case "2":
                    return new int[]{100, 7};
                case "3":
                    return new int[]{200, 5};
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}
 
