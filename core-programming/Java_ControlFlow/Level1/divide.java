

import java.util.Scanner;

public class divide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0));
        scanner.close();
    }
}
