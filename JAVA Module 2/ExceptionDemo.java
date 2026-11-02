import java.util.*;

class WrongInputException extends RuntimeException {
    public WrongInputException(String message) {
        super(message);
    }
}

public class ExceptionDemo {
    public static int[] readIntegers(Scanner sc) throws WrongInputException {
        int[] a = new int[3];
        try {
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            a[2] = sc.nextInt();
        } catch (Exception e) {
            throw new WrongInputException("Invalid input");
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] a = readIntegers(sc);
            System.out.println(Arrays.toString(a));
        } catch (WrongInputException e) {
            System.out.println(e.getMessage());
        } 
        readIntegers(sc);
        sc.close();
    }
}
