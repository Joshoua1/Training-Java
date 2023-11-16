// Q6. Write a java program to check wether number is palindrome or not.

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            int num = input.nextInt();
            int reversedNum = 0,remainde;
            int originalNum = num;
            while (num!= 0) {
                remainde = num % 10;
                reversedNum = reversedNum * 10 + remainde;
                num = num / 10;
            }
            if(originalNum == reversedNum){
                System.out.println(originalNum+ " Is a palindrome");
            }else{
                System.out.println(originalNum+ " Is not a palindrome");
            }
        }
    }
}
