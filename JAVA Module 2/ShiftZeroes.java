import java.util.Arrays;

public class ShiftZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        shiftZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shiftZeroes(int[] arr) {
        int n = arr.length;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }

        while (j < n) {
            arr[j++] = 0;
        }
    }
}