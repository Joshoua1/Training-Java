// // Q5.Write a java program to check wether the number is prfect or not.

// import java.util.Scanner;

// public class perfect {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int num,sum = 0;
//         System.out.print("Enter a number: ");
//         num = input.nextInt();
//         input.close();
//         for(int i = 1; i<= num/2; i++){
//             if(num%i == 0){
//                 sum += i;
//             }
//         }
//     if (sum == num){
//         System.out.println(num + " is a perfect number");
//     }else{
//         System.out.println(num + " is not a perfect number");
//     }
// }
// }
public class perfect {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            if (isPerfect(i)) {
                System.out.println(i + " is a perfect number.");
            } else {
                System.out.println(i + " is not a perfect number.");
            }
        }
    }

    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}