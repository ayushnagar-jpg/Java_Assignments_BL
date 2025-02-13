import java.util.Scanner;

public class ConvertToUpper {
    public static String toUpperCaseCustom(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String customUpper = toUpperCaseCustom(text);
        String builtInUpper = text.toUpperCase();

        System.out.println("Custom Uppercase: " + customUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Are they equal? " + customUpper.equals(builtInUpper));

        scanner.close();
    }
}
