import java.util.*;
public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<String> a=new LinkedList<>();
        LinkedList<Integer> b=new LinkedList<>();
        for(int i=0;i<n;i++){
            a.add(sc.next());
            b.add(sc.nextInt());
        }
        int max=Integer.MIN_VALUE;
        int ind=-1;
        for(int i=0;i<b.size();i++){
            int num=b.get(i);
            if(num>max){
                max=num;
                ind=i;
            }
        }
        int sum=0;
        for(Integer num : b){
            sum+=num;
        }
        int avg=sum/n;
        ArrayList<String> c=new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=b.get(i);
            if(num>avg){
                c.add(a.get(i));
            }
        }
        System.out.println("Top Student: " + a.get(ind));
        System.out.println("Marks: " + max);
        System.out.println("Index: " + ind);
        System.out.print("Above Average: ");
        for(String num:c){
            System.out.print(num+" ");
        }

        sc.close();
    }
}
