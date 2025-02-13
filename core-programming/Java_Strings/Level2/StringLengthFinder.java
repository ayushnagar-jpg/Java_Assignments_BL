import java.util.Scanner;

public class StringLengthFinder {
    
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;        
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

        int customLength = findLength(input);

        int builtInLength = input.length();

        System.out.println("\nCustom Length Calculation: " + customLength);
        System.out.println("Built-in Length Method: " + builtInLength);
        System.out.println("Are they equal? " + (customLength == builtInLength));

        scanner.close();
    }
}
