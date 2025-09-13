class matrix
{
    public static void spiral(int matrix[][]){
        int strow = 0;
        int strcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;
        while(strow<=endrow && strcol<=endcol){
            for(int j = strcol; j<=endcol; j++){
                System.out.print(matrix[strow][j]+" ");
            }
            strow++;
            for(int i = strow; i <= endrow; i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            endcol--;
            if(strow <= endrow){
            for(int j = endcol; j>=strcol; j--){
                System.out.print(matrix[endrow][j]+" ");
            }
            endrow--;
            }
            if(strcol <= endcol){
            for(int i = endrow; i>=strow; i--){
                System.out.print(matrix[i][strcol]+" ");
            }
            strcol++;
            }
        }
    }
    
    public static void spiral2(int matrix[][]){
        int strow = 0;
        int strcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;
        
        while(strow <= endrow && strcol <= endcol){
            for(int i=strow; i<=endrow; i++){
                System.out.print(matrix[i][strcol]+" ");
            }
            strcol++;
            
            for(int i=strcol; i <= endcol; i++){
                System.out.print(matrix[endrow][i]+" ");
            }
            endrow--;
            
            if(strcol <= endcol){
            for(int i = endrow; i >= strow; i--){
                System.out.print(matrix[i][endcol]+" ");
            }
            endcol--;
            }
            if(strow <= endrow){
               for(int i = endcol; i >= strcol; i--){
                System.out.print(matrix[strow][i]+" ");
            } 
            strow++;
            }
        }
    }
    
    public static void transpose(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                 matrix[i][j] =  matrix[j][i];
                  matrix[j][i] = temp;
            }
        }
    }
    
	public static void main(String[] args) {
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<matrix.length;i++){
		    for(int j=0;j<matrix[0].length;j++){
		        System.out.print(matrix[i][j]+" ");
		    }
		    System.out.println();
		}
// 	 System.out.println();
//      spiral(matrix);
	 System.out.println();
//      spiral2(matrix);
     transpose(matrix);
     	for(int i=0;i<matrix.length;i++){
		    for(int j=0;j<matrix[0].length;j++){
		        System.out.print(matrix[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}