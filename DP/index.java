import java.util.Arrays;

public class index {

                // 1.) Maximum Sum of Subsequence With Non-adjacent Elements
                
// Memoization :::

// class Solution {
//     public int helper(int nums[],int ind,int dp[]){
//         // if(ind == 0) return nums[0];
//         if(ind < 0) return 0;
//         if(dp[ind] != -1) return dp[ind];

//         int pick = nums[ind] + helper(nums,ind-2,dp);
//         int notpick = 0 + helper(nums,ind-1,dp);
//         return dp[ind] = Math.max(pick,notpick);
//     }

//     public int maximumSumSubsequence(int[] nums, int[][] queries) {
//         int sum = 0;
//         for(int i=0; i<queries.length; i++){
//             int ind = queries[i][0];
//             int el = queries[i][1];
//             int temp = nums[ind];
//             nums[ind] = el;
//             int dp[] = new int[nums.length];
//             Arrays.fill(dp,-1);
//             sum += helper(nums,nums.length-1,dp);
//         }
//         return sum;
//     }
// }

// Tabulation :::

    // private static final int MOD = 1_000_000_007;
    // public int maximumSumSubsequence(int[] nums, int[][] queries) {
    //     long sum = 0;
    //     int n = nums.length;

    //     for (int[] q : queries) {
    //         int idx = q[0];
    //         int val = q[1];
    //         nums[idx] = val; 

    //         long[] dp = new long[n];
    //         dp[0] = Math.max(0, nums[0]);
    //         if (n > 1) dp[1] = Math.max(dp[0], nums[1]);

    //         for (int i = 2; i < n; i++) {
    //             dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
    //         }
    //         sum = (sum + dp[n - 1]) % MOD;
    //     }
    //     return (int) sum;
    // }

// 2.) HOUSE ROBBER :::

// class Solution {
//     int helper(int[] nums){
//         int n = nums.length;
//         int prev = nums[0];
//         int prev2 = 0;
//         for(int i=1; i<n; i++){
//             int take = nums[i];
//             if(i > 1) take += prev2;
//             int nottake = 0 + prev;

//             int curi = Math.max(take,nottake);
//             prev2 = prev;
//             prev = curi;
//         }
//         return prev;
//     }

//     public int rob(int[] nums) {
//         int n = nums.length;
//         if(nums.length == 1) return nums[0];
//         int arr1[] = new int[nums.length-1];
//         int arr2[] = new int[nums.length-1];
//         int k = 0;
//         int j = 0;
//         for(int i=0; i<nums.length; i++){
//             if(i != 0) arr1[k++] = nums[i];
//             if(i != n-1) arr2[j++] = nums[i];
//         }
//         return Math.max(helper(arr1),helper(arr2));
//     }
// }

//                                          279. Perfect Squares

class Solution {
    int helper(int n,int dp[]){
        if(n<=0) return 0;
        int ans = Integer.MAX_VALUE;
        if(dp[n] != -1) return dp[n];

        for(int i=1; i*i<=n; i++){
            int sqn = i*i;
            int cnt = 1 + helper(n-sqn,dp);
            ans = Math.min(ans,cnt);
        }
        return dp[n] = ans;
    }

    public int numSquares(int n) {
        int arr[] = new int[n+1];
        Arrays.fill(arr,-1);
        return helper(n,arr);
    }
}


    public static void main(String[] args) {
        
    }
}
