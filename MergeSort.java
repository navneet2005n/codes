import java.util.Arrays;
public class MergeSort {
    public static int[] mergeSort(int arr[], int l, int r) {
        if (l >= r) { 
            return new int[]{arr[l]};
        }
        int mid = (l + r) / 2;
        int left[] = mergeSort(arr, l, mid);
        int right[] = mergeSort(arr, mid + 1, r);
        return merge(left, right);
    }
 
    private static int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
        return result;
    }
    public static void main(String args[]) {
        int arr[] = {5, 4, 3, 2, 1};
        int n = arr.length;
        arr = mergeSort(arr, 0, n - 1); 
        System.out.println(Arrays.toString(arr));
    }
}
