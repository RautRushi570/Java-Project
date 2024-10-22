import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 6;


        int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
        int attemptsLeft = maxAttempts;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + minRange + " and " + maxRange + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess the number.");


        while (attemptsLeft > 0) {
            System.out.print("Enter your guess: ");
            int playerGuess = scanner.nextInt();
            attemptsLeft--;

            if (playerGuess == numberToGuess) {
                System.out.println("Congratulations! You've guessed the number correctly.");
                break;
            } else if (playerGuess < numberToGuess) {
                System.out.println("Too Low! You have " + attemptsLeft + " attempts left.");
            } else {
                System.out.println("Too High! You have " + attemptsLeft + " attempts left.");
            }


            if (attemptsLeft == 0) {
                System.out.println("Sorry, you've run out of attempts. The number was " + numberToGuess + ".");
            }
        }


        scanner.close();
        System.out.println("Thank you for playing!");
    }
}