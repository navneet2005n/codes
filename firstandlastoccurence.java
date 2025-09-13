import java.util.Arrays;
import java.util.Scanner;
public class firstandlastoccurence {
    public static int[] func(int arr[], int element) {
        Arrays.sort(arr);
        int start = 0;
        if (arr.length == 0) {
            return new int[]{-1, -1}; 
        }
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == element){
            start = i;
            while (i+1<arr.length && arr[i + 1]==element) {
                i++;
            }
            return new int[]{start, i};
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{1, 3, 5, 6, 2, 1, 2};
        System.out.println("Enter the element whose first and last index you want: ");
        int element = sc.nextInt();
        System.out.println(Arrays.toString(func(arr, element)));
    }
}
