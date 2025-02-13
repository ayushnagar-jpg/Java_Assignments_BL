
    import java.util.Scanner;

public class NumberChecker {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is a Neon number
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    // Method to check if a number is a Spy number
    public static boolean isSpy(int num) {
        int sum = 0, product = 1, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an Automorphic number
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        return square % (int) Math.pow(10, String.valueOf(num).length()) == num;
    }

    // Method to check if a number is a Buzz number
    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Number: " + number);
        System.out.println("Is Prime? " + (isPrime(number) ? "Yes" : "No"));
        System.out.println("Is Neon Number? " + (isNeon(number) ? "Yes" : "No"));
        System.out.println("Is Spy Number? " + (isSpy(number) ? "Yes" : "No"));
        System.out.println("Is Automorphic Number? " + (isAutomorphic(number) ? "Yes" : "No"));
        System.out.println("Is Buzz Number? " + (isBuzz(number) ? "Yes" : "No"));
    }
}


