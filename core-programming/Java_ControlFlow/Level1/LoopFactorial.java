
import java.util.Scanner;

public class LoopFactorial {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("The factorial of " + n + " is " + fact);
        scanner.close();
    }
}

    

