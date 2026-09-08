import java.util.*;

public class FrequencyOfCharaceter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char ch = sc.next().charAt(0);
        int count = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ch){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}