public class spiral {
    public static void spiral(int matrix[][]){
        int strrow = 0;
        int strcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;
        while(strrow <= endrow && strcol <= endcol){
            for(int i = strrow; i<=endrow; i++){
                System.out.print(matrix[i][strcol]+" ");
            }
            strcol++; 
            for(int j = strcol ; j<=endcol; j++){
                System.out.print(matrix[endrow][j]+" ");
            } 
            endrow--;
            if(strcol <= endcol){
                for(int i = endrow; i>=strrow; i--){
                System.out.print(matrix[i][endcol]+" ");
                }
            } 
            endcol--;
             if(strrow <= endrow){
                for(int j = endcol ; j>=strcol; j--){
                System.out.print(matrix[strrow][j]+" ");
                }
            }
            strrow++;
        }
    }

                    // Another spiral way to solve the same problem ::::

    public static void spiral2(int matrix[][]){
        int strrow = 0;
        int strcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;
        while(strrow <= endrow && strcol <= endcol){
            for(int i = strcol; i <= endcol; i++){
                System.out.print(matrix[strrow][i]+" ");
            }
            strrow++;
            for(int j = strrow; j<=endrow; j++){
                System.out.print(matrix[j][endcol]+" ");
            }
            endcol--;
            if(strrow <= endrow){
                for(int i = endcol; i>=strcol; i--){
                System.out.print(matrix[endrow][i]+" ");
                }
            }
            endrow--;
             if(strcol <= endcol){
                for(int j = endrow ; j>=strrow; j--){
                System.out.print(matrix[j][strcol]+" ");
                }
            }
            strcol++;
        }
    }
	public static void main(String[] args) {
         int matrix[][] = {{1,2,3,4},
                           {4,5,6,5},
                           {7,8,9,7}};
         spiral(matrix); 
         System.out.println();
         spiral2(matrix);  
	}
}