import java.util.Scanner;
public class recursion {
    // public static void printnamentimes(int i,int n){
    //     if(i>n){
    //         return;
    //     }
    //     System.out.println("arun");
    //     printnamentimes(i+1,n);
    // }

    // public static void print1ton(int i,int n){ 
    //     if(i<1){
    //         return;
    //     }
    //     print1ton(i-1,n);
    //     System.out.println(i);
    // }

    // public static void printnto1(int n){
    //     if(n == 0){
    //         return;
    //     }
    //     System.out.println(n);
    //     printnto1(n-1);
    // }

    // public static int sumupton(int n){
    //     int sum = 0;
    //     if(n == 0) {
    //        return 0;
    //     }
    //     sum = sum + n + sumupton(n-1);
    //     return sum;
    // }

    // public static int factorial(int n){
    //     int prod = 1;
    //     if(n == 1 || n == 0){
    //         return 1;
    //     }
    //     prod = n * factorial(n-1); 
    //     return prod;
    // }
    
                            // REVERSE THE ARRAY USING RECURSION :::

    // public static void reverse(int i,int n,int arr[]){
    //     if(i >= n/2){
    //         return;
    //     }
    //     int temp = arr[i];
    //     arr[i] = arr[n-i-1];
    //     arr[n-i-1] = temp;
    //     reverse(i+1,n,arr);
    // }

                      // Palindrome or not given string using recursion :::

    // public static boolean palindrome(int i, int n, String str) {
    //     if (i >= n / 2) {
    //         return true; 
    //     }
    //     if (str.charAt(i) != str.charAt(n - i - 1)) {
    //         return false; 
    //     }
    //     return palindrome(i + 1, n, str); 
    // }
    
   
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        // int n = sc.nextInt();
        // printnamentimes(1,n);
        // print1ton(n, n);
        // printnto1(n);
        // System.out.println(sumupton(10));
        // System.out.println(factorial(5));

        // int arr[] = {1,2,3,4,5,6,7,8,9,10};
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // reverse(0,arr.length,arr);
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }

		String str = "hooh";
		int n = str.length();
		// System.out.print(palindrome(0,n,str));
    }
}
