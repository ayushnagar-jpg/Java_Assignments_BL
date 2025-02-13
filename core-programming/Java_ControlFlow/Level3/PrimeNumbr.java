
import java.util.*;

public class PrimeNumbr {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number:");
        int num = sc.nextInt();
       
        if(num<=1){
            System.out.println(num + " is not a prime Number");
        }else{
            boolean isPrime = true;

            for(int i=2;i<num;i++){
                if(num % i == 0){
                    isPrime = false;
                    break;  
                }
            }
            if(isPrime){
                System.out.println(num+ " is a PrimeNumber ");
            }else{
                System.out.println(num+" is not a PrimeNumber");
            }
        }
        
        sc.close(); 
    }
   // sc.close();
}
