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


// FIND MINIMUM OF THE SORTED AND ROTATED ARRAY :::

// class Solution {
//     public int findMin(int[] nums){

// // linear search :::

//         // int min=nums[0];
//         // for(int i=0;i<nums.length;i++){
//         //     if(nums[i]<min){
//         //         min=nums[i];
//         //     }
//         // }
//         // return min;

// // binary search

//         int start = 0;
//         int end = nums.length - 1;
//         while (start < end) { 
//             int mid = start + (end - start) / 2;
//             if (nums[mid] < nums[end]) {
//                 end = mid; 
//             } else {
//                 start = mid + 1;
//             }
//         }
//         return nums[start];
//     }
// }


   
                            // GREATEST COMMON DIVISOR :::

// class leetcode{
// public static int gcd(int a,int b){
//         while(b!=0){
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }
// public static void main(String args[]){
//     int a = 20;
//     int b = 15;
//     System.out.println(gcd(a, b));
// }
// }

                                // String odd pairs:::

// class leetcode{
// public static boolean oddpairs(String str){
//     int i=0;
//     while(i<str.length()-1){
//         char currchar = str.charAt(i);
//         char nextchar = str.charAt(i+1);
//         if (Character.isDigit(currchar) && Character.isDigit(nextchar)) {
//             if ((currchar % 2 != 0) && (nextchar % 2 != 0)) {
//                 return true;
//             }
//         }
//         i++;
//     }
//     return false;
// }
//     public static void main(String args[]){
//         String str = "e43fg58";
//         System.out.println(oddpairs(str));
// }
// }

import java.util.HashSet;
public class leetcode {
    public static int gcd(int a, int b) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                set1.add(i);
            }
        }
        for (int i = 1; i <= b; i++){
            if (b % i == 0 && set1.contains(i)) {
                set2.add(i);
            }
        }
        int max = 1;
        for (int num : set2) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int a=36,b=48;
        System.out.println(gcd(a, b));
    }
}

                        // Check if the array is sorted and rotated :::::


// class Solution {
//     public boolean check(int[] nums) {
//         int count=0;
//         int n=nums.length;
//        for(int i=1;i<n;i++){
//             if(nums[i-1]>nums[i]){
//                 count++;
//             }
//        }
//        if(nums[n-1]>nums[0]){
//         count++;
//         }
//         if(count>1){
//             return false;
//         }
//         return true;
//     }
// }


                                // TWO NUMBERS WITH ODD OCCURENCES 

// class Solution {
//     public int[] twoOddNum(int Arr[], int N) {
//         HashMap<Integer, Integer> h1 = new HashMap<>();
//         for (int num : Arr) {
//             h1.put(num, h1.getOrDefault(num, 0) + 1);
//         }

//         int[] arr = new int[2];
//         int k=0;
//         for (int num : h1.keySet()) {
//             if (h1.get(num) % 2 != 0) {
//                 arr[k++] = num;
//                 if (k == 2) break;
//             }
//         }
//         if (arr[0] < arr[1]) {
//             int temp = arr[0];
//             arr[0] = arr[1];
//             arr[1] = temp;
//         }
//         return arr;
//     }
// }

                                //  Count prime numbers till n.

// class Solution { 
//     public int countPrimes(int n) {
//         int count = 0;
//         boolean isprime[] = new boolean[n];
//         if(n<=2){
//             return 0;
//         }
//         for(int i=2;i<n;i++){
//             isprime[i] = true;
//         }
//         for(int i=2;i*i<n;i++){
//             if(isprime[i]){
//                 for(int j = i*i;j<n;j+=i){
//                     isprime[j] = false;
//                 }
//             }
//         }
//         for(int i=1;i<n;i++){
//             if(isprime[i]==true){
//                 count++;
//             }
//         }
//         return count;
//     }
// }