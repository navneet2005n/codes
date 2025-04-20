// import java.util.Stack;
// import java.util.Arrays;
// class Solution {
//     public static int[] nse(int arr[]){
//        int res[] = new int[arr.length];
//        Stack <Integer> st = new Stack<>();
//       for(int i = arr.length-1; i >= 0; i--){
//            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
//            st.pop();
//        }
//        if(st.isEmpty()){
//            res[i] = arr.length;
//        }
//        else{
//            res[i] = st.peek();
//        }
//        st.push(i);
//       }
//       return res;
//    }

//    public static int[] pse(int arr[]){
//        int res[] = new int[arr.length];
//        Stack <Integer> st = new Stack<>(); 
//        for(int i = 0; i<arr.length; i++){
//            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
//                st.pop();
//            }
//        if(st.isEmpty()){
//            res[i] = -1;
//        }
//        else{
//           res[i] = st.peek(); 
//        }
//        st.push(i);
//        }
//        return res;
//    }

   
//    public int largestRectangleArea(int[] heights) {
//        int nse1[] = nse(heights);
//        int pse2[] = pse(heights);
//        int max = -1;
//        for(int i=0;i<heights.length;i++){
//            int area = heights[i] * (nse1[i] - pse2[i] - 1);
//            max = Math.max(max,area);
//        }
//        return max;
//    }
// }

