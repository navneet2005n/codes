// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();  
//         int[][] arr = new int[n][n];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         rotateMatrix(arr, n);
//         printMatrix(arr);
//     }

//     public static void rotateMatrix(int[][] arr, int n) {
//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 int temp = arr[i][j];
//                 arr[i][j] = arr[j][i];
//                 arr[j][i] = temp;
//             }
//         }
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n / 2; j++) {
//                 int temp = arr[i][j];
//                 arr[i][j] = arr[i][n - 1 - j];
//                 arr[i][n - 1 - j] = temp;
//             }
//         }
//     }
//     public static void printMatrix(int[][] arr) {
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[0].length;j++){
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//             }
//         }
//     }
