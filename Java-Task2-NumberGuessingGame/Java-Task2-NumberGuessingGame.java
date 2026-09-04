package inershiop_package;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalRounds = 0;
        String playAgain = "yes";

        System.out.println("=================================");
        System.out.println("   WELCOME TO NUMBER GUESSING GAME");
        System.out.println("=================================");

        while (playAgain.equalsIgnoreCase("yes")) {

            int randomNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 7;
            boolean guessedCorrectly = false;

            totalRounds++;

            System.out.println("\nRound " + totalRounds);
            System.out.println("Guess a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {

                System.out.print("\nEnter your guess: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a number.");
                    scanner.next();
                    continue;
                }

                int guess = scanner.nextInt();
                attempts++;

                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                    attempts--;
                    continue;
                }

                if (guess > randomNumber) {
                    System.out.println("Too High!");

                } else if (guess < randomNumber) {
                    System.out.println("Too Low!");

                } else {
                    System.out.println("\nCorrect! Congratulations!");
                    System.out.println("You guessed the number in "
                            + attempts + " attempts.");

                    guessedCorrectly = true;
                    break;
                }
            }

            if (!guessedCorrectly) {
                System.out.println("\nYou Lost!");
                System.out.println("The correct number was: "
                        + randomNumber);
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = scanner.next();

            System.out.println("---------------------------------");
        }

        System.out.println("\nGame Over!");
        System.out.println("Total Rounds Played: " + totalRounds);
        System.out.println("Thank you for playing!");

        scanner.close();
    }
}
