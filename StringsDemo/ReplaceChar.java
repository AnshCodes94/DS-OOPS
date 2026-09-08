import java.util.*;

public class ReplaceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();

        String res = "";

        // [a-zA-Z0-9] matches any lowercase letter, uppercase letter, or digit
        //  String res = s.replaceAll("[a-zA-Z0-9]", "*");

        for (int i = 0; i < s.length(); i++){
            res = s.replaceAll("[aeiou]","*");  
        }
    
        System.out.println(res);


        sc.close();
    }
}
