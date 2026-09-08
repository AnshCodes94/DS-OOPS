import java.util.Scanner;

public class Palindrome { // Fixed the double 'l' typo in the class name too!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ori = n;
        
        // We catch the returned reversed value from the method call here
        int rev = isPalindrome(n); 
        
        if (ori == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not");
        }

        sc.close();
    }
    
    // Changed return type from 'void' to 'int'
    public static int isPalindrome(int n) {
        int rev = 0; // Declared safely inside the method scope
        int rem;
        
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        
        return rev; // Send the fully reversed number back to main
    }
}