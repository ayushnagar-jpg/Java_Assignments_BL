import java.util.*;
public class YoungTallFriend {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Friend names
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Arrays to store age and height
        int[] ages = new int[3];
        double[] heights = new double[3];

        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter height of " + friends[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }

        int minAge = ages[0];
        String youngestFriend = friends[0];

        double maxHeight = heights[0];
        String tallestFriend = friends[0];

        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestFriend = friends[i];
            }

            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestFriend = friends[i];
            }
        }

        System.out.println("\nThe youngest friend is " + youngestFriend + " with age " + minAge + " years.");
        System.out.println("The tallest friend is " + tallestFriend + " with height " + maxHeight + " cm.");

        scanner.close();
    }
}


