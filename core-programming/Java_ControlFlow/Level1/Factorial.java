
import java.util.Scanner;

public class Factorial {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        long fact = 1;
        int i = 1;

        while (i <= n) {
            fact *= i;
            i++;
        }

        System.out.println("The factorial of " + n + " is " + fact);
        scanner.close();
    }
}

    

