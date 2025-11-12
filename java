import java.util.Scanner; // Import the Scanner class to read user input

public class NumberChecker {

    // A method to check if a number is positive
    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt(); // Read user input as an integer

        // Use the isPositive method in an if-else block
        if (isPositive(userInput)) {
            System.out.println(userInput + " is a positive number.");
        } else {
            System.out.println(userInput + " is a non-positive number.");
        }

        scanner.close(); // Close the scanner
    }
}

