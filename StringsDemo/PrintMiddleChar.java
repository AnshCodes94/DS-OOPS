import java.util.Scanner;

public class PrintMiddleChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        
        if(Str.length() % 2 == 0){
            System.out.println(Str.charAt(Str.length()/2 - 1));
        } else {
            System.out.println(Str.charAt(Str.length()/2));
        }
        sc.close();
    }
}
