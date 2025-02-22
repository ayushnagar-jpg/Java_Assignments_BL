import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int low = 1, high = 100, guess;
        String response;
        
        System.out.println("Think of a number between 1 and 100.");
        
        do {
            guess = random.nextInt(high - low + 1) + low;
            System.out.println("Is it " + guess + "? (high/low/correct)");
            response = scanner.nextLine().toLowerCase();
            
            if (response.equals("high")) {
                high = guess - 1;
            } else if (response.equals("low")) {
                low = guess + 1;
            }
        } while (!response.equals("correct"));
        
        System.out.println("Great! The number was " + guess);
        scanner.close();
    }
}
