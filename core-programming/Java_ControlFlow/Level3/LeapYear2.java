
import java.util.Scanner;

public class LeapYear2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Invalid input! Leap year calculations apply only for years 1582 and onwards.");
        } else {
           

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("(Single if-statement) " + year + " is a Leap Year.");
            } else {
                System.out.println("(Single if-statement) " + year + " is not a Leap Year.");
            }
        }
        
        sc.close();
    }
}
