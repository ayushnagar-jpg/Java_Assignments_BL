
import java.util.Scanner;

public class EmployeeBonus {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter years of service: ");
        int years = scanner.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Your bonus amount is: INR " + bonus);
        } else {
            System.out.println("No bonus. Work for more than 5 years to be eligible.");
        }
        scanner.close();
    }
}

    

