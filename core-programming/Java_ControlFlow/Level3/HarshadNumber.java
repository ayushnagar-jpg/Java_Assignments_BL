
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        sc.close();
        int temp = num;
        int sum =0;
        while(temp!=0){
            sum+=temp%10;
            temp/=10;
        }
        if(num % sum==0){
            System.out.println(num + " is a HarshadNumber");
        }else{
            System.out.println(num + " 25is not a Harshad Number");
        }

    }
}
