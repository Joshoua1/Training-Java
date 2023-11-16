import java.util.Scanner;

public class range {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("");
            int start = scanner.nextInt();
            System.out.print("");
            int end = scanner.nextInt();
            System.out.print("");
            int v = scanner.nextInt();

            int count = 0;
            for (int i = start; i <= end; i++) {
                if (i % v == 0) {
                    count++;
                }
            }

            System.out.println(+ count);
        }
    }
}
