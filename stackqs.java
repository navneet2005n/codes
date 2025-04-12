import java.util.HashMap;
import java.util.Stack;

class stackqs{
    public static int[] removeconsseq(int arr[]){
        HashMap<Integer,Integer> h1 = new HashMap<>();
        int cnt = 0;
        for(int num : arr){
            h1.put(num , h1.getOrDefault(num,0)+1);
        }
        for(int num : h1.keySet()){
            if(h1.get(num) == 1){
                cnt++;
            }
        }
        int arrr[] = new int[cnt];
        int l = 0;
        for(int num : h1.keySet()){
            if(h1.get(num) == 1){
                arrr[l++] = num;
            }
        }
        return arrr;
    }

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
    }
}