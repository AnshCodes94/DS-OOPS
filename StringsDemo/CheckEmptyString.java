import java.util.*;

public class CheckEmptyString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.isEmpty()){
            System.out.println("String is empty");
        }
        else
            System.out.println("Not Empty");

        sc.close();
    }
}
