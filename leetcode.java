import java.util.*; 
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

                                // binary search

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

// import java.util.HashSet;
// public class leetcode {
//     public static int gcd(int a, int b) {
//         HashSet<Integer> set1 = new HashSet<>();
//         HashSet<Integer> set2 = new HashSet<>();
//         for (int i = 1; i <= a; i++) {
//             if (a % i == 0) {
//                 set1.add(i);
//             }
//         }
//         for (int i = 1; i <= b; i++){
//             if (b % i == 0 && set1.contains(i)) {
//                 set2.add(i);
//             }
//         }
//         int max = 1;
//         for (int num : set2) {
//             if (num > max) {
//                 max = num;
//             }
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         int a=36,b=48;
//         System.out.println(gcd(a, b));
//     }
// }

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

// public class leetcode{

                    //  brute force :::

    // public static int storewater(ArrayList <Integer> l1){
    //     int maxwater = 0;
    //     for(int i=0;i<l1.size();i++){
    //         for(int j=i+1;j<l1.size();j++){
    //            int height = Math.min(l1.get(i), l1.get(j));
    //            int width = j-i;
    //            int water = height * width;
    //             if(water>maxwater){
    //                 maxwater = water;
    //             }
    //         }
    //     }
    //     return maxwater;
    // }

                                // two pointer approach ::

//     public static int strwater(ArrayList <Integer>l1){
//         int maxwater = 0;
//         int lp = 0;
//         int rp = l1.size()-1;
//         while(lp<rp){
//             int height = Math.min(l1.get(lp),l1.get(rp));
//             int width = rp - lp;
//             int currwater = height * width;
//             if (currwater>maxwater) {
//                     maxwater = currwater;
//             }
//             if(l1.get(lp)<l1.get(rp)){
//                 lp++;
//             }
//             else{
//                 rp--;
//             }
//         }
//         return maxwater;
//     }
//    public static void main(String args[]){
//         ArrayList <Integer> l1 = new ArrayList<>();
//         // 1 8 6 2 5 4 8 3 7
//         l1.add(1);
//         l1.add(8);
//         l1.add(6);
//         l1.add(2);
//         l1.add(5);
//         l1.add(4);
//         l1.add(8);
//         l1.add(3);
//         l1.add(7);
//         // System.out.println(storewater(l1));
//         System.out.println(strwater(l1));
//         }
// }.


                                //  Pair sum  :::


                                // brute force :::

class leetcode{

    // public static boolean pair_sum(ArrayList<Integer> l1,int sum){
    //     for(int i=0;i<l1.size();i++){
    //         for(int j=i+1;j<l1.size();j++){
    //             if(l1.get(i)+l1.get(j)==sum){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

                        // two pointer approach :::

        // public static boolean pairs(ArrayList<Integer>l1,int sum){
        //     int lp = 0;
        //     int rp = l1.size()-1;
        //     while(lp<rp){
        //         if(l1.get(lp)+l1.get(rp)==sum){
        //             return true;
        //         }
        //         else if(l1.get(lp)+l1.get(rp)<sum){
        //             lp++;
        //         }
        //         else{
        //             rp--;
        //         }
        //     }
        //     return false;
        // }

             // 2  - pointer approach for the rotated and sorted arraylist    (0(n))

        public static boolean pairs_sm(ArrayList<Integer>l1,int sum){
            int pivot = -1;
            int n  = l1.size();
            for(int i = 0;i<l1.size();i++){
                if(l1.get(i)>l1.get(i+1)) {
                    pivot = i;
                    break;
                }
            }
            int lp = pivot+1;
            int rp = pivot;
            while (lp!=rp) {
                if(l1.get(lp)+l1.get(rp)==sum){
                    return true;
                }
                else if(l1.get(lp)+l1.get(rp)<sum){
                    lp = (lp+1) % n;
                }
                else{
                    rp = (rp+n-1)%n;
                }
            }
            return false;
        }
    public static void main(String args[]){
        // ArrayList<Integer> l1 = new ArrayList<>();
        // l1.add(1);
        // l1.add(2);
        // l1.add(3);
        // l1.add(4);
        // l1.add(5);
        // l1.add(6);
        // int sum = 56;
        // System.out.println(pair_sum(l1, sum));
        // System.out.println(pairs(l1, sum));
        ArrayList <Integer> l2 = new ArrayList<>();
        l2.add(11);
        l2.add(15);
        l2.add(6);
        l2.add(8);
        l2.add(9);
        l2.add(10);
        int sum = 56;
        System.out.println(pairs_sm(l2, sum));
    }
}


                            // MAXSUM OF THE DIGITS OF THE ARRAY 
