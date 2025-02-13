import java.util.Random;

public class VotingEligibility {
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(30) + 10; 
        }
        return ages;
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        System.out.println("\nStudent | Age | Can Vote?");
        System.out.println("-------------------------");
        for (int i = 0; i < ages.length; i++) {
            System.out.printf("%7d | %3d | %s%n", i + 1, ages[i], ages[i] >= 18 ? "Yes" : "No");
        }
    }
}
