
import java.util.*;

public class VotingEligiblity {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("The person's age is " + age + " and " + (age >= 18 ? "can vote." : "cannot vote."));
        scanner.close();
    }
}

    
