
    import java.util.Scanner;

public class HandshakeCalculato{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user input for number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Step 2: Calculate handshakes using the method
        int maxHandshakes = calculateHandshakes(n);

        // Step 3: Display the result
        System.out.println("The maximum number of handshakes possible among " + n + " students is: " + maxHandshakes);

        scanner.close();
    }

    // Method to calculate the maximum number of handshakes using the formula
    public static int calculateHandshakes(int n) {
        if (n < 2) {
            return 0; // No handshake possible if there is 1 or no student
        }
        return (n * (n - 1)) / 2;
    }
}



