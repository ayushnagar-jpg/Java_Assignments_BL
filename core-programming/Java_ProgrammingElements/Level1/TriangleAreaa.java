
import java.util.Scanner;

public class TriangleAreaa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        double areaCm2 = 0.5 * base * height;
        double areaInches2 = areaCm2 / 6.45;  //1inch=2.54cm ,1sqinch= 2.5*2.5sqcm, 1inch2 =6.4516 cm2 
        

        System.out.println("The area of the triangle is " + areaCm2 + " cm² and " + areaInches2 + " in².");
        input.close();
    }
}
