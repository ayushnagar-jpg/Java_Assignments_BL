
import java.util.Scanner;
public class Rocket {
   


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter countdown start number: ");
        int count = scanner.nextInt();
        
        while (count >= 1) {
            System.out.println(count);
            count--;
        }
        System.out.println("Liftoff!");
        scanner.close();
    }
}

    

