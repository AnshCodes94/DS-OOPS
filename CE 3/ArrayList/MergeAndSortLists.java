import java.util.*;
public class MergeAndSortLists {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        int m=sc.nextInt();
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<m;i++){
            b.add(sc.nextInt());
        }
        ArrayList<Integer> c=new ArrayList<>();
        c.addAll(a);
        c.addAll(b);
        Collections.sort(c);
        System.out.println(c);

        sc.close();
    }
}
