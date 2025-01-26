import java.util.ArrayList;
import java.util.Scanner;
public class questions {
    public static ArrayList<Integer> find(int arr[],int key){
        ArrayList <Integer> l1=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(key == arr[i]){
                l1.add(i);
           }
        }
        return l1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[4];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the Element whose indexes u want");
        int key=sc.nextInt();
        System.out.println(find(arr, key));
        sc.close();
    }
}


