
    import java.util.Scanner;

public class ArraySumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10]; 
        double total = 0.0; 
        int index = 0; 

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = scanner.nextDouble();

            if (num <= 0) {
                break;
            }

            if (index == 10) {
                System.out.println("Maximum limit of 10 numbers reached.");
                break;
            }

            numbers[index] = num;
            index++;
        }

        System.out.println("\nEntered Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i]; 
        }

        System.out.println("\n\nSum of all numbers: " + total);

        scanner.close();
    }
}

