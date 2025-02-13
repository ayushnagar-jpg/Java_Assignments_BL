import java.util.Scanner;

public class CharacterFrequency {
    public static int[] findFrequency(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        return frequency;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        int[] frequency = findFrequency(text);
        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + " : " + frequency[i]);
            }
        }
        scanner.close();
    }
}

