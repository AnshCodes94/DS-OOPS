import java.util.Scanner;

public class Readint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop runs as long as the input is NOT an integer
        while (!scanner.hasNextInt()) {
            System.out.println("No");
            scanner.next(); // Discard invalid input to avoid an infinite loop
        }

        int number = scanner.nextInt();
        System.out.println("Output: " + number);

        scanner.close();
    }
}