// class Solution {
//     public int maximumSum(int[] nums) {
//         HashMap<Integer, Integer> h1 = new HashMap<>();
//         int maxSum = -1; 
//         for (int i = 0; i < nums.length; i++) {
//             int sum = 0;
//             int num = nums[i];
//             while (num != 0) {
//                 int rem = num % 10;
//                 sum += rem;
//                 num /= 10;
//             }
//             if (h1.containsKey(sum)){
//                 maxSum = Math.max(maxSum, h1.get(sum) + nums[i]);
//                 h1.put(sum, Math.max(h1.get(sum), nums[i])); 
//             } else {
//                 h1.put(sum, nums[i]);
//             }
//         }
//         return maxSum;
//     }
// }

                            //  MAXIMUM FREQUENCY ELEMENTS :::

// class Solution {
//     public int maxFrequencyElements(int[] nums) {
//         HashMap<Integer,Integer> h1 = new HashMap<>();
//         for(int num:nums){
//             h1.put(num,h1.getOrDefault(num,0)+1);
//         }
//         int max = 0;
//         int c = 0;
//         for(int i=0;i<nums.length;i++){
//             if(h1.get(nums[i]) > max){
//                 max = h1.get(nums[i]);
//             }
//         }
//        for (int freq : h1.values()) {
//             if (freq == max) {
//                 c++; 
//             }
//         }
//         return c * max;
//     }
// }


                        // ROTATE LINKED LIST :::


// class Solution {
//     public ListNode rotateRight(ListNode head, int k) {
//         if (head == null || head.next == null || k == 0) {
//             return head;
//         }
//         int cnt = 0;
//         ListNode temp = head;
//         while (temp != null) {
//             cnt++;
//             temp = temp.next;
//         }
//         int arr[] = new int[cnt];
//         int c = 0;
//         ListNode temp1 = head;
//         while (temp1 != null) {
//             arr[c++] = temp1.val;
//             temp1 = temp1.next;
//         }
//         k %= cnt;
//         reverse(0, cnt - 1, arr);
//         reverse(0, k - 1, arr);
//         reverse(k, cnt - 1, arr);
//         ListNode newHead = new ListNode(arr[0]);
//         ListNode curr = newHead;
//         for (int i = 1; i < cnt; i++) {
//             curr.next = new ListNode(arr[i]);
//             curr = curr.next;
//         }
//         return newHead;
//     }
//     public static void reverse(int start, int end, int arr[]) {
//         while (start < end) {
//             int t = arr[start];
//             arr[start] = arr[end];
//             arr[end] = t;
//             start++;
//             end--;
//         }
//     }
// }

                            //  REMOVE DUPLICATES FROM THE ARRAY :::

// class Solution {
//     public int removeDuplicates(int[] nums) {
//         if (nums.length <= 2) {
//             return nums.length;
//         }
//         int i = 2;
//         for (int j = 2; j < nums.length; j++) {
//             if (nums[j] != nums[i - 2]) { 
//                 nums[i] = nums[j]; 
//                 i++;
//             }
//         }
//         return i; 
//     }
// }

                                //  ADD TWO NUMBERS :::


//  class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         l1 = rev(l1);
//         l2 = rev(l2);
//         ListNode dummy = new ListNode(0);
//         ListNode curr = dummy;
//         ListNode temp1 = l1;
//         ListNode temp2 = l2;
//         int carry = 0;
//         while(temp1 != null|| temp2!=null || carry > 0){
//             int val1 = (temp1 != null) ? temp1.val : 0;
//             int val2 = (temp2 != null) ? temp2.val : 0;
//             int sum = val1 + val2 + carry;
//             carry = sum/10;
//             curr.next = new ListNode(sum % 10);
//             curr = curr.next;
//             if(temp1!=null) {temp1=temp1.next;}
//             if(temp2!=null) {temp2=temp2.next;}
//         }
//         return rev(dummy.next);
//     }
//     private ListNode rev(ListNode head){
//         ListNode curr = head;
//         ListNode prev = null;
//         ListNode next;
//         while(curr != null){
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         return prev;
//     }
// }


                    //  REORDER LINKED LIST :::


//  class Solution {
//     public ListNode md(ListNode head){
//         ListNode s = head;
//         ListNode f = head;
//         while(f!=null && f.next!=null){
//             s = s.next;
//             f = f.next.next;
//         }
//         return s;
//     }
//     public ListNode rv(ListNode head){
//         if(head == null){
//             return head;
//         }
//         ListNode prev = null;
//         ListNode curr = head;
//         ListNode next;
//         while(curr != null){
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         return prev;
//     }

//     public void reorderList(ListNode head) {
//         if(head == null || head.next == null){
//             return;
//         }
        
//         // rearrange 

