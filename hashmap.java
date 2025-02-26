// import java.util.*;
// class Main {
//     public static int maxfreq(int arr[]){
//         int max = 0;
//         int maxcount = 0;
//         HashMap <Integer,Integer> h1 = new HashMap<>();
//         for(int num : arr){
//             h1.put(num,h1.getOrDefault(num,0)+1);
//         }
//         for(int i=0;i<arr.length;i++){
//             if(h1.get(arr[i]) > maxcount){
//                 maxcount = h1.get(arr[i]);
//                 max = arr[i];
//             }
//         }
//         return max;
//     }
//     public static void main(String args[]){
//         int arr[]= {1,2,2,3,3,3,3,3,4,4,4,4};
//         System.out.println(maxfreq(arr));
//     }
// }
