import java.util.Scanner;

public class NumberFormatDemo {
    public static void generateException(String str) {
        int number = Integer.parseInt(str); 
        System.out.println(number);
    }

    public static void handleException(String str) {
        try {
            int number = Integer.parseInt(str);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number as string: ");
        String text = scanner.next();

        handleException(text);

        scanner.close();
    }
}
