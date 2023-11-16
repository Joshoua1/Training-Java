// Q1. Write a java program ro check wether the number is neon number or not


import java.util.Scanner;

public class neon_number{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number:");
            int number = scanner.nextInt();

            int square = number * number;

            int sum = 0;
            while (square != 0) {
                sum += square % 10;
                square /= 10;
            }   
            
            if (sum == number){
                System.out.println(number + " is a neon number");
            }else {
                System.out.println(number + " is not a neon number");
            }
        }
    }
}
