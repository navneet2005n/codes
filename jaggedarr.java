import java.util.Scanner;
public class jaggedarr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of columns in row 1: ");
        int col1=sc.nextInt();
        System.out.println("Enter the number of columns in row 2: ");
        int col2=sc.nextInt();
        System.out.println("Enter the number of columns in row 3: ");
        int col3=sc.nextInt();
        int jaggedarr[][]=new int[3][];
        jaggedarr[0] = new int[col1];
        jaggedarr[1] = new int[col2];
        jaggedarr[2] = new int[col3];
        int arr[]=new int[]{col1,col2,col3};
        System.out.println("Enter the elements of jagged array: ");
        for(int i=0;i<jaggedarr.length;i++){
            for(int j=0;j<arr[i];j++){
                jaggedarr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your Jagged Array is: ");
        for(int i=0;i<jaggedarr.length;i++){
            for(int j=0;j<arr[i];j++){
                System.out.print(jaggedarr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
