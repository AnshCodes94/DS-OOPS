import java.util.*;
public class SafeNumberParser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        try{
            int b=Integer.parseInt(a);
            System.out.println(b*2);
        }catch(NumberFormatException e){
            System.out.println("Invalid Number");
        }

        sc.close();
    }
}
