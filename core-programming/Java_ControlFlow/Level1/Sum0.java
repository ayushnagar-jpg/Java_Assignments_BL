
import java.util.Scanner;

public class Sum0 {
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0, num;
        
        while (true) {
            System.out.print("Enter a number (negative to stop): ");
            num = scanner.nextDouble();
            if (num <= 0) break;
            sum += num;
        }
        
        System.out.println("The total sum is " + sum);
        scanner.close();
    }
}

    

