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

                                    // 62. Unique Paths :::

    public int helper(int m, int n, int dp[][]){
        if(n < 0 || m < 0) return 0;
        if(n == 0 && m == 0) return 1;
        if(dp[m][n] != -1) return dp[m][n];
        int left = helper(m,n-1,dp);
        int up = helper(m-1,n,dp);
        return dp[m][n] = up + left;
    }

    public int uniquePaths(int m, int n) {

        // MEMOIZATION ::: 

        // int dp[][] = new int[m][n]; 
        // for(int i = 0; i < m; i++){
        //     for(int j = 0; j < n; j++){
        //         dp[i][j] = -1;
        //     }
        // }        
        // return helper(m-1,n-1,dp);

        // TABULATION :::

        int dp[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i == 0 && j == 0) dp[i][j] = 1;
                else{
                int up = 0;
                int down = 0;
                if(i > 0) up = dp[i-1][j];
                if(j > 0) down = dp[i][j-1];
                dp[i][j] = up + down;
                }
            }
        }
        return dp[m-1][n-1];
    }

                                    // 64. Minimum Path Sum

    
    // MEMOIZATION :::

    public int helper(int m,int n,int grid[][],int dp[][]){
        if(m == 0 && n == 0) return grid[m][n];
        if(m < 0 || n < 0) return (int)1e9;
        if(dp[m][n] != -1) return dp[m][n];
        int left = grid[m][n] + helper(m,n-1,grid,dp);
        int top = grid[m][n] + helper(m-1,n,grid,dp);
        return dp[m][n] = Math.min(left,top);
    }

    public int minPathSum(int[][] grid) {
        int dp[][] = new int[grid.length][grid[0].length];
        // for(int m=0; m<grid.length; m++){
        //     for(int n=0; n<grid[0].length; n++){
        //         dp[m][n] = -1;
        //     }
        // }
        // return helper(grid.length-1,grid[0].length-1,grid,dp);

        // TABULATION ::

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(i == 0 && j == 0) dp[i][j] = grid[0][0];
                else{
                int left = (j > 0) ? grid[i][j] + dp[i][j-1] : (int) 1e9;
                int top = (i > 0) ? grid[i][j] + dp[i-1][j] : (int) 1e9;
                dp[i][j] = Math.min(top,left);
                }
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }

                                    // TRIANGLE PATH SUM :::

    // MEMOIZATION :::

// class Solution {
//     public int helper(int m, int n, List<List<Integer>> triangle, int[][] dp){
//         if(m == triangle.size() - 1) return triangle.get(m).get(n);
//         if(dp[m][n] != -1) return dp[m][n];
//         int bottom = triangle.get(m).get(n) + helper(m + 1, n, triangle, dp);
//         int diag   = triangle.get(m).get(n) + helper(m + 1, n + 1, triangle, dp);
//         dp[m][n] = Math.min(bottom, diag);
//         return dp[m][n];
//     }
//     public int minimumTotal(List<List<Integer>> triangle) {
//         int n = triangle.size();
//         int[][] dp = new int[n][n];
//         for(int i = 0; i < n; i++) Arrays.fill(dp[i], -1);
//         return helper(0, 0, triangle, dp);
//     }
// }

// TABULATION :::


class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for (int j = 0; j < triangle.get(n - 1).size(); j++) {
            dp[n - 1][j] = triangle.get(n - 1).get(j);
        } 
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                int bottom = triangle.get(i).get(j) + dp[i + 1][j];    
                int diag   = triangle.get(i).get(j) + dp[i + 1][j + 1];
                dp[i][j] = Math.min(bottom, diag);
            }
        }
        return dp[0][0];
    }
}


    public static void main(String[] args) {
        
    }
}
