import java.util.*;
public class MergeSort {
    public static int[] mergeSort(int arr[]) {
        if (arr.length == 1) {
            return arr;
        }   
        int mid = arr.length / 2;
        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(arr));
        // it is creating a copy of real array not doing it on real array....
        mergeSort(arr);   // this will not sort the array as it is not doing it on real array
        arr = mergeSort(arr);  // this will sort the array as it is doing it on real array
        System.out.println("\nArray after sorting: ");
        System.out.println(Arrays.toString(arr));
    }
}
