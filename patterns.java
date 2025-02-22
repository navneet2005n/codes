import java.util.Arrays;

public class patterns {
    public static void patt1(int n){
        for(int i = n; i >= 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patt2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("* ");
            patt2(r, c + 1);
        } else {
            System.out.println();
            patt2(r - 1, 0);  
        }
    }
     
    public static void bblsort(int arr[],int r,int c){
        if(r == 0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bblsort(arr,r,c+1);
        }
        else{
            bblsort(arr,r-1,0);
        }
    }

    public static void selectionsort(int arr[],int r,int c,int max){
        if(r == 0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                selectionsort(arr, r, c+1, c);
            }
            else{
            selectionsort(arr,r,c+1,max);
        }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
        }
            selectionsort(arr,r-1,0,0);
    }
    public static void main(String args[]){
        // patt1(5);
        int n = 5;
        patt2(n,0);
        int arr[] = {5,4,2,1};
        // bblsort(arr,arr.length-1,0);
        // System.out.println(Arrays.toString(arr));
        selectionsort(arr, arr.length, 0,0);
        System.out.println(Arrays.toString(arr));
    }
}

