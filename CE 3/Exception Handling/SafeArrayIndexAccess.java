import java.util.*;
public class SafeArrayIndexAccess {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
        }
        int c=sc.nextInt();
        try{
            System.out.println(b[c]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }

        sc.close();
    }
}
