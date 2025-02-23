public class cyclicsort {
    public static void cyclicsort(int arr[]){
        int j = 0;
        while(j < arr.length){
            int correct = arr[j] - 1;
            if(arr[j] != arr[correct]){
                int temp = arr[j];
                arr[j] = arr[correct];
                arr[correct] = temp;
            }
            else{
                j++;
            }
            }
}
    public static void main(String args[]){
        int arr[] = {2,1,4,3,5};
        cyclicsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
 

// 1) Cyclic sort is a pattern that applies to an array of n distinct numbers from 1 to n. 
// It is used to place the numbers in their correct position in the array. 
// The time complexity of cyclic sort is O(n) and the space complexity is O(1).
// 2) The cyclic sort algorithm is used to sort an array of n numbers from 1 to n.
// The algorithm works by placing each number in its correct position in the array.


// 3) The cyclic sort algorithm works by placing each number in its correct position in the array.                          
                                    
                                    //  Questions of leetcode

            
// 1) Find the Duplicate Number (LeetCode)

// class Solution {
//     public int findDuplicate(int[] nums) {
// int i = 0;
// while(i < nums.length){
//     if(nums[i]!=i+1) {
//     int corr = nums[i]-1;
//     if(nums[i] != nums[corr]){
//         int tem = nums[i];
//         nums[i] = nums[corr];
//         nums[corr] = tem;
//     }
//     else{
//         return nums[i];
//     }
//     }
//     else{
//         i++;
//     }
// }
// return -1;
// }
// }

// 2.) Find all duplicates in an array (LeetCode) 

// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         int i = 0;
//         ArrayList <Integer> l1 = new ArrayList<>();
//         while(i < nums.length){
//             int corr = nums[i]-1;
//             if(nums[i] != nums[corr]){
//                 int tem = nums[i];
//                 nums[i] = nums[corr];
//                 nums[corr] = tem;
//             }
//             else{
//                 i++;
//             }
//         }
//         for(int j = 0; j < nums.length; j++){
//             if(nums[j] != j+1){
//                 l1.add(nums[j]);
//             }
//         }
//         return l1;
//     }
// }


// 3)  Set Mismatch (LeetCode)

// class Solution {
//     public int[] findErrorNums(int[] nums) {
//         int i = 0;
//         int arr[] = new int[2];
//         while(i<nums.length){
//             int corr = nums[i] - 1;
//             if(nums[i]!=nums[corr]){
//                 int t = nums[i];
//                 nums[i] = nums[corr];
//                 nums[corr] = t;
//             }
//             else{
//                 i++;
//             }
//         }
//         for(int j = 0; j<nums.length; j++){
//             if(nums[j] != j+1){
//                 arr[0] = nums[j];
//                 arr[1] = j+1;
//             }
//         }
//         return arr;
//     }
// }

// 4) First missing positive (LeetCode)

// class Solution {
//     public int firstMissingPositive(int[] nums) {
//         int i = 0;
//         while(i < nums.length){
//             int corr = nums[i]-1;
//             if(nums[i]>0 && nums[i] < nums.length && nums[i] != nums[corr]){
//                 int t = nums[i];
//                 nums[i] = nums[corr];
//                 nums[corr] = t;
//             }
//             else{
//                 i++;
//             }
//         }
//         for(int j=0; j < nums.length; j++){
//             if(nums[j] != j+1){
//                 return j+1;
//             }
//         }
//         return nums.length + 1;
//     }
// }

// 5) Find All Numbers Disappeared in an Array (LeetCode)

// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         int i = 0;
//         ArrayList <Integer> l1 = new ArrayList<>();
//         while(i < nums.length){
//             int corr = nums[i]-1;
//             if(nums[i] != nums[corr]){
//                 int tem = nums[i];
//                 nums[i] = nums[corr];
//                 nums[corr] = tem;
//             }
//             else{
//                 i++;
//             }
//         }
//         for(int j = 0; j < nums.length; j++){
//             if(nums[j] != j+1){
//                 l1.add(j+1);
//             }
//         }
//         return l1;
//     }
// }

