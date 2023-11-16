
import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number:");
            int num = sc.nextInt();
            int temp = num;
            int sum = 0;


            while (temp > 0){
                int digit = temp % 10;
                sum += (digit * digit * digit);
                temp /= 10;
            }
   if(num == sum){
            System.out.println("The number is amstrong");
   }else{
            System.out.println("The number is not amstrong");
   }
        }
}
}
