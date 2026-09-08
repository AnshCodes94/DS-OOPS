import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDemos {
     public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x / y;
            System.out.println(z);
        }
        catch (InputMismatchException e) {
            System.out.println("please enter integer only");
        }
        catch (ArithmeticException e) {
            System.out.println("Divide bt zero is not allowed");
        }
        catch (Exception e) {
            System.out.println("some other exceptions");
            System.out.println(e.getMessage());
            System.out.println(e);
        }
        finally {
            System.out.println("Scanner close");
            sc.close();
        }
    }
}
