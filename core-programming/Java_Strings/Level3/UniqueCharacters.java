import java.util.Scanner;

public class UniqueCharacters {
    // Method to find the length of the text without using length()
    public static int getLength(String text) {
        int length = 0;
        try {
            while (text.charAt(length) != '\0') {
                length++;
            }
        } catch (Exception e) {
            return length;
        }
        return length;
    }

    // Method to find unique characters
    public static char[] findUniqueCharacters(String text) {
        int length = getLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }

        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        char[] uniqueChars = findUniqueCharacters(text);
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        scanner.close();
    }
}

