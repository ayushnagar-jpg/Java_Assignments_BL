import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberAnalyzer {

    public static int[] findFactors(int num) {
        List<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorsList.add(i);
            }
        }
       
        return factorsList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int greatestFactor(int num) {
        int[] factors = findFactors(num);
        return factors[factors.length - 2]; 
    }

    public static int sumOfFactors(int num) {
        int sum = 0;
        for (int factor : findFactors(num)) {
            sum += factor;
        }
        return sum;
    }

    public static long productOfFactors(int num) {
        long product = 1;
        for (int factor : findFactors(num)) {
            product *= factor;
        }
        return product;
    }

    public static long productOfCubesOfFactors(int num) {
        long product = 1;
        for (int factor : findFactors(num)) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum > num;
    }

    public static boolean isDeficient(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum < num;
    }

    public static boolean isStrong(int num) {
        int temp = num, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to analyze: ");
        int number = scanner.nextInt();
        scanner.close();

        int[] factors = findFactors(number);

        System.out.println("\nFactors of " + number + ": " + java.util.Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor(number));
        System.out.println("Sum of Factors: " + sumOfFactors(number));
        System.out.println("Product of Factors: " + productOfFactors(number));
        System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(number));
        System.out.println("Is Perfect Number? " + (isPerfect(number) ? "Yes" : "No"));
        System.out.println("Is Abundant Number? " + (isAbundant(number) ? "Yes" : "No"));
        System.out.println("Is Deficient Number? " + (isDeficient(number) ? "Yes" : "No"));
        System.out.println("Is Strong Number? " + (isStrong(number) ? "Yes" : "No"));
    }
}


