import java.util.Scanner;

public class ConvertToLower {
    
    public static String toLowerCaseCustom(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
           
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
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

        String customLower = toLowerCaseCustom(text);

        String builtInLower = text.toLowerCase();

        System.out.println("\nCustom Lowercase Conversion: " + customLower);
        System.out.println("Built-in Lowercase Conversion: " + builtInLower);

        System.out.println("Are they equal? " + customLower.equals(builtInLower));

        scanner.close();
    }
}
