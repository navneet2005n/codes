public class binarysrch {
    public static int index(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
            end = mid-1;
        }
        else if(arr[mid] < target){
            start = mid+1;
        }
            return -1;
    }
    public static void main(String args[]){
        int target  =  123;
        int arr[]= {10,65,23,45,67};
        System.out.println(index(arr, target));
    }
}


