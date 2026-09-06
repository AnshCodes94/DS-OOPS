import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose an option:");
        System.out.println("1. int to String");
        System.out.println("2. int to Hex");
        System.out.println("3. int to Binary");
        System.out.println("4. int to Octal");
        System.out.println("5. String to int");
        System.out.println("6. String to double");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Enter an integer: ");
                int value = sc.nextInt();
                if (choice == 1) {
                    String s = String.valueOf(value);
                    System.out.println("String value: " + s);
                } else if (choice == 2) {
                    System.out.println("Hex value: " + Integer.toHexString(value));
                } else if (choice == 3) {
                    System.out.println("Binary value: " + Integer.toBinaryString(value));
                } else if (choice == 4) {
                    System.out.println("Octal value: " + Integer.toOctalString(value));
                }
                break;
            case 5:
            case 6:
                System.out.println("Enter a string: ");
                String s = sc.next();
                if (choice == 5) {
                    int parsedInt = Integer.parseInt(s);
                    System.out.println("Parsed int: " + parsedInt);
                } else {
                    double parsedDouble = Double.parseDouble(s);
                    System.out.println("Parsed double: " + parsedDouble);
                }
                break;
            default:
                System.out.println("Invalid option!");
        }
        sc.close();
    }
}
