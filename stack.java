import java.util.*;

//                                         // using arraylist :::

// public class stack{  
//     public static class Stack2 {
//         static ArrayList<Integer> arr = new ArrayList<>();
//         public static boolean isEmpty() {
//             return arr.size() == 0;
//         }

//         public static void push(int x) {
//             arr.add(x);
//         }

//         public static int pop() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             int head = arr.get(arr.size() - 1);
//             arr.remove(arr.size() - 1);  
//             return head;
//         }

//         public static int peek() {
//             if (isEmpty()) {
//                 return -1;  
//             }
//             return arr.get(arr.size() - 1);
//         }
//     }

//     public static void main(String[] args) {
//         Stack2 s = new Stack2();
//         s.push(10);
//         s.push(20);
//         s.push(30);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek()); 
//             s.pop();
//         }
//     }
// }

