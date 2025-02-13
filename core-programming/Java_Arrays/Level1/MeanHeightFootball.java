
import java.util.Scanner;

public class MeanHeightFootball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the height (in cm) of 11 football players:");
        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i]; 
        }

        double meanHeight = sum / 11;

        System.out.println("\nMean Height of the Football Team: " + meanHeight + " cm");

        scanner.close();
    }
}

