import java.util.*;
public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<String> a=new LinkedList<>();
        for(int i=0;i<n;i++){
            a.add(sc.next());
        }
        for(String s:a){
            boolean upper=false,lower=false,digit=false;
            if(s.length()<8){
                System.out.println(s+": Invalid");
                continue;
            }
            for(char c:s.toCharArray()){
                if(Character.isUpperCase(c)) upper=true;
                if(Character.isLowerCase(c)) lower=true;
                if(Character.isDigit(c)) digit=true;
            }
            if(upper&&lower&&digit) System.out.println(s+": Valid");
            else System.out.println(s+": Invalid");
        }

        sc.close();
    }
}
