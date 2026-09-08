import java.util.*;
public class RightRotateArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList <Integer> a= new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        int k=sc.nextInt();
        for(int i = 0; i < k; i++) {
            int last = a.remove(a.size() - 1);
            a.add(0, last);
        }       
        for(Integer num:a){
            System.out.print(num +" ");
        }

        sc.close();
    }
    
}
