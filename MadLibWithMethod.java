import java.util.Scanner; // Import Scanner for user input

public class MadLibWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for words
        System.out.print("Enter an animal: ");
        String animal = scanner.nextLine();

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter a direction: ");
        String direction = scanner.nextLine();

        // Call the method with user input
        createMadLib(animal, number, direction);

        scanner.close(); // Close scanner
    }

    // Method to display the Mad Lib story
    public static void createMadLib(String animal, int number, String direction) {
        System.out.println("\nHere is your Mad Lib story:\n");
        System.out.println("Hickory Dickory Dock.");
        System.out.println("The " + animal + " ran up the clock.");
        System.out.println("The clock struck " + number + ".");
        System.out.println("The " + animal + " ran " + direction + ".");
        System.out.println("Hickory Dickory Dock.");
    }
}
