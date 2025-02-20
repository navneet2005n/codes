import java.util.ArrayList;
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
    // public static void oneton(int n){
    //     if(n == 0){
    //         return;
    //     }
    //     oneton(n-1);
    //     System.out.print(n+" ");
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
    
                    // SubSequences of an array ::::

    //  public static void printF(int ind, ArrayList<Integer> a1, int arr[], int n) {
    //     if (ind == n) {
    //         if (a1.isEmpty()) {
    //             System.out.println("{}"); 
    //         } else {
    //             for (int num : a1) {
    //                 System.out.print(num + " ");
    //             }
    //             System.out.println();
    //         }
    //         return;
    //     }
    //     a1.add(arr[ind]);
    //     printF(ind + 1, a1, arr, n);
    //     a1.remove(a1.size() - 1);
    //     printF(ind + 1, a1, arr, n);
    // }
 
                    //  SUM OF DIGITS ::::
    
    public static int sumofdigits(int n){
        if(n == 0){
            return 0;
        }
        return n % 10 + sumofdigits(n / 10);
    }

                        //  PRODUCT OF DIGITS :::
                        
    public static int prodofdig(int n){
        if(n % 10  == n){
            return n;
        }
        return n % 10 * prodofdig(n / 10);
    }


                    //  REVERSE A NUMBER :::

    public static int rev(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }
        return rev(n / 10, reversed * 10 + n % 10);
    }

                    //  COUNT ZEROES :::

    public static int cntzeros(int n, int cnt){
        if(n == 0){
             return cnt;
        }
        if(n % 10 == 0){
         cnt++;
        }
        return cntzeros(n/10 , cnt);
    }

                    //  COUNT DIGITS :::

     public static int cntdig(int n, int cn){
        if(n == 0){
        return cn;
        }
    return cntdig(n/10 , ++cn);  
    }
                    
        //  COUNT STEPS :::

    public static int cntsteps(int n, int cnt){
        if(n == 0){
        return cnt;
        }
        if(n % 2 == 0){
         return cntsteps(n/2 , ++cnt);
     }
        else if(n % 2 != 0){
             return cntsteps(n-1 , ++cnt);
        }
        return 0;
    }   

    // ARRAY IS SORTED OR NOT :::

    public static boolean sorornot(int arr[] , int i){
        if(i >= arr.length){
            return true;
        }
        if( arr[i-1] > arr[i]){
            return false;
        }
        return sorornot(arr,i+1);
    }    

    // SEARCH AN ELEMENT IN AN ARRAY :::

    public static int srch(int arr[],int el,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == el){
            return i;
        }
        return srch(arr,el,i+1);
    }

        // SEARCH AN ELEMENT (multiple indexes) IN AN ARRAY :::

        public static ArrayList allind(int arr[],int el,int i,ArrayList<Integer>l1){
            if(i == arr.length){
                return l1;
            }
            if(arr[i] == el){
                l1.add(i);
            }
            return allind(arr,el,i+1,l1);
        }

    //  MAIN FUNCTION :::

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int arr[]  = {3,4,4,5,7};
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

		// String str = "hooh";
		// int n = str.length();
		// System.out.print(palindrome(0,n,str));


        // ArrayList<Integer> a1 = new ArrayList<>();
        // printF(0, a1, arr, arr.length);
        // int n = 14;
        // System.out.println(sumofdigits(n));
        // System.out.println(prodofdig(n));
        // System.out.println(rev(n,0));
        // System.out.println(cntzeros(n,0));
        // System.out.println(cntdig(n,0));
        // System.out.println(cntsteps(n,0));
        // System.out.println(sorornot(arr,1));
        // System.out.println(srch(arr,3,0));
        ArrayList<Integer> k1 = new ArrayList<>();
        System.out.print(allind(arr,4,0,k1));

    }
}
