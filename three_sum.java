
                                    // Leetcode problem 15: 3Sum

// public class three_sum {
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Set <List<Integer>> result = new HashSet<>();
//         Arrays.sort(nums);
//         for (int i = 0; i < nums.length - 2; i++) {
//             Set <Integer> seen = new HashSet<>(); 
//             for (int j = i + 1; j < nums.length; j++) {
//                 int k = - (nums[i] + nums[j]);
//                 if (seen.contains(k)) {
//                     List<Integer> triplet = Arrays.asList(nums[i], k, nums[j]);
//                     Collections.sort(triplet); 
//                     result.add(triplet);
//                 }
//                 seen.add(nums[j]);
//             }
//             seen.clear();
//         }
//         return new ArrayList<>(result);
//     }
// }
// }
