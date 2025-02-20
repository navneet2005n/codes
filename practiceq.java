import java.util.Scanner;
public class practiceq {
    public static void ins_srt(int []arr,int n){
        for(int i=1;i<arr.length;i++){
            int j = i;
            while(j>0 && arr[j-1] < arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of players: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the scores of batsmen: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Scores of batsmen are:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        ins_srt(arr, n);
        System.out.println("highest to lowest scores of batsmen: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
