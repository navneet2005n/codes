import java.util.Scanner;
public class pdf2darrq {
    public static int maximum(int matrix[][]){
        int max=matrix[0][0];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
        }
        return max;
    }

    public static void transpose(int matrix[][]){ 
        int rows = matrix.length;
        int cols = matrix[0].length;
        int transpose_matrix[][]=new int[cols][rows];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transpose_matrix[i][j]=matrix[j][i];
            }
        }
        for(int i=0;i<transpose_matrix.length;i++){
            for(int j=0;j<transpose_matrix[0].length;j++){
                System.out.print(transpose_matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int row_sum(int matrix[][]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the row whose sum u want: ");
        int row=sc.nextInt();
        int sum=0;
        for(int i=row-1;i<row;i++){
            for(int j=0;j<matrix[0].length;j++){
                sum+=matrix[i][j];
            }
        }
        return sum;
    }

    public static int col_sum(int matrix[][]){
        Scanner sc= new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the column whose sum u want: ");
        int col=sc.nextInt();
        for(int i=0;i<matrix.length;i++){
            for(int j=col-1;j<col;j++){
                sum+=matrix[i][j];
            }
        }
        return sum;
    }

    public static void spiral(int matrix[][]){
        int startcol=0;
        int startrow=0;
        int endcol=matrix[0].length-1;
        int endrow=matrix.length-1;
        while(startrow<=endrow && startcol<=endcol){
            // top :
                for(int j=startcol;j<=endcol;j++){
                    System.out.print(matrix[startrow][j]+" ");
            }
            // right:
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            // bottom:
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            // left:
            for(int i=endrow-1;i>startrow;i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
    }

    public static void bndry_ele(int matrix[][]){
        int startcol=0;
        int startrow=0;
        int endcol=matrix[0].length-1;
        int endrow=matrix.length-1;
        while(startrow<=endrow && startcol<=endcol){
            // top :
                for(int j=startcol;j<=endcol;j++){
                    System.out.print(matrix[startrow][j]+" ");
            }
            // right:
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            // bottom:
            for(int j=endcol-1;j>=startcol;j--){
                System.out.print(matrix[endrow][j]+" ");
            }
            // left:
            for(int i=endrow-1;i>startrow;i--){
                System.out.print(matrix[i][startcol]+" ");
            }
            break;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of Columns: ");
        int cols = sc.nextInt(); 
        int matrix[][]=new int[rows][cols];
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
        System.out.println("Maximum element is: ");
        System.out.println(maximum(matrix));
        // System.out.println("Transpose of matrix is: ");
        // transpose(matrix);
        System.out.println(row_sum(matrix));
        System.out.println(col_sum(matrix));
        System.out.println("Boundary element are: ");
        bndry_ele(matrix);
        System.out.println();
        System.out.println("Spiral of matrix is: ");
        spiral(matrix);
    }
}
