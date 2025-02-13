
import java.util.Scanner;

public class PalindromeCheck {
    // Method 1: Compare start and end characters
    public static boolean isPalindrome(String text) {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method 2: Recursion
    public static boolean isPalindromeRecursive(String text, int left, int right) {
        if (left >= right) return true;
        if (text.charAt(left) != text.charAt(right)) return false;
        return isPalindromeRecursive(text, left + 1, right - 1);
    }

    // Method 3: Using a Character Array
    public static boolean isPalindromeCharArray(String text) {
        char[] charArray = text.toCharArray();
        char[] reversed = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            reversed[i] = charArray[charArray.length - 1 - i];
        }

        return new String(charArray).equals(new String(reversed));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.println("Method 1: " + (isPalindrome(text) ? "Palindrome" : "Not a palindrome"));
        System.out.println("Method 2: " + (isPalindromeRecursive(text, 0, text.length() - 1) ? "Palindrome" : "Not a palindrome"));
        System.out.println("Method 3: " + (isPalindromeCharArray(text) ? "Palindrome" : "Not a palindrome"));

        scanner.close();
    }
}
