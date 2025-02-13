import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateException(String str, int start, int end) {
        System.out.println(str.substring(end, start)); 
    }

    public static void handleException(String str, int start, int end) {
        try {
            System.out.println(str.substring(end, start));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        handleException(text, start, end);

        scanner.close();
    }
}

