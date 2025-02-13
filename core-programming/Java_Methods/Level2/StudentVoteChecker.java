
    import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            System.out.println("Invalid age entered. Age cannot be negative.");
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10]; // Array to store the ages of 10 students

        // Taking user input for 10 students
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age for Student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        // Checking and displaying the voting eligibility
        System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < studentAges.length; i++) {
            boolean canVote = canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") is eligible to vote. ✅");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") is NOT eligible to vote. ❌");
            }
        }

        scanner.close();
    }
}


