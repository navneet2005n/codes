import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

    public static void sumsbsq(int arr[], int k, int sum, int index, ArrayList<Integer> curr) {
        if (index == arr.length) {
            if (sum == k) {
                System.out.println(curr);
            }
            return;
        }

        curr.add(arr[index]);
        sum += arr[index];
        sumsbsq(arr, k, sum, index + 1, curr);

        curr.remove(curr.size() - 1);
        sum -= arr[index];
        sumsbsq(arr, k, sum, index + 1, curr);
    }

// SUM OF ALL SUBSEQUENCES :::

    public static int subseqsum(int arr[], int index, int sum, ArrayList<Integer> curr) {
        if (index == arr.length) {
            for (int i = 0; i < curr.size(); i++) {
                sum += curr.get(i);
            }
            return sum;
        }
        curr.add(arr[index]);
        int lft = subseqsum(arr, index + 1, sum, curr);

        curr.remove(curr.size() - 1);
        int rgt = subseqsum(arr, index + 1, sum, curr);
        return lft + rgt;
    }

// SUM OF ALL UNIQUE SUBSEQUENCES :::

    public static void subsetsum(int ind, int sum, int n, ArrayList<Integer>arr, ArrayList<Integer>li){
        if(ind == n){
            li.add(sum);
            return;
        }
        subsetsum(ind+1, sum + arr.get(ind), n, arr, li);
        subsetsum(ind+1, sum, n, arr, li);
    }

// PERMUTATIONS OF ARRAY :::

    public static void recurPermute(int index, int[] nums, List<List<Integer>> ans) {
        if (index == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        } 
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            recurPermute(index + 1, nums, ans);
            swap(i, index, nums); 
        }
    }
  
    public static void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }


// 40. Combination Sum II :::

// class Solution {
//     public void findcomb(int ind, int arr[], int target, List<List<Integer>> ans, List<Integer>ds){
//         if(target == 0){
//             ans.add(new ArrayList<>(ds));
//             return;
//         }
//         for(int i=ind; i<arr.length; i++){
//             if(i > ind && arr[i] == arr[i-1]) continue;
//             if(arr[i] > target) break;

//             ds.add(arr[i]);
//             findcomb(i+1, arr, target-arr[i], ans, ds);
//             ds.remove(ds.size()-1);
//         }
//     }
 
//     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//         List<List<Integer>> li = new ArrayList<>();
//         Arrays.sort(candidates);
//         findcomb(0,candidates,target,li,new ArrayList<>());
//         return li;
//     }
// }

// TWO IDENTICAL TREES ::: 

// class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         if(p == null && q == null) return true;
//         if(p == null || q == null) return false;
//         if(p.val != q.val) return false;
//         return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
//     }
// }


    public static void main(String[] args) {
        int[] arr = {3,1,2};
        ArrayList<Integer>arr1= new ArrayList<>();
        arr1.add(3);
        arr1.add(2);
        arr1.add(1);
        // System.out.println("All subsequences of array: " + Arrays.toString(arr));
        // generateSubsequences(arr, 0, new ArrayList<>());
        // System.out.println(subseqsum(arr,0,0,new ArrayList<>()));
        ArrayList <Integer> li = new ArrayList<>();
        subsetsum(0, 0, arr1.size(), arr1, li);
        System.out.println(li);
        List <List<Integer>> l = new ArrayList<>();
        recurPermute(0, arr, l);
        System.out.println(l);
    }
}

