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

# This is a Python example of using consistent style
def calculate_total(price, quantity):
    """
    Calculates the total cost for a given price and quantity.
    """
    # Ensure price and quantity are numbers before calculation
    if isinstance(price, (int, float)) and isinstance(quantity, (int, float)):
        total = price * quantity
        return total
    else:
        return "Invalid input: price and quantity must be numbers."

# Example usage
item_price = 10.50
item_quantity = 3
print(f"The total cost is: {calculate_total(item_price, item_quantity)}")
