import java.util.*;
public class StudentPerformanceAnalysis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> names=new ArrayList<>();
        ArrayList<Integer> marks=new ArrayList<>();
        for(int i=0;i<n;i++){
            names.add(sc.next());
            marks.add(sc.nextInt());
        }
        int sum=0;
        for(int m:marks) sum+=m;
        double avg=(double)sum/n;
        System.out.print("Passed Students: ");
        for(int i=0;i<n;i++){
            if(marks.get(i)>=40) System.out.print(names.get(i)+" ");
        }
        System.out.println();
        System.out.printf("Average: %.2f%n",avg);
        int count=0;
        for(int m:marks){
            if(m>avg) count++;
        }
        System.out.println("Above Average: "+ count);
        sc.close();
    }
}
