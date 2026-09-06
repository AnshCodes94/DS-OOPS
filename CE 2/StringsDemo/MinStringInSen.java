import java.util.*;

public class MinStringInSen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        String[] words = Str.split(" ");
        String min = words[0];
        for(int i = 1; i < words.length; i++){
            if(words[i].length() <= min.length()){
                min = words[i];
            }
        }
        System.out.println(min);

        sc.close();
    }
}