
import java.util.Scanner;

public class Calc{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        double sum = number1 + number2;
        double difference = number1 - number2;
        double product = number1 * number2;
        double quotient = number1 / number2;

        System.out.println("The addition, subtraction, multiplication and division value of two numbers " + number1 + 
                           " and " + number2 + " is " + sum + ", " + difference + ", " + product + ", and " + quotient);
        input.close();
    }
}
