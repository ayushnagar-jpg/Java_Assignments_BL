
import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("Is the first number the smallest? " + (num1 < num2 && num1 < num3));
        scanner.close();
    }
}
