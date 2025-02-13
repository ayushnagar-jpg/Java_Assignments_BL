
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        int[] digits = getDigits(number);

        
        int[] frequency = new int[10]; 

        for (int digit : digits) {
            frequency[digit]++;
        }

        
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }

   
    private static int[] getDigits(long number) {
        String numStr = Long.toString(Math.abs(number)); 
        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        return digits;
    }
}


