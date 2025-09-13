import java.util.Scanner;
import java.util.Arrays;
public class binary_search {
    public static int index(int arr[],int element){
        Arrays.sort(arr);
        int start=0;
        int end = arr.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(arr[mid]==element){
                return mid;
            }
            else if(arr[mid]>element){
                end = mid-1;
            }
            else if(arr[mid]<element){
                start = mid+1;
            }
        }
        return start;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int len=sc.nextInt();
        int arr[]=new int[len];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element whose index u want: ");
        int element = sc.nextInt();
        System.out.println("Index of " + element +" is: " + index(arr, element));
    }
}
