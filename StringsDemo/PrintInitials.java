import java.util.Scanner;

public class PrintInitials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        String[] words = Str.split(" ");
        String initials = "";
        for(int i = 0; i < words.length; i++){
            initials += words[i].charAt(0) + " ";
        }
        System.out.println(initials);
        sc.close();
    }
}
