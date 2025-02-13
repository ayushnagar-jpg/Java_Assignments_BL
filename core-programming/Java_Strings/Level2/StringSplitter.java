import java.util.Scanner;

public class StringSplitter {
    public static String[] splitWords(String str) {
        int wordCount = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') wordCount++; 
        }

        String[] words = new String[wordCount];
        int start = 0, index = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                words[index++] = str.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = str.substring(start); 

        return words;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] customWords = splitWords(input);

        String[] builtInWords = input.split(" ");

        System.out.println("\nCustom Split Words: " + String.join(", ", customWords));
        System.out.println("Built-in Split Words: " + String.join(", ", builtInWords));
        System.out.println("Are they equal? " + java.util.Arrays.equals(customWords, builtInWords));

        scanner.close();
    }
}
