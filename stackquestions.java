import java.util.*;
// public class stackquestions {
//     public static void nge(int arr[]) {
//         Stack<Integer> s1 = new Stack<>();
//         int ans[] = new int[arr.length];
//         for (int i = arr.length - 1; i >= 0; i--) {
//             while (!s1.isEmpty() && arr[i] >= s1.peek()) {
//                 s1.pop();
//             }
//             if (s1.isEmpty()) {
//                 ans[i] = -1;
//             } 
//             else {
//                 ans[i] = s1.peek(); 
//             }
//             s1.push(arr[i]);
//         }   
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(ans[i]+" ");
//         }
//     }

//     public static void main(String[] args){
//         int arr[] = {2, 1, 4, 5, 8};
//         nge(arr);
//         // System.out.print(Arrays.toString(arr));
//     }
// }

public class stackquestions
{

    public static void printrevstk(Stack <Integer> s1){
        if(s1.size() == 0){
            return;
        }
        System.out.print(s1.pop() + " ");
        printrevstk(s1);
    }
    
    public static void printstk(Stack <Integer> s1){
        if(s1.size() == 0){
            return;
        }
        int top = s1.pop();
        printstk(s1);
        System.out.print(top + " ");
    }

    public static void pushatlast(Stack <Integer> s1 , int i){
        if(s1.size() == 0){
            s1.push(i);
            return;
        }
        s1.pop();
        pushatlast(s1,i);
    }
    
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int c = sc.nextInt();
            s1.push(c);
        }
        System.out.println(s1);
        while(s1.size()>0){
            s2.push(s1.pop());
        }
        System.out.println(s2);
        // System.out.println("enter the value u want to insert last of the stack: ");
        // int s = sc.nextInt();
        // s3.push(s);
        System.out.println("enter the index where u want to insert value of the stack: ");
        int n1 = sc.nextInt();
        System.out.println("enter the value u want to insert at that index of the stack: ");
        int u = sc.nextInt();
        int cnt = 0;
        if(n1 == 0){
            s3.push(u);
        while(s2.size() > 0){
        s3.push(s2.pop());
        }
        }
        while(s2.size() > 0){
        cnt++;
         s3.push(s2.pop());
        if(cnt == n1){
            s3.push(u);
        }
    }
    //     while(s2.size() > 0){
    //         s3.push(s2.pop());
    //     }
        System.out.println(s3);
	}
}