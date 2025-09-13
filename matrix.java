// import java.util.Scanner;
// public class matrix{
// public static int row_sum(int matrix[][]){
//     Scanner sc=new Scanner(System.in);
//     int sum=0;
//     System.out.println("Enter the index of row whose sum u want: ");
//     int rowno=sc.nextInt();
//     for(int i=rowno;i<=rowno;i++){
//         for(int j=0;j<matrix[0].length;j++){
//             sum+=matrix[i][j];
//         }
//     }
//     return sum;
// }
// public static int maxno_row(int matrix[][]){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the index of row whose maximum element u want: ");
//     int rowno=sc.nextInt();
//     int max= matrix[0][0];
//     for(int i=rowno;i<=rowno;i++){
//         for(int j=0;j<matrix[0].length;j++){
//             if(matrix[rowno][j]>max){
//                 max=matrix[rowno][j];
//             }
//         }
//     }
//     return max; 
// }
// public static void main(String args[]){
//     int matrix[][]=new int[3][3];
//     for(int i=0;i<matrix.length;i++){
//         for(int j=0;j<matrix[0].length;j++){
//             Scanner sd = new Scanner(System.in);
//             matrix[i][j] =sd.nextInt();
//         }
//     }
//     for(int i=0;i<matrix.length;i++){
//         for(int j=0;j<matrix[0].length;j++){
//             System.out.print(matrix[i][j]+" "); 
//         }
//         System.out.println();
//     }
//     System.out.println(row_sum(matrix));
//     System.out.println(maxno_row(matrix));
// }
// }

