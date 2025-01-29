                           // removeNthFromEnd nth node from last node

// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         int length = 0;
//         ListNode temp = head;
//         while (temp != null) {
//             length++;
//             temp = temp.next;
//         }
//         if(length == n){
//             return head.next; 
//         }
//         int targetIndex = length - n - 1; 
//         ListNode current = head;
//         for (int i = 0; i < targetIndex; i++) {
//             current = current.next;
//         }
//         current.next = current.next.next;
//         return head;
//     } 
// }

                                  // Code to sort a linkedlist ...

// class Solution {
//     public ListNode sortList(ListNode head) {
//         ArrayList<Integer> array = new ArrayList<>();
//         ListNode temp = head;
//         while (temp != null) {
//             array.add(temp.val);
//             temp = temp.next;
//         }
//         Collections.sort(array);
//         temp = head;
//         for (int value : array) {
//             temp.val = value;
//             temp = temp.next;
//         }
//         return head;
//     }
// }


                                       // COUNT FREQUENCY OF GIVEN ELEMENTS ...

// getOrDefault(num, 0):
// num is the key we are looking up in the HashMap.
// 0 is the default value returned if num is not already present in the map.
// So, if num is already in the map, it will return the current frequency (the value associated with num).
// If num is not in the map yet, it will return 0, which means it's the first time we encounter this number.
// + 1:

// This part adds 1 to the count of the current num.
// If num is already in the map, it increases its count by 1.
// If num is not in the map, it starts the count at 1.
// h1.put(num, h1.getOrDefault(num, 0) + 1):

// After obtaining the current count of num (or 0 if it doesn't exist yet), we update the map by putting the key num and the new incremented value (h1.getOrDefault(num, 0) + 1) back into the map using put.
// If num was already in the map, this will update its count. If num was not in the map, it will add num with a count of 1.


// class Solution {
//     public int singleNumber(int[] nums) {
//         HashMap<Integer, Integer> h1 = new HashMap<>();
//         for (int num : nums) {
//             h1.put(num, h1.getOrDefault(num, 0) + 1);
//         }        
//         for (int num : h1.keySet()) {
//             if (h1.get(num) == 1) {
//                 return num;
//             }
//         }        
//         return -1;
//     }
// }


                                         // Set Matrix Zeroes :::::

// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int placeholder = -19999; 
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 if (matrix[i][j] == 0) {
//                     for (int k = 0; k < matrix[0].length; k++) {
//                         if (matrix[i][k] != 0) {
//                             matrix[i][k] = placeholder;
//                         }
//                     }
//                     for (int m = 0; m < matrix.length; m++) {
//                         if (matrix[m][j] != 0) {
//                             matrix[m][j] = placeholder;
//                         }
//                     }
//                 }
//             }
//         }
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 if (matrix[i][j] == placeholder) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//     }
// }
