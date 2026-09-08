import java.util.Scanner;
public class ArrayDemo {
//to read and print an array
    public static void main(String[] args) {
        int a[]=new int[6];
        // int[] b=new int[5];      // other ways to create an array
        // int[] c={1,2,3,4,5};
        readArray(a);

        //int index = findElement(a);
        //if(index == -1){
        //     System.out.println("Element not found in the array.");
        // } else {
        //     System.out.println("Element found at index " + index);
        // }

        //printArray(a);
        //int max=findMax(a);
        //System.out.println(max);
        
        //int count=countZero(a);
        //System.out.println(count);

        //EvenOdd(a);

        //shiftZerosToEnd(a);
        //System.out.print("Array after moving zeros to end: ");
        //printArray(a);

        //OddEvenReorder(a);

        // System.out.print("Original array: ");
        // printArray(a);
        // reverseArray(a);
        // System.out.print("Reversed array: ");
        // printArray(a);
    }
    public static void readArray(int[] a) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter values of array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
    }
    // public static void printArray(int[] a){
    //     for(int i=0;i<a.length;i++){
    //         System.out.print(a[i]+" ");
    //     }
    //     System.out.println();
    // }
// find max element of an array
    // public static int findMax(int[] a){
    //     int max = a[0];
    //     for(int i=1;i<a.length;i++){
    //         if(a[i] > max){
    //             max = a[i];
    //         }
    //     }
    //     return max;
    // }
// count number of zeroes from an array
        // public static int countZero(int[] a){
        //     int count=0;
        //     for(int i=0;i<a.length;i++){
        //         if(a[i]==0){
        //             count++;
        //         }
        //     }
        //     return count;
        // }
// print the even odd
        // public static void EvenOdd(int[] a){
        //     System.out.print("Even numbers: ");
        //     for(int i=0;i<a.length;i++){
        //         if(a[i] % 2 == 0){
        //             System.out.print(a[i] + " ");
        //         }
        //     }
        //     System.out.println();

        //     System.out.print("Odd numbers: ");
        //     for(int i=0;i<a.length;i++){
        //         if(a[i] % 2 != 0){
        //             System.out.print(a[i] + " ");
        //         }
        //     }
        //     System.out.println();
        // }

// shift all zeroes to the end of the array
        // public static void shiftZerosToEnd(int[] a){
        //     int nonZeroIndex = 0;
        //     for(int i=0;i<a.length;i++){
        //         if(a[i] != 0){
        //             a[nonZeroIndex] = a[i];
        //             nonZeroIndex++;
        //         }
        //     }
        //     while(nonZeroIndex < a.length){
        //         a[nonZeroIndex] = 0;
        //         nonZeroIndex++;
        //     }
        // }

// reorder array: odd numbers first, then even numbers
        // public static void oddEvenReorder(int[] a){
        //     int oddIndex = 0;
        //     // First pass: count odd numbers to find where even should start
        //     for(int i = 0; i < a.length; i++){
        //         if(a[i] % 2 != 0){
        //             // Swap odd number to oddIndex position
        //             int temp = a[oddIndex];
        //             a[oddIndex] = a[i];
        //             a[i] = temp;
        //             oddIndex++;
        //         }
        //     }
        //     System.out.print("Array after reordering: ");
        //     printArray(a);
        // }

// reverse an array
    // public static void reverseArray(int[] a){
    //     int i = 0, j = a.length - 1;
    //     while(i < j){
    //         int temp = a[i];
    //         a[i] = a[j];
    //         a[j] = temp;
    //         i++;
    //         j--;
    //     }
   
    // }

//    public static int findElement(int[] a){
//         System.out.print("Enter element: ");
//         Scanner sc=new Scanner(System.in);
//         int e = sc.nextInt();
//         for(int i=0;i<a.length;i++){
//             if(a[i] == e){
//                 return i;
//             }
//         }

//         return -1;

}
        


 
        