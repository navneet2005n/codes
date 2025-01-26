import java.util.Arrays;
import java.util.Scanner;
public class classquest {

    public static void move_zeroes(int arr[]) {
        int k=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                arr[k]=arr[i];
                k++;
            }
        }
        for (int i=k;i<arr.length;i++) {
            arr[i]=0;
        }
    }

    public static void reverse_arr(int arr[]) {
        for (int i = arr.length-1 ; i >=0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean duplicate_chk(int arr[]){
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                return true;
            }
        }
        return false;
    }

    public static void copy(){
        int arr[]=new int[]{2,1,3};
        int arr2[]=new int[arr.length];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=arr[i];
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }
    
    public static int duplicate_ele(int arr[]){
        Arrays.sort(arr);
        int ans = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1] == arr[i]){
                ans=arr[i];
            }
        }
        return ans;
    }

    public static void split(int arr[]){
        int cnt=0;
        int e =0;
        int o=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                cnt++;
            }
        }
        int arr1[]=new int[cnt];
        int arr2[]=new int[arr.length-cnt];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr1[e]=arr[i];
                e++;
            }
            else{
                arr2[o]=arr[i];
                o++;
            }
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int arr_len = sc.nextInt();
        int arr[] = new int[arr_len];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your Array is: ");
        print(arr);
        // System.out.println("Array after moving zeroes: ");
        // move_zeroes(arr);
        // print(arr); 
        System.out.println("Reverse of the array is: ");
        reverse_arr(arr);
        // System.out.println(duplicate_chk(arr));
        // System.out.println(duplicate_ele(arr));
        split(arr);
    }
}
