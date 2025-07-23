import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsequences {
    public static void generateSubsequences(int[] arr, int index, List<Integer> current) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Include the current element
        current.add(arr[index]);
        generateSubsequences(arr, index + 1, current);

        // Exclude the current element (backtrack)
        current.remove(current.size() - 1);
        generateSubsequences(arr, index + 1, current);
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        System.out.println("All subsequences of array: " + Arrays.toString(arr));
        generateSubsequences(arr, 0, new ArrayList<>());
    }
}

