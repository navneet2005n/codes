import java.util.Scanner;
public class twod_arr {
    public static int diag_sum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i == j || i+j == matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static int max(int matrix[][]){
        int max=matrix[0][0];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]>max) {
                    max=matrix[i][j];
                }
            }
        }
        return max;
    }                                                
    public static void boundary_elm(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        for(int j=startcol;j<=endcol;j++){
            System.out.print(matrix[startrow][j]+" ");
        }
        for(int i=startrow+1;i<=endrow;i++){
            System.out.print(matrix[i][endcol]+" ");
        }
        for(int j=endcol-1;j>=startcol;j--){
            System.out.print(matrix[endrow][j]+" ");
        }
        for(int i=endrow-1;i>startrow;i--){
            System.out.print(matrix[i][startcol]+" ");
        }
        System.out.println();
        if (matrix[startrow][startcol] == matrix[endrow][endcol]) {
            return;
        }
    }
    public static void find(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (matrix[i][j] == key) {
                    System.out.println("Element found at"+"("+ i + "," + j +")");
                }                
            }
        }
    }
    public static int sum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    
    public static void spiral(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endcol=matrix[0].length-1;
        int endrow=matrix.length-1;
        while(startrow<=endrow && startcol<=endcol){
            for(int j=startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            for(int j=endcol-1;j>=startcol;j--){
                // if (startrow==endrow) {
                //     break;
                // }
                System.out.print(matrix[endrow][j]+" ");
            }
            for(int i=endrow-1;i>startrow;i--){
                // if(startcol==endcol){
                //     break;
                // }
                System.out.print(matrix[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endrow--;
            endcol--;
        }
    }
    public static void transpose(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your Matrix is: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
             System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Sum of primary and secondary diagonals: ");
        System.out.println(diag_sum(matrix));
        System.out.print("Largest element in the matrix: " );
        System.out.println(max(matrix));
        sc.close();
        System.out.print("Boundary Elements of the matrix: ");
        boundary_elm(matrix);
        find(matrix, 6);
        transpose(matrix);
        System.out.println("Your Matrix after transpose is: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Sum of elements of the matrix is: ");
        System.out.println(sum(matrix));
        System.out.println("Spiral of the matrix is: ");
        spiral(matrix);
    }
}
