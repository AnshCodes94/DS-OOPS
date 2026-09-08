import java.util.*;
public class FilterShortStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<String> a=new LinkedList<>();
        LinkedList<String> b=new LinkedList<>();
        for(int i=0;i<n;i++){
            a.add(sc.next());
        }
        for(String num : a){
            if(num.length()<5){
                b.add(num);
            }
        }
        for(String num:b){
            System.out.print(num+" ");
        }

        sc.close();
    }
}
