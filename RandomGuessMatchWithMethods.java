import java.util.Scanner;

public class RandomGuessMatchWithMethods {
    public static void main(String[] args) {
        // Define MIN and MAX values
        final int MIN = 1;
        final int MAX = 10;

        // Generate a random number between MIN and MAX
        int randomValue = MIN + (int) (Math.random() * (MAX - MIN + 1));

        // Call method to get the user's guess
        int userGuess = getUserGuess(MIN, MAX);

        // Check if the guess is correct
        boolean isCorrect = (userGuess == randomValue);

        // Call method to display results
        displayResults(randomValue, userGuess, isCorrect);
    }

    // Method to ask user for a guess
    public static int getUserGuess(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between " + min + " and " + max + ": ");
        int guess = scanner.nextInt();
        scanner.close();
        return guess;
    }

    // Method to display results
    public static void displayResults(int randomValue, int userGuess, boolean isCorrect) {
        System.out.println("\nRandom Number: " + randomValue);
        System.out.println("Your Guess: " + userGuess);
        System.out.println("Correct Guess? " + isCorrect);
        System.out.println("Difference: " + Math.abs(randomValue - userGuess));
    }
}
