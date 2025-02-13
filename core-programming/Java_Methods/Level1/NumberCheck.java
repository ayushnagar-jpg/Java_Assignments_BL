
    import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Call the method and store the result
        int result = checkNumber(number);

        // Step 3: Display the result based on return value
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }

    // Method to check if a number is positive, negative, or zero
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1; // Positive number
        } else if (num < 0) {
            return -1; // Negative number
        } else {
            return 0; // Zero
        }
    }
}


