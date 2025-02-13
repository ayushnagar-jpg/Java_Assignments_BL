import java.util.Scanner;
public class DigitCounter {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Number:");
       int Number = sc.nextInt();
       sc.close();

       int count = 0;
       int temp = Math.abs(Number);
       do{
        count++;
        temp /=10;
       }while(temp!=0);
       System.out.println("Number of digits: " + count);
    }
}
