import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight (in kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height (in cm): ");
        double heightCm = scanner.nextDouble();
        scanner.close();

        double heightM = heightCm / 100;

        double bmi = weight / (heightM * heightM);

        
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display result
        System.out.printf("Your BMI: %.2f\n", bmi);
        System.out.println("Status: " + status);
    }
}

