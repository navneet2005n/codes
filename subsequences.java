import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsequences {

// All Subsequences print ::

    public static void generateSubsequences(int[] arr, int index, List<Integer> current) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }
        current.add(arr[index]);
        generateSubsequences(arr, index + 1, current);

        current.remove(current.size() - 1);
        generateSubsequences(arr, index + 1, current);
    }

// All subsequences with sum K...

    public static void sumsbsq(int arr[],int k,int sum,int index,ArrayList<Integer>curr){
         if (index == arr.length) {
            if (sum == k) {
                System.out.println(curr);
            }
            return;
        }

        curr.add(arr[index]);
        sum += arr[index];
        sumsbsq(arr, k, sum, index+1, curr);

        curr.remove(curr.size()-1);
        sum -= arr[index];
        sumsbsq(arr, k, sum, index+1, curr);
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        System.out.println("All subsequences of array: " + Arrays.toString(arr));
        generateSubsequences(arr, 0, new ArrayList<>());
    }
}

