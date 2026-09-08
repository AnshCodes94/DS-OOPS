import java.util.*;
public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<String> a=new LinkedList<>();
        for(int i=0;i<n;i++){
            a.add(sc.next());
        }
        for(String s:a){
            String res=s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
            System.out.print(res+" ");
        }

        sc.close();
    }
}
