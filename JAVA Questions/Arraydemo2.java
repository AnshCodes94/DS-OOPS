import java.util.Scanner;

public class Arraydemo2 {
    public static void main(String[] args) {
         int a[]=new int[9];
        // int[] b=new int[5];      // other ways to create an array
        // int[] c={1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        readArray(a);

    // check the array is sorted  
        // boolean sort = checkSort(a);
        // if(sort == true){
        //     System.out.println("Array is sorted");
        // } else {
        //     System.out.println("Array is not sorted");
        // }

    // replace the x with y and y with x
        // System.out.print("enter x and y: ");
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // replaceAll(a,x,y);
        // System.out.print("new array: ");
        // printnewArray(a);
        sc.close();

    }
    public static void readArray(int[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter values of array: ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
    }

    // public static boolean checkSort(int a[]){
    //     for(int i=1;i<a.length;i++){
    //         if(a[i] < a[i - 1]){
    //             return true;
    //         }
    //     }
    //     return true;
    // }

    public static void replaceAll(int[] a,int x , int y){
        for(int i=0;i<a.length;i++){
            if(a[i] == x){
                a[i] = y;
            } else if(a[i] == y){
                a[i] = x;
            }
        }
    }

    public static void printnewArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
  