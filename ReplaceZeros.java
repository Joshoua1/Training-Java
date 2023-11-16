import java.util.Scanner;

public class ReplaceZeros {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = input.nextLine();
            str = str.replaceAll("0", "1");
            System.out.println("Result: " + str);
        }
    }
}