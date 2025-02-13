import java.util.Scanner;

public class SumofNaturalNumbers {
    

    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number (n > 0).");
            scanner.close();
            return;
        }

        int sumRecursion = sumUsingRecursion(n);

        int sumFormula = sumUsingFormula(n);

        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumRecursion == sumFormula) {
            System.out.println("Both methods give the same correct result! ✅");
        } else {
            System.out.println("Mismatch! Something went wrong. ❌");
        }

        scanner.close();
    }
}


