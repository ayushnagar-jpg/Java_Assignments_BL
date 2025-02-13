
    
    import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] multiplicationResult = new int[4]; 

       
        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (i + 6);
        }

        System.out.println("\nMultiplication Table of " + number + " (from 6 to 9):");
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }

        scanner.close();
    }
}


