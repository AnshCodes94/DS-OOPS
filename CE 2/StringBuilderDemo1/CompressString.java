import java.util.Scanner;

public class CompressString {
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } 
            else {
                sb.append(str.charAt(i));
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(compress(input));

        sc.close();
    }
}