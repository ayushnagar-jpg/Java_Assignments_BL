import java.util.Scanner;

public class EuclideanDistanceAndLineEquation {

    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        double[] equation = new double[2];

        if (x1 == x2) {
            System.out.println("Vertical line: Equation is x = " + x1);
            return null; 
        }
        double m = (double) (y2 - y1) / (x2 - x1);

        double b = y1 - m * x1;

        equation[0] = m;
        equation[1] = b;
        return equation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter y1: ");
        int y1 = scanner.nextInt();
        System.out.print("Enter x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y2: ");
        int y2 = scanner.nextInt();
        scanner.close();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f\n", distance);

        double[] equation = findLineEquation(x1, y1, x2, y2);
        if (equation != null) {
            System.out.printf("Equation of the Line: y = %.2fx + %.2f\n", equation[0], equation[1]);
        }
    }
}


