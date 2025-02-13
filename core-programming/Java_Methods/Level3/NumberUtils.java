
import java.util.Arrays;

public class NumberUtils {

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] extractDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int length = digits.length;
        int[] reversed = new int[length];

        for (int i = 0; i < length; i++) {
            reversed[i] = digits[length - i - 1];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int num) {
        int[] digits = extractDigits(num);
        int[] reversed = reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }
    public static boolean isDuckNumber(int num) {
        int[] digits = extractDigits(num);

        for (int i = 1; i < digits.length; i++) { 
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 1201;

        System.out.println("Number: " + number);
        System.out.println("Total Digits: " + countDigits(number));

        int[] digitsArray = extractDigits(number);
        System.out.println("Digits Array: " + Arrays.toString(digitsArray));

        int[] reversedArray = reverseDigits(digitsArray);
        System.out.println("Reversed Digits Array: " + Arrays.toString(reversedArray));

        System.out.println("Is Palindrome? " + (isPalindrome(number) ? "Yes" : "No"));
        System.out.println("Is Duck Number? " + (isDuckNumber(number) ? "Yes" : "No"));
    }
}


