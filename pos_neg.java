// Write a program to check wether the number is positive negative or 0

import java.util.Scanner;

public class pos_neg {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            if(n>0){
                System.out.println("Positive");
            }else if(n<0){
                System.out.println("Negative");
            }else{
                System.out.println("Zero");
            }
        }
    }
    
}