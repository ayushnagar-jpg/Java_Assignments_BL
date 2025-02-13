
    import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        // Step 2: Create arrays to store weight, height, BMI, and status
        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmiValues = new double[numPersons];
        String[] status = new String[numPersons];

        // Step 3: Take input for weight and height of each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");

            System.out.print("Enter weight (kg): ");
            weights[i] = scanner.nextDouble();

            System.out.print("Enter height (m): ");
            heights[i] = scanner.nextDouble();

            // Step 4: Calculate BMI
            bmiValues[i] = weights[i] / (heights[i] * heights[i]);

            // Step 5: Determine weight status
            if (bmiValues[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmiValues[i] >= 18.5 && bmiValues[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmiValues[i] >= 25.0 && bmiValues[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Step 6: Display the results
        System.out.println("\nBMI Report:");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", heights[i], weights[i], bmiValues[i], status[i]);
        }

        scanner.close(); // Close the scanner
    }
}


