
    import java.util.Scanner;

public class TriangleParkRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user input for the three sides of the triangular park
        System.out.print("Enter the length of side 1 (meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 (meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 (meters): ");
        double side3 = scanner.nextDouble();

        // Step 2: Calculate the perimeter of the triangle
        double perimeter = calculatePerimeter(side1, side2, side3);

        // Step 3: Calculate the number of rounds needed
        int rounds = calculateRounds(perimeter);

        // Step 4: Display the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");

        scanner.close();
    }

    // Method to calculate the perimeter of the triangular park
    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    // Method to calculate the number of rounds required to cover 5 km (5000 meters)
    public static int calculateRounds(double perimeter) {
        return (int) Math.ceil(5000 / perimeter); // Rounds up to the nearest whole number
    }
}