//         ListNode mid = md(head);
//         ListNode hs = rv(mid);
//         ListNode hf = head;
//         while(hf != null && hs != null){
//             ListNode temp = hf.next;
//             hf.next = hs;
//             hf = temp;

//             temp = hs.next;
//             hs.next = hf;
//             hs = temp;
//         }
//         if(hf != null){
//             hf.next = null;
//         }
//     }
// }


// class Solution {
//     public int countDigitOne(int n) {
//         if (n == 0) {
//             return 0;
//         }
//         int cnt = 0;
//         for (int i = 1; i <= n; i++) {
//             int num = i;
//             while (num > 0) {
//                 if (num % 10 == 1) {
//                     cnt++;
//                 }
//                 num /= 10;
//             }
//         }
//         return cnt;
//     }
// }

                                // COUNT DIGIT ONE :::

// class Solution {
//     public int countDigitOne(int n) {
//         int count = 0;
//         for (int i = 1; i <= n; i *= 10) { 
//             int d = i * 10;
//             count += (n / d) * i + Math.min(Math.max(n % d - i + 1, 0), i);
//         }
//         return count;
//     }
// }

                        //  Angle between the hour and minute hand :::

// class Solution {
//     public double angleClock(int hour, int minutes) {
//         double angle = Math.abs(30 * hour - 5.5 * minutes);
//         return Math.min(angle, 360 - angle);
//     }
// }

                        // Next Greater Node In Linked List

// INPUT : [2,1,5]
// OUTPUT : [5,5,0]

// class Solution {
//     public int[] nextLargerNodes(ListNode head) {
//         ListNode temp = head;
//         int cnt = 0;
//         while (temp != null) {
//             cnt++;
//             temp = temp.next;
//         }
//         int[] arr = new int[cnt];
//         temp = head;
//         int k = 0;
//         while (temp != null) {
//             arr[k++] = temp.val;
//             temp = temp.next;
//         }
//         for (int i = 0; i < arr.length; i++) {
//             int nextGreater = 0;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] > arr[i]) {  
//                     nextGreater = arr[j]; 
//                     break;
//                 }
//             }
//             arr[i] = nextGreater;  
//         }
//         return arr;
//     }
// }


                        //  Remove Zero Sum Consecutive Nodes from Linked List  :::
                        
// class Solution {
//     public ListNode removeZeroSumSublists(ListNode head) {
//         ListNode dummy = new ListNode(0);
//         dummy.next = head;
//         ListNode start = dummy;
//         while (start != null) {
//             int sum = 0;
//             ListNode end = start.next;
//             while (end != null) {
//                 sum += end.val;
//                 if (sum == 0) {
//                     start.next = end.next; 
//                 }
//                 end = end.next;
//             }
//             start = start.next;
//         }
//         return dummy.next;
//     }
// }

                        //  FInd the closest k elements to the given number :::

// class Solution {
//     public List<Integer> findClosestElements(int[] arr, int k, int x) {
//         List<Integer> result = new ArrayList<>();
//         int left = 0;
//         int right = arr.length-1;
//         while(right-left >= k){
//             if(Math.abs(arr[left] - x) > Math.abs(arr[right] - x)){
//                 left++;
//             }
//             else{
//                 right--;
//             }
//         }
//         for(int i=left; i<=right; i++){
//             result.add(arr[i]);
//         }
//         return result;
//     }
// }



 
//                              //  SWAP NODES IN PAIRS :::

// class Solution {
//     public ListNode swapPairs(ListNode head) {
//       if(head == null || head.next == null){
//         return head;
//       }
//       ListNode temp = head;
//       int cnt = 0;
//       while(temp != null){
//         cnt++;
//         temp = temp.next;
//       }
//       int arr[] = new int[cnt];
//       temp = head;
//       int j = 0;
//       while(temp != null){
//         arr[j++] = temp.val;
//         temp = temp.next;
//       }
//       for(int i=1;i<arr.length;i+=2){
//         int temp1 = arr[i];
//         arr[i] = arr[i-1];
//         arr[i-1] = temp1;
//       }
//       ListNode dummy = new ListNode(0);
//       ListNode curr = dummy;
//       for(int num : arr){
//         curr.next = new ListNode(num);
//         curr = curr.next;
//       }
//       return dummy.next;
//     }
// }

 // ( 1679 )  // Max operation of sum pairs in an array :::
    
// class Solution {
//     public int maxOperations(int[] nums, int k) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int count = 0;
//         for (int num : nums) {
//             int complement = k - num;
//             if (map.getOrDefault(complement, 0) > 0) {
//                 count++;
//                 map.put(complement, map.get(complement) - 1);
//             } 
//             else {
//                 map.put(num, map.getOrDefault(num, 0) + 1);
//             }
//         }
//         return count;
//     }
// }

