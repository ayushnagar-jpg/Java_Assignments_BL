import java.util.Scanner;

public class QuadraticEquationSolver {

    public static void findRoots(double a, double b, double c) {
        
        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0) {
            
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has two real roots: ");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (delta == 0) {
           
            double root = -b / (2 * a);
            System.out.println("The equation has one real root: " + root);
        } else {
           
            System.out.println("The equation has no real roots (complex roots exist).");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Not a valid quadratic equation. 'a' cannot be zero.");
        } else {
            findRoots(a, b, c); 
        }

        scanner.close();
    }
}
