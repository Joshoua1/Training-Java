

import java.util.Scanner;

public class RabbitVisit {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the total number of steps: ");
            int distance = scanner.nextInt();
            int steps = (int) Math.ceil((double) distance / 5);
            System.out.println("The steps that rabbit took is: "+steps);
        }
    }
}
