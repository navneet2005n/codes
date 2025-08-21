package recursion;

public class file1 {
    public static int sumofn(int n,int sum,int cnt){
        if(cnt > n){
            return sum;
        }
        sum += cnt;
        return sumofn(n, sum, cnt+1);
    }

    public static int[] rev(int arr[],int left,int right){
        if(left > right){
            return arr;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        return rev(arr, left+1, right-1);
    }

    public static boolean pln(String str,int i){
        if(i == str.length()/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            return false;
        }
        return pln(str, i+1);
    }

    public static void main(String[] args) {
    int n = 3;
    System.out.println(sumofn(n,0,0));
    int arr[] = {1,2,3,4,5};
    rev(arr, 0, arr.length-1);
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    String str = "abcba";
    System.out.println(pln(str, 0));
 }
}

