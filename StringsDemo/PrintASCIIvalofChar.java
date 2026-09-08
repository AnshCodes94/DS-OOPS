import java.util.Scanner;

public class PrintASCIIvalofChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i=0; i<s.length(); i++){
            System.out.print(s.charAt(i) + " = " + (int)s.charAt(i));
        
        // Print a comma and space if it's not the last character
            if (i < s.length() - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println(); // Move to the next line at the end
    
        sc.close();
    }
}
