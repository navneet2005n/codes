// public class sumpairs {
//     class Solution {
//     public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
//         Node temp = head;
//         int k = 0;
//         while (temp != null) {
//             k++;
//             temp = temp.next;
//         }
//         int arr[] = new int[k];
//         temp = head;
//         int index = 0;
//         while (temp != null) {
//             arr[index++] = temp.data;
//             temp = temp.next;
//         }
//         ArrayList<ArrayList<Integer>> ml = new ArrayList<>();
//         int lp = 0, rp = k - 1;
//         while (lp < rp) {
//             int sum = arr[lp] + arr[rp];
//             if (sum == target) {
//                 ml.add(new ArrayList<>(Arrays.asList(arr[lp], arr[rp])));
//                 lp++;
//                 rp--; 
//             } else if (sum > target) {
//                 rp--;
//             } else {
//                 lp++; 
//             }
//         }
//         return ml;
//     }
// }

// }
