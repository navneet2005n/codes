import java.util.*;
public class Main {
    public static void qs(int nums[], int low, int hi) {
        if (low >= hi) {
            return;
        }
        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];
        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        // Recursive calls AFTER partitioning
        qs(nums, low, e);  // Left half
        qs(nums, s, hi);   // Right half
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 6, 5};
        qs(arr, 0, arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }
}
