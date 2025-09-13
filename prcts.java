import java.util.*;
public class prcts {
    // public static String comp(String str) {
    //     StringBuilder st = new StringBuilder();
    //     boolean anyCompressed = false;
    //     int i = 0;
    //     while (i < str.length()) {
    //         char ch = str.charAt(i);
    //         int cnt = 1;
    //         i++;
    //         while (i < str.length() && str.charAt(i) == ch) {
    //             cnt++;
    //             i++;
    //         }
    //         st.append(ch);
    //         if (cnt > 1) {
    //             st.append(cnt);
    //             anyCompressed = true;
    //         } else {
    //             st.append("1"); 
    //         }
    //     }
    //     if (!anyCompressed) {
    //         return str;
    //     }
    //     return st.toString();
    // }

    // public static void main(String[] args) {
    //     String str1 = "abbbcccd";
    //     System.out.println(comp(str1));  
    //     String str2 = "abcdef";
    //     System.out.println(comp(str2));  
    // }

    public static int fib(int n){
        if(n == 1) return 1;
        if(n == 0) return 0;
        return fib(n-1) + fib(n-2);
    }

    public static void generateSubsequences(int[] arr, int index, List<Integer> current) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        current.add(arr[index]);
        generateSubsequences(arr, index + 1, current);

        current.remove(current.size() - 1);
        generateSubsequences(arr, index + 1, current);
    }

    public static void sumsbsq(int arr[],int k,int sum,int index,ArrayList<Integer>curr){
         if (index == arr.length) {
            if (sum == k) {
                System.out.println(curr);
            }
            return;
        }

        curr.add(arr[index]);
        sum += arr[index];
        sumsbsq(arr, k, sum, index+1, curr);

        curr.remove(curr.size()-1);
        sum -= arr[index];
        sumsbsq(arr, k, sum, index+1, curr);
    }

    public static int cntsbsqwithsumk(int arr[],int index,int k,int sum){
        if(index == arr.length){
            if(sum == k) return 1;
            else return 0;
        }
        sum += arr[index];
        int l = cntsbsqwithsumk(arr, index+1, k, sum);

        sum -= arr[index];
        int r = cntsbsqwithsumk(arr, index+1, k, sum);
        return l+r;
    }

    public static int partition(int low,int high,int arr[]){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=pivot && i<=high){
                i++;
            }
            while(arr[j]>pivot && j>=low){
                j--;
            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void quicksort(int low,int high,int arr[]){
        if(low < high){
            int partind = partition(low,high,arr);
            quicksort(low,partind-1,arr);
            quicksort(partind+1,high,arr);
        }
    }

    public static int[] mergesort(int arr[]){
        if(arr.length == 1) return arr;
        int mid = arr.length/2;
        int left[] = mergesort(Arrays.copyOfRange(arr,0, mid));
        int right[] = mergesort(Arrays.copyOfRange(arr,mid, arr.length));
        return merge(left,right);
    }

    public static int[] merge(int left[],int right[]){
        int i=0,j=0,k=0;
        int result[] = new int[left.length + right.length];
        while(i < left.length && j <right.length){
            if(left[i]<=right[j]){
                result[k++] = left[i++];
            }
            else{
                result[k++] = right[j++];
            }
        } 
        while(i < left.length){
            result[k++] = left[i++];
        }
        while(j < right.length){
            result[k++] = right[j++];
        }
        return result;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Which fibo number u want?  ");
        // int n = sc.nextInt();
        // sc.close();
        // System.out.println(fib(n));

        // int[] arr = {3,1,2};
        // System.out.println("All subsequences of array: " + Arrays.toString(arr));
        // generateSubsequences(arr, 0, new ArrayList<>());
        
        // int arr2[] = {1,5,1};
        // sumsbsq(arr2,5,0,0,new ArrayList<>());

        // int arr3[] = {2,4,2};
        // System.out.println(cntsbsqwithsumk(arr3,0,4,0));

        // int arr3[] = {3,1,5,2,4,8};
        // arr3 = mergesort(arr3);
        // System.out.println(Arrays.toString(arr3));

        int arr4[] = {3,2,1,5,6,3,8};
        quicksort(0, arr4.length-1, arr4);
        System.out.println(Arrays.toString(arr4));
    }
}
