// Q2. write a java program to print series of the number 2,4,4,8,6,12,8,..............

import java.util.Scanner;

public class series {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of terms: ");
            int n = scanner.nextInt();

            int prev = 2;
            int curr = 4;

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    System.out.print(prev + " ");
                    prev = curr;
                } else {
                    System.out.print(curr + " ");
                    curr = curr * 2;
                }
            }
        }

        System.out.println();
    }
}


