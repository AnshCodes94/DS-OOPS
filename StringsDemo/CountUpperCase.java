import java.util.Scanner;

public class CountUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        int count = 0;
        for ( int i = 0; i < Str.length(); i++){
            if (Str.charAt(i) >= 'A' && Str.charAt(i) <= 'Z'){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
