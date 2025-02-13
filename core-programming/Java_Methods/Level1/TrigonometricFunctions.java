
    import java.util.Scanner;

public class TrigonometricFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get user input for the angle in degrees
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();

        // Step 2: Calculate trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);

        // Step 3: Display the results
        System.out.printf("sin(%.2f°) = %.5f\n", angle, results[0]);
        System.out.printf("cos(%.2f°) = %.5f\n", angle, results[1]);
        
        // Check for undefined tangent cases (90°, 270°)
        if (Math.abs(results[1]) < 1e-10) {
            System.out.printf("tan(%.2f°) is undefined\n", angle);
        } else {
            System.out.printf("tan(%.2f°) = %.5f\n", angle, results[2]);
        }

        scanner.close();
    }

    // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert angle to radians

        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);

        return new double[]{sinValue, cosValue, tanValue};
    }
}


