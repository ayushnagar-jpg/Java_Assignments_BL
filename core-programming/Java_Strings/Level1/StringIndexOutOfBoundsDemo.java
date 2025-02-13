import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void generateException(String str) {
        System.out.println(str.charAt(str.length())); 
    }

    public static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();

        handleException(text);

        scanner.close();
    }
}
