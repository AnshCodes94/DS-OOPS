import java.util.*;
public class FindCommonElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> a=new LinkedList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        int m=sc.nextInt();
        LinkedList<Integer> b=new LinkedList<>();
        for(int i=0;i<m;i++){
            b.add(sc.nextInt());
        }
        for(int num:a){
            if(b.contains(num)){
                System.out.print(num+" ");
            }
        }

        sc.close();
    }
}
