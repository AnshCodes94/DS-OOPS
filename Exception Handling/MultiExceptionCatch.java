import java.util.*;

public class MultiExceptionCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[] arr=new int[3];
        try{
            int res=a/b;
            System.out.println(res);
            System.out.println(arr[a]);
        }catch(ArithmeticException e){
            System.out.println("Divison Error");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index Error");
        }

       sc.close(); 
    }
    
}
