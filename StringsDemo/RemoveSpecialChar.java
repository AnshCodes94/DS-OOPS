import java.util.*;

public class RemoveSpecialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";

        for(int i = 0; i < s.length(); i++){
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                res += s.charAt(i);
            }
        }
        System.out.println(res);
        sc.close();
    }
}