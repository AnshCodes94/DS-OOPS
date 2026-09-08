import java.util.Scanner;

public class CountLowerCase {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        int count = 0;
        for ( int i = 0; i < Str.length(); i++){
            if (Str.charAt(i) >= 'a' && Str.charAt(i) <= 'z'){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
