
                    //   GFG QUESTION OF QUEUE ::: first negative integer in every window of size k

// class Solution {
//     static List<Integer> firstNegInt(int arr[], int k) {
//        ArrayList <Integer> li = new ArrayList<>();
//        Queue <Integer> q = new LinkedList<>();
//     //   boolean exist = false;
//     //   for(int i=0; i <= arr.length-k; i++){
//     //       exist = false;
//     //       for(int j = i; j < i+k; j++){
//     //           if(arr[j] < 0){
//     //               li.add(arr[j]);
//     //               exist = true;
//     //               break;
//     //           }
//     //       }
//     //       if(!exist){
//     //       li.add(0);
//     //       }
//     //   }
//         for(int i=0;i<arr.length;i++){
//             if(arr[i] < 0){
//                 q.add(i);
//             }
//         }
//         for(int i=0;i<=arr.length-k;i++){
//             if(q.size() != 0 && q.peek()< i) q.remove();
//             if(q.size() != 0 && q.peek()<= i+k-1){
//                 li.add(arr[q.peek()]);
//             }
//             else if(q.size() == 0) li.add(0);
//             else li.add(0);
//         }
//         return li;
//     }
// }


//                                Interleave the First Half of the Queue with Second Half of the Queue      

// import java.util.*;
// class Solution {
//     public Queue<Integer> rearrangeQueue(Queue<Integer> q) {
//         int n = q.size();
//         Queue<Integer> firstHalf = new LinkedList<>();
//         Queue<Integer> secondHalf = new LinkedList<>();
//         for (int i = 0; i < n/2; i++) {
//             firstHalf.add(q.remove());
//         }
//         while (!q.isEmpty()) {
//             secondHalf.add(q.remove());
//         }
//         Queue<Integer> result = new LinkedList<>();
//         while (!firstHalf.isEmpty() && !secondHalf.isEmpty()) {
//             result.add(firstHalf.remove());
//             result.add(secondHalf.remove());
//         }
//         return result;
//     }
// }
