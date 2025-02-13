
import java.util.Scanner;
public class Countdownn {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter countdown start number: ");
        int count = scanner.nextInt();
        
        for (int i = count; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Liftoff!");
        scanner.close();
    }
}

    

