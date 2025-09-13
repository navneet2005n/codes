public class QuickSort {
    public static int partition(int low, int high,int[] arr) {
        int pivot = arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
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
    
    public static void quickSort(int low,int high,int[] arr){
        if(low < high){
            int pind = partition(low,high,arr);
            quickSort(low, pind, arr);
            quickSort(pind+1, high, arr);
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,6,2,5,7,9,1,3};
        quickSort(0,arr.length-1,arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
