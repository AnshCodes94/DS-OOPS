import java.util.*;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] w = s.split(" ");
        String res = "";

        for (int i = 0; i < w.length; i++){
            String cap = w[i];
            if (cap.length() > 0){
                String fl = cap.substring(0,1).toUpperCase();
                String rl = cap.substring(1);
                res += fl + rl + " ";
            }
        }
        System.out.println(res.toString());
        sc.close();
    }
}