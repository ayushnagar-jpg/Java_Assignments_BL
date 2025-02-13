
import java.util.Scanner;
public class Sum {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0, num;
        
        do {
            System.out.print("Enter a number (0 to stop): ");
            num = scanner.nextDouble();
            sum += num;
        } while (num != 0);
        
        System.out.println("The total sum is " + sum);
        scanner.close();
    }
}

    