//  (25.)                  //     REVERSE NODES IN K GROUPS :::

// class Solution {
//     public ListNode reverseKGroup(ListNode head, int k) {
//         ListNode temp = head;
//         int cnt = 0;
//         while (temp != null) {
//             cnt++;
//             temp = temp.next;
//         }
//         temp = head;
//         int o = 0;
//         int arr[] = new int[cnt];
//         while (temp != null) {
//             arr[o++] = temp.val;
//             temp = temp.next;
//         }
//         for (int i = 0; i + k - 1 < cnt; i += k) {
//             int left = i;
//             int right = i + k - 1;
//             while (left < right) {
//                 int temp1 = arr[left];
//                 arr[left] = arr[right];
//                 arr[right] = temp1;
//                 left++;
//                 right--;
//             }
//         }
//         ListNode dummy = new ListNode(0);
//         ListNode curr = dummy;
//         for (int num : arr) {
//             curr.next = new ListNode(num);
//             curr = curr.next;
//         }
//         return dummy.next;
//     }
// }

//          (1608)    //  Special Array With X Elements Greater Than or Equal X :::

// class Solution {
//     public int specialArray(int[] nums) {
//         for(int i = 1; i <= nums.length; i++) { 
//             int chk = 0;
//             for(int j = 0; j < nums.length; j++) {
//                 if(nums[j] >= i) {
//                     chk++;
//                 }
//             }
//             if(chk == i) {
//                 return i;
//             }
//         }
//         return -1;
//     }
// }


                        //    Bitwise AND of Numbers Range :::

// class Solution {
//     public int rangeBitwiseAnd(int left, int right) {
//         while (left < right) {
//             right = right & (right - 1); 
//         }
//         return right;
//     }
// }

                    //  TESTPAD QUESTION ::: 

// class Result {
//     static long solveQuery(int N, int W, int i, char ch) {
//         int totalRows = (N % W == 0) ? (N / W) : (N / W + 1);
//         if ((ch == 'R' && i > totalRows) || (ch == 'C' && i > W)) {
//             return 0;
//         }
//         long sum = 0;
//         if (ch == 'R'){ 
//             int start = (i - 1) * W + 1;
//             int end = Math.min(i * W, N);
//             for (int num = start; num <= end; num++) {
//                 sum += num;
//             }
//         } 
//         else if (ch == 'C') { 
//             for (int rowStart = i; rowStart <= N; rowStart += W) {
//                 sum += rowStart;
//             }
//         }
//         return sum;
//       }
//     }


                                //   Next Greater Element 2 :::

// class Solution {
//     public int[] nextGreaterElements(int[] nums) {
//         int arr[] = new int[nums.length];
//         int h = 0;
//         int n = nums.length;
//         boolean fnd = false;
//         for(int i=0;i<nums.length;i++){
//             fnd = false;
//             for(int j = (i+1) % n; j!=i; j =(j+1) % n){
//                 if(nums[j] > nums[i]){
//                     arr[h++] = nums[j];
//                     fnd = true;
//                     break;
//                 }
//             }
//             if(!fnd){
//                 arr[h++] = -1;
//             }
//         }
//         return arr;
//     }
// }

//                      ferquency sort :::

// class Solution {
//     public int[] frequencySort(int[] nums) {
//         HashMap<Integer, Integer> h1 = new HashMap<>();
//         for (int num : nums) {
//             h1.put(num, h1.getOrDefault(num, 0) + 1);
//         }
//         List<Integer> list = new ArrayList<>();
//         for (int num : nums) {
//             list.add(num);
//         }
//         Collections.sort(list, new Comparator<Integer>(){
//             public int compare(Integer a, Integer b){
//                 if (h1.get(a).equals(h1.get(b))) {
//                     return b - a; 
//                 }
//                 return h1.get(a) - h1.get(b);
//             }
//         });
//         for (int i = 0; i < nums.length; i++) {
//             nums[i] = list.get(i);
//         }
//         return nums;
//     }
// }

//                      merge Similar Items

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List <List<Integer>> li = new ArrayList<>();
        HashMap <Integer,Integer> h1 = new HashMap<>();
        for(int i=0; i<items1.length; i++){
            h1.put(items1[i][0],h1.getOrDefault(items1[i][0],0)+items1[i][1]);
        } 
        for(int i=0; i<items2.length; i++){
            h1.put(items2[i][0],h1.getOrDefault(items2[i][0],0)+items2[i][1]);
        }
        for(int num : h1.keySet()){
            ArrayList <Integer> li1 = new ArrayList<>();
            li1.add(num);
            li1.add(h1.get(num));
            li.add(li1);
        }
        li.sort(Comparator.comparingInt(row -> row.get(0)));
        return li;
    }       
}
