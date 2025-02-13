
import java.util.Scanner;
public class Find {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int age1 = scanner.nextInt();
        System.out.print("Enter height of Amar: ");
        int height1 = scanner.nextInt();

        System.out.print("Enter age of Akbar: ");
        int age2 = scanner.nextInt();
        System.out.print("Enter height of Akbar: ");
        int height2 = scanner.nextInt();

        System.out.print("Enter age of Anthony: ");
        int age3 = scanner.nextInt();
        System.out.print("Enter height of Anthony: ");
        int height3 = scanner.nextInt();

        int youngest = Math.min(age1, Math.min(age2, age3));
        int tallest = Math.max(height1, Math.max(height2, height3));

        System.out.println("Youngest friend is " + youngest + " years old.");
        System.out.println("Tallest friend is " + tallest + " cm tall.");
        scanner.close();
    }
}


