
    import java.util.Scanner;

    public class VotingEligibility {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] ages = new int[10]; 
    
            for (int i = 0; i < ages.length; i++) {
                System.out.print("Enter the age of student " + (i + 1) + ": ");
                ages[i] = scanner.nextInt();
            }
    
            System.out.println("\nVoting Eligibility Results:");
          
            for (int age : ages) {
                if (age < 0) {
                    System.out.println("Invalid age entered.");
                } else if (age >= 18) {
                    System.out.println("The student with the age " + age + " can vote.");
                } else {
                    System.out.println("The student with the age " + age + " cannot vote.");
                }
            }
    
            scanner.close();
        }
    }
     

