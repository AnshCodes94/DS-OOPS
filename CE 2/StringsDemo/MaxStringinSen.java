import java.util.Scanner;
public class MaxStringinSen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        String[] words = Str.split(" ");
        String max = "";
        
        for(int i = 0; i < words.length; i++){
            if(words[i].length() >= max.length()){
                max = words[i];
            }
        }
        System.out.println(max);
        sc.close();
    }
}
