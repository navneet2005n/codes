import java.util.Arrays;
public class bblsortbyrecursion {
     public static void bblsort(int arr[], int i) {
        if (i == arr.length) {
            return;
        }
        int j = 1;
        while (j < arr.length - i) {
            if (arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
            j++;
        }
        bblsort(arr, i + 1);
    }
    public static void main(String[] args) {
        int[] arr = {5,4,1};
        bblsort(arr, 0); 
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}
