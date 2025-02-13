import java.util.Scanner;

public class ShortestLongestWord {
    public static String[] splitWords(String str) {
        return str.split(" ");
    }

    public static String findShortestWord(String[] words) {
        String shortest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length()) shortest = word;
        }
        return shortest;
    }

    public static String findLongestWord(String[] words) {
        String longest = words[0];
        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = splitWords(input);
        System.out.println("\nShortest Word: " + findShortestWord(words));
        System.out.println("Longest Word: " + findLongestWord(words));

        scanner.close();
    }
}
