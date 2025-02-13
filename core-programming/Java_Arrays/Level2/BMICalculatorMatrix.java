import java.util.Scanner;
public class BMICalculatorMatrix {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPersons = 0;

        // Step 1: Validate number of persons input
        while (true) {
            try {
                System.out.print("Enter the number of persons: ");
                numPersons = Integer.parseInt(scanner.nextLine());

                if (numPersons <= 0) {
                    System.out.println("Please enter a positive integer.");
                } else {
                    break; // Valid input, exit loop
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }

        // Step 2: Create a multi-dimensional array to store weight, height, and BMI
        double[][] personData = new double[numPersons][3]; // [person][0=weight, 1=height, 2=BMI]
        String[] weightStatus = new String[numPersons];

        // Step 3: Take input for weight and height of each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");

            // Input weight (must be positive)
            personData[i][0] = getValidDouble(scanner, "Enter weight (kg): ");

            // Input height (must be positive)
            personData[i][1] = getValidDouble(scanner, "Enter height (m): ");

            // Step 4: Calculate BMI and store it
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Step 5: Determine weight status and store it
            weightStatus[i] = getWeightStatus(personData[i][2]);
        }

        // Step 6: Display the results
        System.out.println("\nBMI Report:");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", 
                personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

        scanner.close(); // Close the scanner
    }

    // Function to get a valid positive double input
    private static double getValidDouble(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double value = Double.parseDouble(scanner.nextLine());

                if (value <= 0) {
                    System.out.println("Please enter a positive number.");
                } else {
                    return value; // Valid input
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
    }

    // Function to determine weight status based on BMI
    private static String getWeightStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }
}


