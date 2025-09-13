public class SumOf2DArray {
    public static void sum(int arr[][], int arr1[][]) {
        int sumarr[][] = new int[arr.length][arr[0].length];
        for (int i = 0; i < sumarr.length; i++) {
            for (int j = 0; j<sumarr[0].length; j++) {
                sumarr[i][j] = arr[i][j] + arr1[i][j];
            }
        }
        for (int i=0;i<sumarr.length;i++) {
            for (int j=0;j<sumarr[0].length;j++) {
                System.out.print(sumarr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int mat1[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int mat2[][] = {{3, 4, 5},{6, 7, 8}, {0, 2, 3}};
        sum(mat1, mat2);
    }
}
