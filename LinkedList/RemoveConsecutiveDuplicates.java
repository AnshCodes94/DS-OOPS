import java.util.*;
public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> a=new LinkedList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        LinkedList<Integer> b=new LinkedList<>();
        b.add(a.get(0));
        for(int i=1;i<a.size();i++){
            if(!a.get(i).equals(a.get(i-1))){
                b.add(a.get(i));
            }
        }.
        for(int num:b){
            System.out.print(num+" ");
        }

        sc.close();
    
    }
}
