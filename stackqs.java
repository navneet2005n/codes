import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

//  Remove Consecutive Elements from an Array using Stack

class stackqs{
     public static int[] removeconsseq(int arr[]) {
    int n = arr.length;
    Stack<Integer> s1 = new Stack<>();
    for (int i = 0; i < n; i++) {
        if (s1.size() == 0 || s1.peek() != arr[i]) {
            s1.push(arr[i]);
        } 
        else if (arr[i] == s1.peek()) {
            if (arr[i] != arr[i + 1]) {
                s1.pop();
            }
        }
    }
    int[] res = new int[s1.size()];
    for (int j = s1.size() - 1; j >= 0; j--) {
        res[j] = s1.pop();
    }
    return res;
}

    // Check if the parentheses are valid or not.
    // For example: (())() is valid, )() is not valid, (() is not valid.
     public static boolean validpar(String str){
        Stack <Character> s1 = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '('){
                s1.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')'){
                if(s1.isEmpty()){
                    return false;
                }
                s1.pop();
            }
        }
        return s1.isEmpty();
    }
    
    public static int cn(String str) {
    Stack <Character> s1 = new Stack<>();
    int cnt = 0;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == '(') {
            s1.push(str.charAt(i));
        } 
        else if (str.charAt(i) == ')') {
            if (!s1.isEmpty() && s1.peek() == '(') {
                s1.pop();
            } 
            else {
                cnt++; 
            }
        }
    }
        return cnt + s1.size(); 
    }

    // Next Greater Element ::: (pop res push)

    public static int[] nge(int arr[]){
        int ans[] = new int[arr.length];
        Stack <Integer> s1 = new Stack<>();
        ans[ans.length-1] = -1;
        s1.push(arr[arr.length-1]);
        for(int i = arr.length-2; i>=0; i--){
            while((!s1.isEmpty() &&  arr[i] > s1.peek())){
                s1.pop();
            }
            if(s1.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = s1.peek();
            }
            s1.push(arr[i]);
        }
        return ans;
    }

    // next greater elemeent(2nd method) :::

    public static int[] nge2(int arr[]){
        Stack <Integer> s1 = new Stack<>();
        int res[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!s1.isEmpty() && arr[i] >= arr[s1.peek()]){
                res[s1.peek()] = arr[i];
                s1.pop();
            }
            s1.push(i);
        }
        for(int i=0;i<res.length;i++){
            if(res[i] == 0){
                res[i] = -1;
            }
        }
        return res;
    }

    // Next Smaller Element ::: (pop res push)

    public static int[] nse(int arr[]){
        int res[] = new int[arr.length];
        Stack <Integer> st = new Stack<>();
       for(int i = arr.length-1; i >= 0; i--){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
            st.pop();
        }
        if(st.isEmpty()){
            res[i] = -1;
        }
        else{
            res[i] = st.peek();
        }
        st.push(i);
       }
       return res;
    }

    // Previous Smaller Element ::: (pop res push)
    
    public static int[] pse(int arr[]){
        int res[] = new int[arr.length];
        Stack <Integer> st = new Stack<>(); 
        for(int i = 0; i<arr.length; i++){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }
        if(st.isEmpty()){
            res[i] = -1;
        }
        else{
           res[i] = st.peek(); 
        }
        st.push(i);
        }
        return res;
    }

    // Calculate the span of stock prices
    // The span of stock price today is defined as the maximum number of consecutive days (starting from today and going backwards) for which the price of the stock was less than or equal to today's price.
    
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList <Integer> li = new ArrayList<>();
        Stack <Integer> s1 = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(!s1.isEmpty() && arr[i] >= arr[s1.peek()]){
                s1.pop();
            }
            if(s1.isEmpty()){
                li.add(i+1);
            }
            else{
                li.add(i-s1.peek());
            }
            s1.push(i);
        }
        return li;
    }

    public static int[] ssp(int arr[]){
        Stack<Integer> s1 = new Stack<>();
        int res[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!s1.isEmpty() && arr[i] >= arr[s1.peek()]){
                s1.pop();
            }
            if(s1.isEmpty()){
                res[i] = i+1;
            }
            else{
                res[i] = i - s1.peek();
            }
            s1.push(i);
        }
        return res;
    }
    

    public static void main(String[] args) {
        String str = ")(())()((";
        System.out.println(validpar(str));
        System.out.println(cn(str));
        int arr[] = {1,2,2,3,3,4,5,5,6};
        int arr1[] = removeconsseq(arr);
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

	    int arr2[] = {5,3,8,1,9,10};
	    int result[] = nge(arr2);
	    System.out.println(Arrays.toString(result));
        System.out.println();
        int arr3[] = {100,80,60,70,60,75,85};
        ArrayList<Integer> result1 = new stackqs().calculateSpan(arr3);
        for (int i = 0; i < result1.size(); i++) {
            System.out.print(result1.get(i) + " ");
        }
        System.out.println();
    }
}


