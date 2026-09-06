import java.util.Scanner;
public class Array_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];
        System.out.print("enter number of integers: ");
        int n = sc.nextInt();
        System.out.print("enter elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("original array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
// insert a num to a particular index of array with increase of its length+1
        System.out.print("enter integer: ");
        int num=sc.nextInt();
        //System.out.print("enter index: ");
        //int index=sc.nextInt();
        // for(int i=n;i<n+1;i++){
            
        //     if(arr[i]<num && arr[i+1]>num){
        //         arr[i] = arr[i-1];
        //     }
        //     // if you wanna overwrite the array
        //     // if(arr[i]==arr[index])
        //     // arr[index]=num;
        
        //     arr[i] = num;
        //     n++;
        // }
        // to delete the num at particular index
        // for(int i=index;i<n-1;i++)
        //     arr[i] = arr[i + 1];
        //             n--;
        
        // insert a num to sorted array and it remain sorted
        int index = n;
        for(int i=0;i<n;i++) {
            if(arr[i] > num) {
                index = i;
                break;
            }
        }
        for(int i=n;i>index;i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = num;
        n++;
    
        System.out.print("new array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
