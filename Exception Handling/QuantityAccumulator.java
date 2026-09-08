import java.util.*;

class InvalidQuantityException extends Exception {
    InvalidQuantityException(String message) {
        super(message);
    }
}

public class QuantityAccumulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> validValues = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            try {
                if (value < 0) {
                    throw new InvalidQuantityException("Invalid quantity: " + value);
                }
                validValues.add(value);
            } catch (InvalidQuantityException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.print("Valid quantities: ");
        if (validValues.isEmpty()) {
            System.out.println("None");
        } else {
            for(int val : validValues){
                System.out.print(val+" ");
            }
        }
        System.out.println();
        int sum = 0;
        for (int value : validValues) {
            sum += value;
        }
        System.out.println("Sum: " + sum);

        sc.close();
    }
}
